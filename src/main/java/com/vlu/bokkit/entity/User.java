package com.vlu.bokkit.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "USERS")
@Setter
public class User {
    @Id
    private Long id;
    private String name;
    private String gender;
    private String address;
    private Date dateOfBirth;
    private String identityNumber;
    private String user_type;

    public User() {

    }

}

