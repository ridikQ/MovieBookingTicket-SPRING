package com.example.moviebookingticket.controller;

import com.example.moviebookingticket.entity.TheaterEntity;
import com.example.moviebookingticket.services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/theater")
public class TheaterController {
    @Autowired
    private TheaterService theaterService;

    @GetMapping("/all")
    public List<TheaterEntity>getAllTheaters(){
       return theaterService.getAllTheaters();
    }
    @PostMapping("/add")
    public void addTheater(@RequestBody TheaterEntity theaterEntity){
        theaterService.addTheater(theaterEntity);
    }
}
