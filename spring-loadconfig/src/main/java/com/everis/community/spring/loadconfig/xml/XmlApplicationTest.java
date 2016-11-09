package com.everis.community.spring.loadconfig.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.everis.community.spring.loadconfig.beans.TestBean;

public class XmlApplicationTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		TestBean testBean = context.getBean(TestBean.class);
		Assert.notNull(testBean);
	}
}
