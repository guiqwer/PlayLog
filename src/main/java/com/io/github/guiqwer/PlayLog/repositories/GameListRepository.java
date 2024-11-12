package com.io.github.guiqwer.PlayLog.repositories;

import com.io.github.guiqwer.PlayLog.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

//type game and type id
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
