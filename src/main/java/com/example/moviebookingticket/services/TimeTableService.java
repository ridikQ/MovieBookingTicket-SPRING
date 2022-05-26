package com.example.moviebookingticket.services;

import com.example.moviebookingticket.entity.TimeTableEntity;
import com.example.moviebookingticket.repository.TimeTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeTableService {
    @Autowired
    private TimeTableRepository timeTableRepository;

    public void addTimeTable(TimeTableEntity timeTableEntity){
        timeTableRepository.save(timeTableEntity);
    }
}
