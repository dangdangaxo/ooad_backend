package com.vlu.bokkit.entity.converter;

import com.vlu.bokkit.entity.enumClass.RoomAction;
import com.vlu.bokkit.entity.enumClass.RoomType;
import jakarta.persistence.AttributeConverter;

public class ActionToStringConverter implements AttributeConverter<RoomAction, String> {
    @Override
    public String convertToDatabaseColumn(RoomAction roomType) {
        return roomType.name().toString();
    }

    @Override
    public RoomAction convertToEntityAttribute(String s) {
        return RoomAction.valueOf(s);
    }
}
