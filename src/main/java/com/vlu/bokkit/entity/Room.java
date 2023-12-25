package com.vlu.bokkit.entity;

import com.vlu.bokkit.entity.converter.EnumToStringConverter;
import com.vlu.bokkit.entity.converter.RoomActionToStringConverter;
import com.vlu.bokkit.entity.converter.RoomStatusToStringConverter;
import com.vlu.bokkit.entity.converter.RoomTypeToStringConverter;
import com.vlu.bokkit.entity.enumClass.RoomAction;
import com.vlu.bokkit.entity.enumClass.RoomStatus;
import com.vlu.bokkit.entity.enumClass.RoomType;
import com.vlu.bokkit.entity.enumClass.Star;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "room", schema = "bokkit")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @Column(name = "room_id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_number")
//    @Convert(converter = EnumToStringConverter.class)
    private Integer roomNumber;

    @Column(name = "room_type")
    @Convert(converter = RoomTypeToStringConverter.class)
    private RoomType roomType;

    @Column(name = "room_status")
    @Convert(converter = RoomStatusToStringConverter.class)
    private RoomStatus roomStatus;

    @Column(name = "room_action")
    @Convert(converter = RoomActionToStringConverter.class)
    private RoomAction roomAction;

//    @Column(name = "room_id")
//    private Long roomID;

    @Column(name = "price_by_day")
    private Float priceByDay;

    @Column(name = "price_by_night")
    private Float priceByNight;

    @Column(name = "price_by_hour")
    private Float priceByHour;

//    @Column(name = "room_comment")
//    private String roomComment;

//    @Column(name = "room_star")
//    @Convert(converter = EnumToStringConverter.class)
//    private Star roomStar;

    @ManyToOne
    @JoinColumn(name="hotel_id", nullable=false)
    private Hotel hotelId;

}
