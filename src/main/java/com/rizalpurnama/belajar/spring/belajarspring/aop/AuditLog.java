package com.rizalpurnama.belajar.spring.belajarspring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("auditLog")
public class AuditLog implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object hasil = invocation.proceed();

        Date now = new Date();
        System.out.println("\'audit log : \' method " +
                invocation.getMethod().getName() +
                " dijalankan pada : " + now);

        return hasil;
    }
}
