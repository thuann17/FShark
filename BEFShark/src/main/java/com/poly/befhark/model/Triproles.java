package com.poly.befhark.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "TRIPROLES")
public class Triproles {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ROLE")
    private String role;

    @OneToMany(mappedBy = "tripRole")
    private List<Usertrips> userTrips;
}
