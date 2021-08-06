package com.rizalpurnama.belajar.spring.belajarspring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("permissionCheck")
public class PermissionCheck implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("\'Permission Checking\'  on method : " + invocation.getMethod().getName());

        Object result = invocation.proceed();

        return result;
    }
}
