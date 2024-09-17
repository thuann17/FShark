package com.poly.befhark.model;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "POSTS")
public class Posts {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "CREATEDATE")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "USERNAME")
    private Users user;

    @OneToMany(mappedBy = "post")
    private List<Comments> comments;

    @OneToMany(mappedBy = "post")
    private List<Likes> likes;

    @OneToMany(mappedBy = "post")
    private List<Shares> shares;

    @OneToMany(mappedBy = "post")
    private List<Postimages> postImages;
}
