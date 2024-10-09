package com.poly.befhark.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "CMTIMAGE")
public class Cmtimage {
    @Id
    @Column(name = "ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "CMTID")
    private Comments comment;

    @ManyToOne
    @JoinColumn(name = "IMAGE")
    private Images image;

}