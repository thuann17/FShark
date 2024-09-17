package com.poly.befhark.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PLACEIMAGES")
public class Placeimages {
    @Id
    @Column(name = "ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "PLACEID")
    private Places place;

    @ManyToOne
    @JoinColumn(name = "IMAGE")
    private Images image;

}
