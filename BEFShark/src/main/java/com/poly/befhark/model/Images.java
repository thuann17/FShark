package com.poly.befhark.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "IMAGES")
public class Images {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "IMAGE")
    private String image;

    @OneToMany(mappedBy = "avatar")
    private List<Users> usersAvatar;

    @OneToMany(mappedBy = "cover")
    private List<Users> usersCover;

    @OneToMany(mappedBy = "image")
    private List<Comments> comments;

    @OneToMany(mappedBy = "image")
    private List<Postimages> postImages;

    @OneToMany(mappedBy = "image")
    private List<Cmtimage> cmtImages;

    @OneToMany(mappedBy = "image")
    private List<Placeimages> placeImages;
}
