package com.example.study.structural_design_pattern.proxy.staticProxy;

import com.example.study.structural_design_pattern.proxy.MetricsCollector;
import com.example.study.structural_design_pattern.proxy.MetricsInfo;
import com.example.study.structural_design_pattern.proxy.staticProxy.UserController;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class UserControllerProxy extends UserController{

    @Autowired
    private MetricsCollector metricsCollector;

    public UserControllerProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    //直接继承父类 使用代理类方式即可 注意方法名最好与父类一致
    public String login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // 委托执行父类方式
        String userVo = super.login(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        MetricsInfo metricsInfo = new MetricsInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(metricsInfo);
        return userVo;
    }
}
