package com.example.HotelService.HotelService.Controller;


import com.example.HotelService.HotelService.RequestDto.HotelRequestDto;
import com.example.HotelService.HotelService.ResponseDto.HotelResponseDto;
import com.example.HotelService.HotelService.Service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("Hotel")
public class HotelController {


    private final HotelService hotelService;

    @PostMapping("create")
    public HotelResponseDto createHotel(@RequestBody HotelRequestDto hotelRequestDto) {
        return hotelService.createHotel(hotelRequestDto);
    }

    @GetMapping("{id}")
    public HotelResponseDto getHotel(@PathVariable("id") Long id){
        return hotelService.getHotelById(id);
    }
}
