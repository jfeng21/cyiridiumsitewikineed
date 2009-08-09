package onlyfun.caterpillar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SpringDemo2 {

	public static void main(String[] args) {
		Resource rs = new FileSystemResource("beans-config.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		Business business = (Business) factory.getBean("business");
		business.save();
	}

}