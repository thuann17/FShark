package com.poly.befhark.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "SHARES")
public class Shares {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "CREATEDATE")
    private Date createdate;

    @ManyToOne
    @JoinColumn(name = "USERNAME")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "POST")
    private Posts post;
}
