package com.vlu.bokkit.entity.converter;

import com.vlu.bokkit.entity.enumClass.Star;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class EnumToStringConverter implements AttributeConverter<Star, String> {

    @Override
    public String convertToDatabaseColumn(Star star) {
        return star.name().toString();
    }

    @Override
    public Star convertToEntityAttribute(String s) {
        return Star.valueOf(s);
    }
}