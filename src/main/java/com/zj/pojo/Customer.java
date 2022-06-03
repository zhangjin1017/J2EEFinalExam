package com.zj.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("customer")
public class Customer {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String no;
    private String name;
    private String phone;
    private double balance;
    private Integer point;
}
