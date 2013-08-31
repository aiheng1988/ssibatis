package cn.ahern88.ssibatis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class ContentTest {
	
	private Content content;
	
	private static Date DATE = new Date(); 
	
	@Before
	public void setUp(){
		content = new Content(1);
		content.setTitle("test title");
		content.setUrl("http://www.ahern88.cn");
		content.setEmail("ahern88@163.com");
		content.setDate(DATE);
		content.setContent("test content");
	}
	
	@Test
	public void testToString(){
		String str = content.toString();
		String expected = "[id:1, title:test title, content:test content, date:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(DATE) + "]";
		Assert.assertEquals(expected, str);
	}

}
