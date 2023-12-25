package com.vlu.bokkit.entity;


import com.vlu.bokkit.entity.converter.EnumToStringConverter;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "hotel", schema = "bokkit")
@Setter
@Getter
@Builder
public class Hotel {
    @Id
    @Column(name = "HOTEL_ID")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hotel_name")
    private String name;

    @Column(name = "address")
    private String address;

    public Hotel(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Hotel() {
    }

}
