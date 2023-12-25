package com.vlu.bokkit.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CreateHotelDTO {
    private String name;
    private String address;
}

