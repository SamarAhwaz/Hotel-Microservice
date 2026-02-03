package com.example.HotelService.HotelService.GlobalException;

public class HotelNotFoundException extends RuntimeException{

    public HotelNotFoundException(String message){
        super(message);
    }
}
