package com.zj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zj.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerDao extends BaseMapper<Customer> {

}
