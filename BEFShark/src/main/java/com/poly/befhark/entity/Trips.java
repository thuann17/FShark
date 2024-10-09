package com.poly.befhark.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private List<Usertrips> userTrips;

    @OneToMany(mappedBy = "trip")
    @JsonIgnore
    private List<Placetrips> placeTrips;
}
