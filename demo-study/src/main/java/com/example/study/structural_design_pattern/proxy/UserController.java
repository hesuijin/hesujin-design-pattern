package com.example.study.structural_design_pattern.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
@Controller
public class UserController {

    @Autowired
    private MetricsCollector metricsCollector;

    public String login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // ... 省略login逻辑...
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        MetricsInfo metricsInfo = new MetricsInfo("login", startTimestamp,responseTime);
        metricsCollector.recordRequest(metricsInfo);

        return "login success";
    }
}
