package com.poly.befhark.model;

import lombok.Data;

import java.util.Date;

@Data
public class PostModel {
    private Integer id;
    private String content;
    private Date createDate;
}
