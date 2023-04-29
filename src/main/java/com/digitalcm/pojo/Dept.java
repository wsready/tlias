package com.digitalcm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * ClassName: Dept
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
//部门实体类
public class Dept {
    private Integer id;
    private String name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
