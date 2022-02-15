package customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by HuangJianQiu on 2018-6-15.
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
