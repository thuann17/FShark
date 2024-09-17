package com.poly.befhark.model;
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
    private List<Notifications> notifications;
}
