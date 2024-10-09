package com.poly.befhark.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "POSTS")
public class Posts {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "CREATEDATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "USERNAME")
    private Users user;

    @OneToMany(mappedBy = "post")
    @JsonIgnore
    private List<Comments> comments;

    @OneToMany(mappedBy = "post")
    @JsonIgnore
    private List<Likes> likes;

    @OneToMany(mappedBy = "post")
    @JsonIgnore
    private List<Shares> shares;

    @OneToMany(mappedBy = "post")
    @JsonIgnore
    private List<Postimages> postImages;
}
