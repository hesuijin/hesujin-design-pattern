package com.example.study.behavior_design_pattern.observer.eventBus.eventBusDemo;

import com.example.study.behavior_design_pattern.observer.eventBus.eventBusframe.Subscribe;

/**
 * 创建   订阅者 一
 * @Author HeSuiJin
 * @Date 2021/3/13 13:36
 * @Description:
 */
public class ConcreteObserverEventBusOne {

    @Subscribe
    public void success(String message) {
        //可以根据 发布者的消息 执行自己的逻辑
        System.out.println("ConcreteObserverEventBusOne is success." + message);
    }

    @Subscribe
    public void eventBusData(EventBusData eventBusData) {
        //可以根据 发布者的消息 执行自己的逻辑
        System.out.println("ConcreteObserverEventBusOne get data." + eventBusData);
    }

}
