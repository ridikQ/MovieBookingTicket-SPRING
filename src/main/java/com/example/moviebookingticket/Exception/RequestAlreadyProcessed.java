package com.example.moviebookingticket.Exception;

public class RequestAlreadyProcessed extends Exception{
    public RequestAlreadyProcessed(String errormessage){
        super(errormessage);
    }
}
