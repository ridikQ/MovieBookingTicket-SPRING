package com.example.moviebookingticket.services;

import com.example.moviebookingticket.entity.BookingEntity;
import com.example.moviebookingticket.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

@Autowired
    private BookingRepository bookingRepository;

    public List<BookingEntity> getAllBookings(){
        return bookingRepository.findAll();
    }
    public void addBooking(BookingEntity bookingEntity){
            bookingRepository.save(bookingEntity);
    }
    public Optional<BookingEntity> getBookingById(Long id){
        return bookingRepository.findById(id);
    }
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}
