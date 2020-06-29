package com.sba;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Authentication implements MethodBeforeAdvice{

	@Override
	public void before(Method m, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Authentication Completed "+m.getName());
	}
	

}
