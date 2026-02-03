package com.example.HotelService.HotelService.GlobalException;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiError {
    private LocalDateTime timeStamp;
    private String message;
    private boolean error;
    private int errorcode;
    private String details;
}
