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
    private Long id;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    private Date dateOfBirth;
    private String gender;
    private String identityNumber;

    public User() {

    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() { return id; }

    @Column(name = "CREATED_AT")
    @CreationTimestamp
    public Date getCreatedAt() {
        return createdAt;
    }

    @Column(name = "UPDATED_AT")
    @UpdateTimestamp
    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Column(name = "DELETED_AT")
    public Date getDeletedAt() {
        return deletedAt;
    }

    @Column(name = "DATE_OF_BIRTH")
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Column(name="IDENTITY_NUMBER")
    public String getIdentityNumber() {
        return identityNumber;
    }

    @Column(name="GENDER")
    public String getGender() {
        return gender;
    }
}

