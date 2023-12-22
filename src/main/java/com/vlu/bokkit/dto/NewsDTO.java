package com.vlu.bokkit.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewsDTO {
    private Long news_id;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;
}
