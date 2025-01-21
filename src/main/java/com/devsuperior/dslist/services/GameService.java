package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.*;
import com.devsuperior.dslist.entities.*;
import com.devsuperior.dslist.repositories.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
