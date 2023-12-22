package com.vlu.bokkit.entity;

import jakarta.persistence.*;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "news")
@Setter
public class News {
    private Long newsId;
    private Long room_id;
    private Long hotel_id;
    private String amenities;
    private String email;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;
    private String description;
    private String year_build;
    private Integer bed_quantity;
    private Integer bathroom_quantity;
    private Integer person_quantity;

    public News() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NEWS_ID")
    public Long getNewsId() { return newsId; }

    @Column(name = "ROOM_ID")
    public Long getRoom_id() {
        return room_id;
    }

    @Column(name = "HOTEL_ID")
    public Long getHotel_id() {
        return hotel_id;
    }


    @Column(name = "AMENITIES")
    public String getAmenities() {
        return amenities;
    }

    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    @Column(name = "CREATED_AT")
    @CreationTimestamp
    public Date getCreated_at() {
        return created_at;
    }

    @Column(name = "UPDATED_AT")
    @UpdateTimestamp
    public Date getUpdated_at() {
        return updated_at;
    }

    @Column(name = "DELETED_AT")
    public Date getDeleted_at() {
        return deleted_at;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Column(name = "YEAR_BUILD")
    public String getYear_build() {
        return year_build;
    }

    @Column(name = "BED_QUANTITY")
    public Integer getBed_quantity() {
        return bed_quantity;
    }

    @Column(name = "BATHROOM_QUANTITY")
    public Integer getBathroom_quantity() {
        return bathroom_quantity;
    }

    @Column(name = "PERSON_QUANTITY")
    public Integer getPerson_quantity() {
        return person_quantity;
    }
}
