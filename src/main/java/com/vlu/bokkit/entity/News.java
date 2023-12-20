package com.vlu.bokkit.entity;

import jakarta.persistence.*;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "NEWS")
@Setter
public class News {
    private Long newsId;
    private String hotelName;
    private String address;
    private String amenities;
    private Double price;
    private String email;
    private Date createdAt;
    private Date updatedAt;
    private Date deleteAt;
    public News() {
    }

    @Id
    @Column(name = "NEWS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long getNewsId() { return newsId; }

    @Column(name = "HOTEL_NAME")
    public String getHotelName() {
        return hotelName;
    }

    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    @Column(name = "AMENITIES")
    public String getAmenities() {
        return amenities;
    }

    @Column(name = "PRICE")
    public Double getPrice() {
        return price;
    }

    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

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
    public Date getDeleteAt() {
        return deleteAt;
    }
}
