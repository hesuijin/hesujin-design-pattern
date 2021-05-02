package com.example.study.structural_design_pattern.proxy.dynamicProxy;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class DynamicProxyDemoStart {

    public static void main(String[] args) {
        MetricsCollectorProxy metricsCollectorProxy = new MetricsCollectorProxy();
//         com.sun.proxy.$Proxy0 cannot be cast to com.example.study.structural_design_pattern.proxy.dynamicProxy.UserController
//        UserController userController = (UserController) metricsCollectorProxy.createProxy(new UserController());

//        入参需要为实现类  返回需要使用接口类接收
        UserControllerInterface userControllerInterface = (UserControllerInterface)metricsCollectorProxy.createProxy(new UserController());
        userControllerInterface.login("telephone","password");
    }

}
