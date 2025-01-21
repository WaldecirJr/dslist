package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.*;
import org.springframework.data.jpa.repository.*;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
