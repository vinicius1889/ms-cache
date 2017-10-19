package br.com.icarros.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AOPs {

    @AfterReturning("execution(* br.com.icarros.web.Controller.*(..) )")
    public void logaAsChamadas(JoinPoint joinPoint){
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.debug(" chamando o serviço  "+joinPoint.getSignature().getName());
    }

}
