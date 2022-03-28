package cn.joss.test;

import cn.joss.test.annotation.DemoService;
import cn.joss.test.annotation.TestConfig;
import cn.joss.test.xml.TestBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sadwx on 17/4/19.
 */
public class BeanFactoryTest {

	private static Class<?> CLAZZ = BeanFactoryTest.class;

	@Test
    public void annotationConfig(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
		DemoService demoService = applicationContext.getBean(DemoService.class);
		System.out.println(demoService);
	}
	@Test
	public void xmlFactory(){
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean = beanFactory.getBean(TestBean.class);
        System.out.println(testBean.getName());
	}
}
