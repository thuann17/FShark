package com.poly.befhark.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "USERROLES")
public class Userroles {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ROLE")
    private String role;

    @OneToMany(mappedBy = "userRoles")
    @JsonIgnore
    private List<Users> user;
}
