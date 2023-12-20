package com.vlu.bokkit.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DetailedNewsDTO extends NewsDTO{
    private String amenities;
    private String email;
    private String description;
    private String yearBuild;
    private Integer bedQuantity;
    private Integer bathroomQuantity;
    private Integer personQuality;

    public DetailedNewsDTO(Long newsId, String hotelName, String address, Double price, Date createdAt, Date updatedAt, Date deletedAt) {
        super(newsId,
                hotelName,
                address,
                price,
                createdAt,
                updatedAt,
                deletedAt);
    }
    public DetailedNewsDTO() {
        super();
    }
}
