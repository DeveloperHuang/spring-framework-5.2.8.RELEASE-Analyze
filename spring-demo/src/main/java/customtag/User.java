package customtag;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by HuangJianQiu on 2018-6-15.
 */
public class User implements
		BeanNameAware, BeanFactoryAware,ApplicationContextAware,
		BeanPostProcessor,
		InitializingBean,
		DisposableBean {

    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory.getClass().getName());
    }

    public void setBeanName(String name) {
        System.out.println(name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    //BeanPostProcessor
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    /**
     * Interface to be implemented by beans that need to react once all their
     * properties have been set by a BeanFactory: for example, to perform custom
     * initialization, or merely to check that all mandatory properties have been set.
     *
     * <p>An alternative to implementing InitializingBean is specifying a custom
     * init-method, for example in an XML bean definition.
     * For a list of all bean lifecycle methods, see the BeanFactory javadocs.
     *
     */
    public void afterPropertiesSet() throws Exception {

    }

    //DisposableBean
    public void destroy() throws Exception {

    }
}
