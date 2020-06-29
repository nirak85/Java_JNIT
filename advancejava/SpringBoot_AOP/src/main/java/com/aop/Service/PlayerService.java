package com.aop.Service;

import com.aop.Model.Players;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    public Players createPlayers(int pid, String name, String country)
    {
        Players players = new Players();
        players.setPid(pid);
        players.setName(name);
        players.setCountry(country);

        return players;
    }
}
