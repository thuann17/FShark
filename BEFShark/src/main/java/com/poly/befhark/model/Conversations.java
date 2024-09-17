package com.poly.befhark.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CONVERSATIONS")
public class Conversations {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATEDAT")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "AVATAR")
    private Images avatar;

    @OneToMany(mappedBy = "conversation")
    private List<Groupmembers> groupMembers;

    @OneToMany(mappedBy = "conversation")
    private List<Messages> messages;
}
