package com.poly.befhark.DTO;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDTO {
    private String username;
    private Boolean active;
    private String email;
    private String firstname;
    private Date birthday;
    private List<String> roles;
    private Boolean gender;
    private String lastname;
    private String bio;
    private String hometown;
    private String currency;
    private String avatar;
    private String cover;

}
