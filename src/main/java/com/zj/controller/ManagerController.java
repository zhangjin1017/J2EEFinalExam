package com.zj.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zj.pojo.Manager;
import com.zj.service.ManagerService;
import com.zj.utils.RestBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Resource
    private ManagerService managerService;

    @PostMapping("/login")
    public RestBean<String> login(@RequestBody Manager manager) {
        LambdaQueryWrapper<Manager> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Manager::getName, manager.getName());
        lqw.eq(Manager::getPassword, manager.getPassword());
        List<Manager> list = managerService.list(lqw);
        if (list.size() == 1) {
            return new RestBean<>(200, "登录成功", list.get(0).getName());
        } else {
            return new RestBean<>(400, "登录失败");
        }
    }

}
