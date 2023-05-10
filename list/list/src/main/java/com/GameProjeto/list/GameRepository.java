package com.GameProjeto.list;

import org.springframework.data.jpa.repository.JpaRepository;
import com.GameProjeto.list.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
