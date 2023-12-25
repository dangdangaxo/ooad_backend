package com.vlu.bokkit.dto;

import com.vlu.bokkit.entity.Star;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RatingDTO {
    private Long id;
    private Star star;
    private String comment;
    private Date createAt;
}
