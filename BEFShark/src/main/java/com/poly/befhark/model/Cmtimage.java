package com.poly.befhark.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

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
