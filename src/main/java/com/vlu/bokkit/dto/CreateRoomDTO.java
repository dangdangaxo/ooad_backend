package com.vlu.bokkit.dto;

import com.vlu.bokkit.entity.enumClass.RoomType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CreateRoomDTO {
    Long hotelId;
    RoomType roomType;
    Float priceByDay;
    Float priceByHour;
    Float priceByNight;
    Integer roomNumber;
}
