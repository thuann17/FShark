package com.poly.befhark.model;

import lombok.Data;

import java.util.Date;

@Data
public class AccountUserModel {
    private String username;
    private Boolean active;
    private String email;
    private String firstname;
    private String lastname;
    private Date birthday;
    private String bio;
    private String hometown;
    private String avatarUrl;
    private String coverUrl;

}
