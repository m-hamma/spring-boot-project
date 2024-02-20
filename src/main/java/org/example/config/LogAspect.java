package org.example.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Before("execution(public * org.example.service.*Service.*(..))")
	public void log(JoinPoint joinPoint) {
		System.out.printf("Appel de %s avec %d paramètres%n", joinPoint.toShortString(), joinPoint.getArgs().length);
	}

}