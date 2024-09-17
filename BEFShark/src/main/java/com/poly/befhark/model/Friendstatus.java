package com.poly.befhark.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "FRIENDSTATUS")
public class Friendstatus {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "STATUS")
    private String status;

    @OneToMany(mappedBy = "status")
    private List<Friendrequests> friendRequests;
}
