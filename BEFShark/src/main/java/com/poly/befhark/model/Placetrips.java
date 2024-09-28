package com.poly.befhark.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "PLACETRIPS")
public class Placetrips {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DATETIME")
    private Date dateTime;

    @Column(name = "NOTE")
    private String note;
    @ManyToOne
    @JoinColumn(name = "PLACEID")
    private Places place;

    @ManyToOne
    @JoinColumn(name = "TRIPID")
    private Trips trip;
}
