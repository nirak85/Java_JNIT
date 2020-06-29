package com.sba;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class Logging implements AfterReturningAdvice  {

	@Override
	public void afterReturning(Object arg0, Method m, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Logging info is taken to "+m.getName());
	}
	

}
