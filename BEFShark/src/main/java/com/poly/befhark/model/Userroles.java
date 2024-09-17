package com.poly.befhark.model;
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
    private List<Users> user;
}
