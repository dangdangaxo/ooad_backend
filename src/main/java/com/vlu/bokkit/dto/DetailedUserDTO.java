package com.vlu.bokkit.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DetailedUserDTO extends UserDTO{
    private String gender;
    private String address;
    private String dateOfBirth;
    private String identityNumber;
    private boolean isVendorUser;
    private boolean isAdmin;

    public DetailedUserDTO(Long id, String identityNumber, Date createdAt, Date updatedAt, Date deletedAt) {
        super(id, identityNumber, createdAt, updatedAt, deletedAt);
    }

    public DetailedUserDTO() {
        super();
    }
}
