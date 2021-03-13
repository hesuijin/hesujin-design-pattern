package com.example.study.behavior_design_pattern.observer;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 创建   订阅者 一
 * @Author HeSuiJin
 * @Date 2021/3/13 13:36
 * @Description:
 */
public class ConcreteObserverOne implements Observer{

    @Override
    public void success(String message) {
        //可以根据 发布者的消息 执行自己的逻辑
        System.out.println("ConcreteObserverOne is success." + message);
    }
}
