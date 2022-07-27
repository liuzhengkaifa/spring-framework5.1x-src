package com.lz.coder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author liuzheng
 * @date 2022年07月26日 9:41
 * @Description
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor(){
		System.out.println("MyBeanPostProcessor……构造函数");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("userBean".equals(beanName)){
			System.out.println("BeanPostProcessor实现类MyBeanPostProcessor……postProcessBeforeInitialization方法调用中");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("userBean".equals(beanName)){
			System.out.println("BeanPostProcessor实现类MyBeanPostProcessor……postProcessBeforeInitialization方法调用中");
		}
		return bean;
	}

}
