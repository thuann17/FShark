package com.poly.befhark.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "USERTRIPS")
public class Usertrips {
    @Id
    @Column(name = "ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "USERID")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "TRIPID")
    private Trips trip;

    @ManyToOne
    @JoinColumn(name = "ROLE")
    private Triproles tripRole;
}
