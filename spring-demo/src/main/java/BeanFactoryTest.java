import customtag.User;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import test.TestBean;

/**
 * Created by sadwx on 17/4/19.
 */
public class BeanFactoryTest {

	public static void main(String[] args) {

        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        User user = (User) beanFactory.getBean("user");
//        System.out.println(user.getName()+user.getEmail());

        TestBean testBean = beanFactory.getBean(TestBean.class);
        System.out.println(testBean.getName());
    }
}
