package com.aop.Aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PlayersAspect {

    @Before(value = "execution(* com.aop.Service.PlayerService.*(..)) && args(pid,name,country)")
    public void beforeAdvice(int pid, String name, String country)
    {
        System.out.println("This is a before advice class");
        System.out.printf("Registering the players into the Nepal Team:\nID:%d\nName:%s\nCountry:%s\n",pid,name,country);
    }

    @After(value = "execution(* com.aop.Service.PlayerService.*(..)) && args(pid,name,country)")
    public void afterAdvice(int pid, String name, String country)
    {
        System.out.println("This is a after advice class");
        System.out.printf("Registered players in the Nepal Team:\nID:%d\nName:%s\nCountry:%s\n",pid,name,country);
    }


}
