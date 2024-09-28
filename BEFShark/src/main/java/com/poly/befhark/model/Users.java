package com.poly.befhark.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
@Entity
@Table(name = "USERS")
public class Users {
    @Id
    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ACTIVE")
    private Boolean active;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "GENDER")
    private Boolean gender;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "FIRSTNAME")
    private String firstname;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "BIO")
    private String bio;

    @Column(name = "HOMETOWN")
    private String hometown;

    @Column(name = "CURRENCY")
    private String currency;

    @ManyToOne
    @JoinColumn(name = "AVATAR")
    private Images avatar;

    @ManyToOne
    @JoinColumn(name = "COVER")
    private Images cover;

    @ManyToOne
    @JoinColumn(name = "ROLES")
    private Userroles userRoles;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Posts> posts;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Comments> comments;

    @OneToMany(mappedBy = "sender")
    @JsonIgnore
    private List<Friendrequests> sentFriendRequests;

    @OneToMany(mappedBy = "userSrc")
    @JsonIgnore
    private List<Friends> friends;

    @OneToMany(mappedBy = "user")
    private List<Likes> likes;

    @OneToMany(mappedBy = "user")
    private List<Usertrips> userTrips;

    @OneToMany(mappedBy = "user")
    private List<Notifications> notifications;

    @OneToMany(mappedBy = "user")
    private List<Shares> shares;

    @OneToMany(mappedBy = "user")
    private List<Groupmembers> groupMembers;

}
