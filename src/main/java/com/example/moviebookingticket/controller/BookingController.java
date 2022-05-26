package com.example.moviebookingticket.controller;

import com.example.moviebookingticket.entity.BookingEntity;
import com.example.moviebookingticket.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/booking")
public class BookingController {
@Autowired
private BookingService bookingService;

@GetMapping("/all")
    public List<BookingEntity>getBooking(){
  return bookingService.getAllBookings();
}
@PostMapping("/add")
public void addBooking(@RequestBody BookingEntity bookingEntity){
    bookingService.addBooking(bookingEntity);
}
@GetMapping("/{id}")
 public void getBookingById(@PathVariable ("id")Long id){
    bookingService.getBookingById(id);
}
@DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable ("id")Long id){
    bookingService.deleteBooking(id);
}
}
