package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.*;
import com.devsuperior.dslist.entities.*;
import com.devsuperior.dslist.services.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
