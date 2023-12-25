package com.vlu.bokkit.dto;

import com.vlu.bokkit.entity.Customer;
import jakarta.persistence.Id;

import java.util.Date;

public class CustomerDTO {
    @Id
    private Integer id;
    private String name;
    private String gender;
    private String address;
    private Date dob;
    private String identityNumber;
    private String userType;

    public CustomerDTO() {
    }
    public CustomerDTO(Integer id,String name, String gender, String address, Date dob, String idenNum, String userType) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
        this.identityNumber = idenNum;
        this.userType = userType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}