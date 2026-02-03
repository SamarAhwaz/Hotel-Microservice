package com.example.HotelService.HotelService.ServiceImplementation;

import com.example.HotelService.HotelService.Entities.Hotel;
import com.example.HotelService.HotelService.GlobalException.HotelNotFoundException;
import com.example.HotelService.HotelService.Mapper.HotelMapper;
import com.example.HotelService.HotelService.Repository.HotelRepo;
import com.example.HotelService.HotelService.RequestDto.HotelRequestDto;
import com.example.HotelService.HotelService.ResponseDto.HotelResponseDto;
import com.example.HotelService.HotelService.Service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HotelServiceImplementation implements HotelService {

private final HotelRepo hotelRepo;
private final HotelMapper hotelMapper;

        @Override
        public HotelResponseDto createHotel(HotelRequestDto hotelRequestDto){
    Hotel hotel = hotelMapper.toEntity(hotelRequestDto);
    hotelRepo.save(hotel);
    return hotelMapper.toDto(hotel);
        }

        @Override
    public HotelResponseDto getHotelById(Long id){
            Hotel hotel = hotelRepo.findById(id).orElseThrow(()->new HotelNotFoundException("Hotel not found exception"));
            return hotelMapper.toDto(hotel);
        }

    @Override
    public HotelResponseDto getHotel() {
        return null;
    }

    @Override
    public void deleteHotel(Long id) {

    }
}
