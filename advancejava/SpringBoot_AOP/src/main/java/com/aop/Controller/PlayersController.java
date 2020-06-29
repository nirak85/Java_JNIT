package com.aop.Controller;

import com.aop.Model.Players;
import com.aop.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayersController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "/add/players", method = RequestMethod.GET)
    public Players addPlayers(@RequestParam("pid") int pid, @RequestParam("name") String name, @RequestParam("country") String country)
    {
        return playerService.createPlayers(pid,name,country);
    }
}
