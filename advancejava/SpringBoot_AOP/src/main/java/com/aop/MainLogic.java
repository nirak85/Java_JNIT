package com.aop;


import com.aop.Controller.PlayersController;
import com.aop.Model.Players;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainLogic {
    public static void main(String[] args) {
        ConfigurableApplicationContext cat = SpringApplication.run(MainLogic.class);

        PlayersController pc = cat.getBean(PlayersController.class);
        Players p = (Players)pc.addPlayers(101,"Niraj","Nepal");
    }
}
