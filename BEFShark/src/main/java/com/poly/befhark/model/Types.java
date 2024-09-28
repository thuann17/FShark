package com.poly.befhark.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "TYPES")
public class Types {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TYLE")
    private String tyle;

    @OneToMany(mappedBy = "type")
    @JsonIgnore
    private List<Notifications> notifications;
}
