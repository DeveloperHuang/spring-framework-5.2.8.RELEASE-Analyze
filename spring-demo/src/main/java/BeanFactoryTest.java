import cn.joss.test.annotation.DemoService;
import cn.joss.test.annotation.TestConfig;
import cn.joss.test.xml.TestBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by sadwx on 17/4/19.
 */
public class BeanFactoryTest {

	public static void main(String[] args) {
//		annotationConfig();
		xmlFactory();
//
    }

    public static void annotationConfig(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
		DemoService demoService = applicationContext.getBean(DemoService.class);
		System.out.println(demoService);
	}

	public static void xmlFactory(){
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

        TestBean testBean = beanFactory.getBean(TestBean.class);
        System.out.println(testBean.getName());
	}
}
