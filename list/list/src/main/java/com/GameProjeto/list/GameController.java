package com.GameProjeto.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public Games findById(@PathVariable Long id) {
        Games result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<MiniGame> findAll() {
        List<MiniGame> result = gameService.findAll();
        return result;
    }

}
