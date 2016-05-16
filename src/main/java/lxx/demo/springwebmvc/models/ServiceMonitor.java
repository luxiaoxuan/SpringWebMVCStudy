package lxx.demo.springwebmvc.models;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceMonitor {

	@Before("execution(* lxx.demo.springwebmvc.models.PangnyoService.*(..))")
	public void rai(JoinPoint jp) {
		System.out.println("Before: " + jp);
	}

}
