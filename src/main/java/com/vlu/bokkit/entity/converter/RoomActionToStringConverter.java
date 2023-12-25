package com.vlu.bokkit.entity.converter;

import com.vlu.bokkit.entity.enumClass.RoomAction;
import com.vlu.bokkit.entity.enumClass.RoomType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class RoomActionToStringConverter implements AttributeConverter<RoomAction, String> {

    @Override
    public String convertToDatabaseColumn(RoomAction roomAction) {
        return roomAction.name().toString();
    }

    @Override
    public RoomAction convertToEntityAttribute(String s) {
        return RoomAction.valueOf(s);
    }
}