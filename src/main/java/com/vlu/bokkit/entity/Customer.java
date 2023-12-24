package com.vlu.bokkit.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Date;

@Entity
@Table(name = "customer")
@Setter
public class Customer {
    private  String name;
    private String gender;
    private String address;
    private Date dob;
    private String identity_number;
    private String user_type;
    @Id
    private Long id;

    public Customer(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
