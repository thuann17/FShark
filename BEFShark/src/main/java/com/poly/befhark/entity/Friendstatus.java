package com.poly.befhark.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private List<Friendrequests> friendRequests;
}
