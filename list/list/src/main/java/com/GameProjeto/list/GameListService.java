package com.GameProjeto.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GamesList> findAll() {
        List<GameList> result = gameListRepository.findAll();
       return  result.stream().map(x -> new GamesList(x)).toList();

    }


}
