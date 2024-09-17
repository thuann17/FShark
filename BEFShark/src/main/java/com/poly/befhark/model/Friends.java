package com.poly.befhark.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "FRIENDS")
public class Friends {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CREATEDATE")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "USER_TARGET")
    private Users userTarget;

    @ManyToOne
    @JoinColumn(name = "USER_SRC")
    private Users userSrc;
}
