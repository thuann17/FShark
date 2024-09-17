package com.poly.befhark.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "LIKES")
public class Likes {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CREATEDATE")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "USERNAME")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "POST")
    private Posts post;

    @ManyToOne
    @JoinColumn(name = "COMMENT")
    private Comments comment;
}
