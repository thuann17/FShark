package com.poly.befhark.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private List<Usertrips> userTrips;
}
