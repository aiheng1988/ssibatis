package cn.ahern88.ssibatis.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.ahern88.ssibatis.commons.Page;
import cn.ahern88.ssibatis.entity.Content;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml", "/applicationContext-test.xml"})
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)
@Transactional
public class ContentServiceTest {
	
	@Autowired
	private ContentService contentService;
	private List<Content> contents = new ArrayList<Content>();
	private int size = 0;
	
	@BeforeTransaction
	public void beforeTx(){
		System.out.println("------begin transaction-------");
		Assert.assertEquals(0, contents.size());
		size = contentService.getCount();
	}
	
	@Before
	public void setUp(){
		for(int i = 0; i < 15; i++){
			Content content = new Content();
			content.setTitle("test title " + i);
			content.setUrl("http://www.ahern88.cn " + i);
			content.setEmail("ahern88@163.com " + i);
			content.setDate(new Date());
			content.setContent("test content " + i);
			int res = contentService.insert(content);
			Assert.assertTrue(res > 0);
			contents.add(content);
		}
	}
	
	@Test
	public void testCount(){
		int count = contentService.getCount();
		Assert.assertTrue(count >= 15);
	}
	
	@Test
	public void testDelete(){
		for(int i = 0; i < 15; i++){
			boolean res = contentService.deleteById(contents.get(i).getId());
			Assert.assertTrue(res);
		}
	}
	
	@Test
	public void testGetContentsByPage(){
		Page page = new Page(2, contentService.getCount(), "http://www.ahern88.cn");
		List<Content> cons = contentService.getContentsByPage(page);
		Assert.assertEquals(5, cons.size());
		Assert.assertEquals("test title 9", cons.get(0).getTitle());
	}
	
	@AfterTransaction
	public void afterTx(){
		System.out.println("-----end transaction-----");
		int nowsize = contentService.getCount();;
		Assert.assertEquals(size, nowsize);
	}

}
