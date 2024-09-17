package com.poly.befhark.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "MESSAGES")
public class Messages {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "CREATEDATE")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "CONVERSATION")
    private Conversations conversation;

    @ManyToOne
    @JoinColumn(name = "USERSRC")
    private Users userSrc;


}
