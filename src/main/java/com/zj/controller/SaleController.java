package com.zj.controller;

import com.zj.pojo.Sale;
import com.zj.pojo.Shop;
import com.zj.service.SaleService;
import com.zj.service.ShopService;
import com.zj.utils.RestBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {
    @Resource
    private SaleService saleService;
    @GetMapping("/getAll")
    public RestBean<List<Sale>> getAll(){
        return new RestBean<>(200,"获取成功",saleService.list());
    }
}
