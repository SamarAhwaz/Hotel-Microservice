package com.example.HotelService.HotelService.Mapper;

import com.example.HotelService.HotelService.Entities.Hotel;
import com.example.HotelService.HotelService.RequestDto.HotelRequestDto;
import com.example.HotelService.HotelService.ResponseDto.HotelResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HotelMapper {

    HotelResponseDto toDto(Hotel hotel);
    Hotel toEntity( HotelRequestDto hotelRequestDto);
}
