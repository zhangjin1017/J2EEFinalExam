package com.zj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zj.dao.SaleDao;
import com.zj.pojo.Sale;
import com.zj.service.SaleService;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl extends ServiceImpl<SaleDao, Sale> implements SaleService {

}

