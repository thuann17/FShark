package com.poly.befhark.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "FRIENDREQUESTS")
public class Friendrequests {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CREATEDATE")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "SENDER")
    private Users sender;

    @ManyToOne
    @JoinColumn(name = "USERSRC")
    private Users userSrc;

    @ManyToOne
    @JoinColumn(name = "STATUS")
    private Friendstatus status;
}
