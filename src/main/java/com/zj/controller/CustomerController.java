package com.zj.controller;

import com.zj.pojo.Customer;
import com.zj.service.CustomerService;
import com.zj.utils.RestBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    private CustomerService customerService;
    @GetMapping("/getAll")
    public RestBean<List<Customer>> getAll(){
        return new RestBean<>(200,"获取成功",customerService.list());
    }
}
