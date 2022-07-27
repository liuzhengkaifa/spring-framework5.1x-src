package com.lz.coder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author liuzheng
 * @date 2022年07月26日 9:45
 * @Description
 */
public class BeanFactoryPostProcessor implements org.springframework.beans.factory.config.BeanFactoryPostProcessor {

	public BeanFactoryPostProcessor(){
		System.out.println("BeanFactoryPostProcessor构造方法调用中");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("postProcessBeanFactory方法调用中……");
	}
}
