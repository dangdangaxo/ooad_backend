package com.vlu.bokkit.entity.converter;

import com.vlu.bokkit.entity.enumClass.RoomStatus;
import com.vlu.bokkit.entity.enumClass.RoomType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class RoomStatusToStringConverter implements AttributeConverter<RoomStatus, String> {

    @Override
    public String convertToDatabaseColumn(RoomStatus roomStatus) {
        return roomStatus.name().toString();
    }

    @Override
    public RoomStatus convertToEntityAttribute(String s) {
        return RoomStatus.valueOf(s);
    }
}
