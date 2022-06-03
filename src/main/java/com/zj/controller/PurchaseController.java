package com.zj.controller;

import com.zj.pojo.Purchase;
import com.zj.pojo.Shop;
import com.zj.service.PurchaseService;
import com.zj.service.ShopService;
import com.zj.utils.RestBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    @Resource
    private PurchaseService purchaseService;
    @GetMapping("/getAll")
    public RestBean<List<Purchase>> getAll(){
        return new RestBean<>(200,"获取成功",purchaseService.list());
    }
}
