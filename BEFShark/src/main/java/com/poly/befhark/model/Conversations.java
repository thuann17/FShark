package com.poly.befhark.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private List<Groupmembers> groupMembers;

    @OneToMany(mappedBy = "conversation")
    @JsonIgnore
    private List<Messages> messages;
}
