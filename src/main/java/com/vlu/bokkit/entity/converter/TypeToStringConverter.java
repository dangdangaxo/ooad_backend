package com.vlu.bokkit.entity.converter;

import com.vlu.bokkit.entity.enumClass.RoomType;
import com.vlu.bokkit.entity.enumClass.Star;
import jakarta.persistence.AttributeConverter;

public class TypeToStringConverter implements AttributeConverter<RoomType, String> {
    @Override
    public String convertToDatabaseColumn(RoomType roomType) {
        return roomType.name().toString();
    }

    @Override
    public RoomType convertToEntityAttribute(String s) {
        return RoomType.valueOf(s);
    }
}
