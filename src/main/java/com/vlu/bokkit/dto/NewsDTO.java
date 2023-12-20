package com.vlu.bokkit.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewsDTO {
    private Long newsId;
    private String hotelName;
    private String address;
    private Double price;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
