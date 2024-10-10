package com.poly.befhark.DTO;

import lombok.Data;
import java.util.Date;
@Data
public class PostDTO {
    private Integer id;
    private String content;
    private Date createDate;
    private String username;
    private long commentCount;
    private long likeCount;
}
