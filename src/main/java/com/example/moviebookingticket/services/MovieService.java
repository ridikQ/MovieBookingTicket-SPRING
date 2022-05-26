package com.example.moviebookingticket.services;

import com.example.moviebookingticket.entity.MovieEntity;
import com.example.moviebookingticket.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<MovieEntity> getAllMovies(){
        return movieRepository.findAll();
    }
    public void addMovie(MovieEntity movieEntity){
        movieRepository.save(movieEntity);
    }
    public void deleteMovie(Long id){
        movieRepository.deleteById(id);
    }
}
