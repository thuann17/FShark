package com.poly.befhark.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class PostDTO {
    private Integer id;
    private String content;
    private Date createDate;
    private String username;
    private long commentCount;
    private long likeCount;
}
