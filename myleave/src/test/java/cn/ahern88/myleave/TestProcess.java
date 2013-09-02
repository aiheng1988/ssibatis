package cn.ahern88.myleave;

import junit.framework.Assert;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.test.ActivitiRule;
import org.activiti.engine.test.Deployment;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml", "/applicationContext-test.xml"})
public class TestProcess {
	
	@Autowired
	private RuntimeService runtimeService;
	
	@Autowired
	@Rule
	public ActivitiRule activitiRule;
	
	@Test
	@Deployment(resources={"processes/MyProcess.bpmn20.xml"})
	public void testProcess(){
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("financialReport");
		Assert.assertNotNull(processInstance);
	}

}
