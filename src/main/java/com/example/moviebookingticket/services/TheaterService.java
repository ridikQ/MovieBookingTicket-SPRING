package com.example.moviebookingticket.services;

import com.example.moviebookingticket.entity.TheaterEntity;
import com.example.moviebookingticket.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterService {
    @Autowired
    private TheaterRepository theaterRepository;

    public List<TheaterEntity>getAllTheaters(){
        return theaterRepository.findAll();
    }
    public void addTheater(TheaterEntity theaterEntity){
        theaterRepository.save(theaterEntity);
    }
}
