package com.vlu.bokkit.dto;

import com.vlu.bokkit.entity.converter.EnumToStringConverter;
import com.vlu.bokkit.entity.enumClass.RoomAction;
import com.vlu.bokkit.entity.enumClass.RoomStatus;
import com.vlu.bokkit.entity.enumClass.RoomType;
import com.vlu.bokkit.entity.enumClass.Star;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomDTO {
    private Long id;
    private Integer roomNumber;
    private RoomType roomType;
    private RoomStatus roomStatus;
    private RoomAction roomAction;
    private Long roomID;
    private Float priceByDay;
    private Float priceByNight;
    private Float priceByHour;
//    private String roomComment;
//    private Star roomStar;
}
