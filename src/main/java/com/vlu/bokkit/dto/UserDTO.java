package com.vlu.bokkit.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String identityNumber;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
