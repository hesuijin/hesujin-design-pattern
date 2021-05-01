package com.example.study.create_design_pattern.singleton.loggerDemo;

import java.io.IOException;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/1
 */
public class LoggerSingletonDemoStart {

    public static void main(String[] args) throws IOException {
        new LoggerSingleton();

        //这样就只能获取该单例的Logger对象
        LoggerSingleton.getInstance().log("我是测试单例的Logger啊");
        LoggerSingleton.getInstance().log("我是测试单例的Logger啊");
    }
}
