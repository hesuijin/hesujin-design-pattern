package com.example.study.structural_design_pattern.proxy.staticProxy;

import com.example.study.structural_design_pattern.proxy.MetricsInfo;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class UserController {

    public String login(String telephone, String password) {
        // ... 省略login逻辑...
        return "login success";
    }
}