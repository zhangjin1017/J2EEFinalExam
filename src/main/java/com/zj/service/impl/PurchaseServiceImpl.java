package com.zj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zj.dao.PurchaseDao;
import com.zj.dao.ShopDao;
import com.zj.pojo.Purchase;
import com.zj.pojo.Shop;
import com.zj.service.PurchaseService;
import com.zj.service.ShopService;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, Purchase> implements PurchaseService {

}

