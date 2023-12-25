package com.vlu.bokkit.entity.converter;

import com.vlu.bokkit.entity.enumClass.RoomType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class RoomTypeToStringConverter implements AttributeConverter<RoomType, String> {

    @Override
    public String convertToDatabaseColumn(RoomType roomType) {
        return roomType.name().toString();
    }

    @Override
    public RoomType convertToEntityAttribute(String s) {
        return RoomType.valueOf(s);
    }
}
