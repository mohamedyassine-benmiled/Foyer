package tn.esprit.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

	@Before("execution(public * tn.esprit.services.*.lister*(..))")
	public void logMethodEntry(JoinPoint joinPoint) {
		/*
		String name = joinPoint.getSignature().getName();
		//get current date and time and log it
		LocalDateTime now = LocalDateTime.now();
		log.info("Entering in Method :  " + name + " at " + now);
		 */
	}
	
}
