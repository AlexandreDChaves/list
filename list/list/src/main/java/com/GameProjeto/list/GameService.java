package com.GameProjeto.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<MiniGame> findAll() {
        List<Game> result = gameRepository.findAll();
        List<MiniGame> mini = result.stream().map(x -> new MiniGame(x)).toList();
        return mini;
    }


}
