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
    private String year_build;
    private Integer bed_quantity;
    private Integer bathroom_quantity;
    private Integer person_quantity;

    public DetailedNewsDTO(Long news_id, String hotelName, String address, Double price, Date created_at, Date updated_at, Date deleted_at) {
        super(news_id,
                created_at,
                updated_at,
                deleted_at);
    }
    public DetailedNewsDTO() {
        super();
    }
}
