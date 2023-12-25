package com.vlu.bokkit.service;

import com.vlu.bokkit.dto.CreateHotelDTO;
import com.vlu.bokkit.dto.HotelDTO;
import com.vlu.bokkit.entity.Hotel;

import java.util.List;

public interface HotelService {
    HotelDTO createHotel(CreateHotelDTO dto);
    List<Hotel> getAllHotel();
    HotelDTO updateHotel (HotelDTO newHotel, Long id);
    void deleteHotel (Long id);
}
