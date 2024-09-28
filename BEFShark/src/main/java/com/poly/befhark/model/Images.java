package com.poly.befhark.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private List<Users> usersAvatar;

    @OneToMany(mappedBy = "cover")
    @JsonIgnore
    private List<Users> usersCover;

    @OneToMany(mappedBy = "image")
    @JsonIgnore
    private List<Comments> comments;

    @OneToMany(mappedBy = "image")
    @JsonIgnore
    private List<Postimages> postImages;

    @OneToMany(mappedBy = "image")
    @JsonIgnore
    private List<Cmtimage> cmtImages;

    @OneToMany(mappedBy = "image")
    @JsonIgnore
    private List<Placeimages> placeImages;
}
