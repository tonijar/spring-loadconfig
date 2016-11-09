package com.everis.community.spring.loadconfig.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

import com.everis.community.spring.loadconfig.beans.TestBean;

@Configuration
@ComponentScan(basePackages = "com.everis.community.spring.loadconfig.beans")
public class AnnotationApplicationTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationApplicationTest.class);
		TestBean testBean = context.getBean(TestBean.class);
		Assert.notNull(testBean);
	}
}
