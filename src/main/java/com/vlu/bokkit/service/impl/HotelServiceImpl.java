package com.vlu.bokkit.service.impl;

import com.vlu.bokkit.dto.CreateHotelDTO;
import com.vlu.bokkit.dto.HotelDTO;
import com.vlu.bokkit.dto.RatingDTO;
import com.vlu.bokkit.entity.Hotel;
import com.vlu.bokkit.entity.Rating;
import com.vlu.bokkit.exception.RatingNotFoundException;
import com.vlu.bokkit.repository.HotelRepository;
import com.vlu.bokkit.service.HotelService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    public HotelDTO addNewHotel(HotelDTO hotelDTO) {
        hotelRepository.save(convertHotelDTOtoEntity(hotelDTO));
        return hotelDTO;
    }

    @Override
    public HotelDTO updateHotel (HotelDTO newHotel, Long id)
    {
        Hotel hotel = (Hotel) hotelRepository.findById(id).get();
        if (hotel == null)
        {
            throw new RatingNotFoundException(id);
        }
        hotel.setName(newHotel.getName());
        hotel.setAddress(newHotel.getAddress());

        hotelRepository.save(hotel);
        return convertHotelToDTO(hotel);
    }

    @Override
    public List<Hotel> getAllHotel()
    {
        return hotelRepository.findAll();
    }

    @Override
    public void deleteHotel (Long id)
    {
        if (!hotelRepository.existsById(id))
        {
            throw new RatingNotFoundException(id);
        }
        hotelRepository.deleteById(id);
    }
    private HotelDTO convertHotelToDTO(Hotel currentHotel)
    {
        HotelDTO hotelDTO = new HotelDTO();
        return hotelDTO.builder()
                .id(currentHotel.getId())
                .name(currentHotel.getAddress())
                .address(currentHotel.getAddress())
                .build();
    }
    private Hotel convertHotelDTOtoEntity(HotelDTO hotelDTO)
    {
        Hotel hotel = new Hotel();
        BeanUtils.copyProperties(hotelDTO,hotel);
        return hotel;
    }

    @Override
    public HotelDTO createHotel(CreateHotelDTO dto) {
        Hotel newHotel = Hotel.builder()
                .name(dto.getName())
                .address(dto.getAddress())
                .build();
        hotelRepository.save(newHotel);
        return HotelDTO.builder()
                .address(newHotel.getAddress())
                .id(newHotel.getId())
                .name(newHotel.getName())
                .build();
    }
}
