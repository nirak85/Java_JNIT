package com.sba;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AuthLog implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation m) throws Throwable {
		System.out.println("Authentication Completed");
		Object obj= m.proceed();
		System.out.println("Logging information is verified");
		return obj;
	}

}
