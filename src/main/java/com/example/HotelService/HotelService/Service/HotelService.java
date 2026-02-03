package com.example.HotelService.HotelService.Service;

import com.example.HotelService.HotelService.RequestDto.HotelRequestDto;
import com.example.HotelService.HotelService.ResponseDto.HotelResponseDto;

public interface HotelService {


    HotelResponseDto createHotel(HotelRequestDto dto);
    HotelResponseDto getHotelById(Long id);
    HotelResponseDto getHotel();
    void deleteHotel(Long id);
}
