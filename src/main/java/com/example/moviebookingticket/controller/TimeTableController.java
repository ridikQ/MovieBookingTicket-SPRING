package com.example.moviebookingticket.controller;

import com.example.moviebookingticket.entity.TimeTableEntity;
import com.example.moviebookingticket.services.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/timetable")
public class TimeTableController {
    @Autowired
    private TimeTableService timeTableService;

    @PostMapping("/add")
    public void addTimeTable(@RequestBody TimeTableEntity timeTableEntity){
        timeTableService.addTimeTable(timeTableEntity);
    }
}
