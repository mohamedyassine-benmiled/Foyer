package tn.esprit.config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;


@Component
@org.aspectj.lang.annotation.Aspect
@Slf4j
public class Aspect {


    // exemple img.png type advice/Aspect
    // * means any class and add starts with add and any parameters
    @After("execution(* tn.esprit.services.*.add*(..))")
    public void logAfterMethod() {
        log.info("«Exécution Réussie ! " );
    }

}
