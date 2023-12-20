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
    private Date deletedAt;
    private String description;
    private String yearBuild;
    private Integer bedQuantity;
    private Integer bathroomQuantity;
    private Integer personQuality;

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
    public Date getDeletedAt() {
        return deletedAt;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Column(name = "YEAR_BUILD")
    public String getYearBuild() {
        return yearBuild;
    }

    @Column(name = "BED_QUANTITY")
    public Integer getBedQuantity() {
        return bedQuantity;
    }

    @Column(name = "BATHROOM_QUANTITY")
    public Integer getBathroomQuantity() {
        return bathroomQuantity;
    }

    @Column(name = "PERSON_QUANTITY")
    public Integer getPersonQuality() {
        return personQuality;
    }
}
