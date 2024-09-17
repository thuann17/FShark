package com.poly.befhark.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "TRIPS")
public class Trips {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TRIPNAME")
    private String tripname;

    @Column(name = "STARTDATE")
    private Date startdate;

    @Column(name = "ENDDATE")
    private Date enddate;

    @Column(name = "CREATEDATE")
    private Date createdate;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "trip")
    private List<Usertrips> userTrips;

    @OneToMany(mappedBy = "trip")
    private List<Placetrips> placeTrips;
}
