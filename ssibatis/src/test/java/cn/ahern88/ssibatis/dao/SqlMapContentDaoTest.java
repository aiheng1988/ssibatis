package cn.ahern88.ssibatis.dao;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ahern88.ssibatis.entity.Content;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml", "/applicationContext-test.xml"})
public class SqlMapContentDaoTest {
	
	@Autowired
	private SqlMapContentDao sqlMapContentDao;
	
	private Content content;
	
	@Before
	public void setUp(){
		content = new Content();
		content.setTitle("test title");
		content.setUrl("http://www.ahern88.cn");
		content.setEmail("ahern88@163.com");
		content.setDate(new Date());
		content.setContent("test content");
		Integer result = sqlMapContentDao.insertContent("content.insertContent", content);
		Assert.assertNotNull(result);
	}
	
	@Test
	public void testQueryContentById(){
		Content con = sqlMapContentDao.queryContentById("content.queryContentById", content);
		Assert.assertNotNull(con);
		Assert.assertEquals(content.toString(), con.toString());
	}
	
	@Test
	public void testQueryAllContent(){
		List<Content> cons = sqlMapContentDao.queryAllContent("content.queryAllContent");
		Assert.assertTrue(cons.size() > 0);
	}
	
	@Test
	public void testUpdateContent(){
		content.setTitle("updated title");
		content.setUrl("http://ahern88.cn");
		content.setContent("updated content");
		content.setEmail("66429174@qq.com");
		content.setDate(new Date());
		boolean result = sqlMapContentDao.updateContent("content.updateContent", content);
		Assert.assertTrue(result);
		Content con = sqlMapContentDao.queryContentById("content.queryContentById", content);
		Assert.assertEquals(content.toString(), con.toString());
	}

	@After
	public void tearDown(){
		if(content.getId() > 0){
			boolean result = sqlMapContentDao.deleteContentById("content.deleteContentById", content);
			Assert.assertTrue(result);
		}
	}

}
