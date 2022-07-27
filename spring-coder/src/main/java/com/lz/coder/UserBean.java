package com.lz.coder;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author liuzheng
 * @date 2022年07月26日 9:37
 * @Description
 */
public class UserBean implements InitializingBean {

	/**
	 * 构造函数
	 */
	public UserBean(){
		System.out.println("UserBean……构造函数");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("UserBean……afterPropertiesSet……");
	}
}
