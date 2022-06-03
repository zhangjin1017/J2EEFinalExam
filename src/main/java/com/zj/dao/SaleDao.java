package com.zj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zj.pojo.Sale;
import com.zj.pojo.Shop;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SaleDao extends BaseMapper<Sale> {
}
