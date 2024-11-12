package com.io.github.guiqwer.PlayLog.repositories;

import com.io.github.guiqwer.PlayLog.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//type game and type id
public interface GameRepository extends JpaRepository<Game, Long> {
}
