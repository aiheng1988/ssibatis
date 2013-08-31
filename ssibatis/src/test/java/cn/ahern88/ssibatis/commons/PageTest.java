package cn.ahern88.ssibatis.commons;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PageTest {
	
	private Page page;
	
	@Before
	public void setUp(){
		page = new Page(1, 24, "http://www.ahern88.cn");
	}
	
	@Test
	public void testTotalpage(){
		int totalpage = page.getTotalpage();
		Assert.assertEquals(5, totalpage);
	}
	
	@Test
	public void testGetUrl(){
		String url = page.getUrl();
		Assert.assertEquals("http://www.ahern88.cn?", url);
		page = new Page(1, 24, "http://www.ahern88.cn?id=2");
		url = page.getUrl();
		Assert.assertEquals("http://www.ahern88.cn?id=2&", url);
		page = new Page(1, 24, "http://www.ahern88.cn?page=2");
		url = page.getUrl();
		Assert.assertEquals("http://www.ahern88.cn?", url);
	}
	
	@Test
	public void testPage(){
		String res = page.page();
		System.out.println(res);
		Assert.assertNotNull(res);
	}
	
}
