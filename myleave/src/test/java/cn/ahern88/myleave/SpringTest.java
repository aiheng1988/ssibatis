package cn.ahern88.myleave;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml", "/applicationContext-test.xml"})
public class SpringTest {
	
	@Autowired
	private cn.ahern88.myleave.Test test;
	
	@Test
	public void testSpring(){
		Assert.assertEquals(11, test.add(5, 6));
	}

}
