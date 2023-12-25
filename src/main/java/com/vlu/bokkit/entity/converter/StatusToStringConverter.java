package com.vlu.bokkit.entity.converter;

import com.vlu.bokkit.entity.enumClass.RoomStatus;
import com.vlu.bokkit.entity.enumClass.RoomType;
import jakarta.persistence.AttributeConverter;

public class StatusToStringConverter implements AttributeConverter<RoomStatus, String> {
    @Override
    public String convertToDatabaseColumn(RoomStatus roomStatus) {
        return roomStatus.name().toString();
    }

    @Override
    public RoomStatus convertToEntityAttribute(String s) {
        return RoomStatus.valueOf(s);
    }
}
