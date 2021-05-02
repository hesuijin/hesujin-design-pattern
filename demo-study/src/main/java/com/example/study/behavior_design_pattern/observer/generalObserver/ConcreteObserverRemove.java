package com.example.study.behavior_design_pattern.observer.generalObserver;

/**
 * 创建   订阅者 （会被移除）
 * @Author HeSuiJin
 * @Date 2021/5/03
 * @Description:
 */
public class ConcreteObserverRemove implements Observer{

    @Override
    public void success(String message) {
        //可以根据 发布者的消息 执行自己的逻辑
        System.out.println("ConcreteObserverRemove is success." + message);
    }
}
