package com.vlu.bokkit.entity;

import com.vlu.bokkit.entity.converter.EnumToStringConverter;
import com.vlu.bokkit.entity.enumClass.Star;
import jakarta.persistence.*;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "rating", schema = "bokkit")
@Setter
public class Rating {

    @Id
    @Column (name = "ID")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Long id;

    @Column(name = "rate_by_star")
    @Convert(converter = EnumToStringConverter.class)
    private Star star;

    @Column(name = "user_comment")
    private String comment;

    @Column(name = "created_at")
    private Date createAt;

    public Rating() {
    }
    public Rating(Long id, Star star, String comment, Date createAt) {
        this.id = id;
        this.star = star;
        this.comment = comment;
        this.createAt = createAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Long getId() {
        return id;
    }

    public Star getStar(){return star;}

    public String getComment() {
        return comment;
    }

    public Date getCreateAt() {
        return createAt;
    }




}

