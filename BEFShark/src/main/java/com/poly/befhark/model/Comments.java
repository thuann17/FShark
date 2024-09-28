package com.poly.befhark.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "COMMENTS")
public class Comments {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CONTENT")
    private String content;


    @Column(name = "IMAGE")
    private Integer image;

    @ManyToOne
    @JoinColumn(name = "USERNAME")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "POST")
    private Posts post;

    @OneToMany(mappedBy = "comment")
    @JsonIgnore
    private List<Cmtimage> cmtImages;

    @OneToMany(mappedBy = "comment")
    @JsonIgnore
    private List<Likes> likes;
}
