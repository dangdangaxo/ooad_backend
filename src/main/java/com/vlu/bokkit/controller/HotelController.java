package com.vlu.bokkit.controller;

import com.vlu.bokkit.dto.CreateHotelDTO;
import com.vlu.bokkit.dto.HotelDTO;
import com.vlu.bokkit.dto.RatingDTO;
import com.vlu.bokkit.entity.Hotel;
import com.vlu.bokkit.entity.Rating;
import com.vlu.bokkit.service.HotelService;
import com.vlu.bokkit.service.impl.HotelServiceImpl;
import com.vlu.bokkit.service.impl.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/hotel")
public class HotelController {
    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelServiceImpl hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/getallhotel")
    public List<Hotel> getAllHotel()
    {
        return hotelService.getAllHotel();
    }

    @PutMapping("/updatehotel/{id}")
    public HotelDTO updateHotel(@RequestBody HotelDTO newHotel, @PathVariable Long id)
    {
        return hotelService.updateHotel(newHotel,id);
    }

    @DeleteMapping("/deletehotel/{id}")
    public String deleteHotel(@PathVariable Long id)
    {
        hotelService.deleteHotel(id);
        return "Hotel with id: " + id + " has been removed";
    }

    @PostMapping()
    public HotelDTO createHotel(@RequestBody CreateHotelDTO dto) {
        return hotelService.createHotel(dto);
    }
}
