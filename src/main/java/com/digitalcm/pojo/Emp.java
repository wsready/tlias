package com.digitalcm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * ClassName: Emp
 * Package: com.digitalcm.pojo
 * Description:
 *
 * @Author: wang song
 * @Create: 2023/4/29 - 14:33
 * @Version: v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//员工实体类
public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Short gender;
    private String image;
    private Short job;
    private LocalDate entrydate;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
