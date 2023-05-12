package com.GameProjeto.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class GameService {
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public Games findById(Long id) {
        Game result = gameRepository.findById(id).get();
        Games games = new Games(result);
        return games;
    }
    @Transactional(readOnly = true)
    public List<MiniGame> findAll() {
        List<Game> result = gameRepository.findAll();
        List<MiniGame> mini = result.stream().map(x -> new MiniGame(x)).toList();
        return mini;
    }


}
