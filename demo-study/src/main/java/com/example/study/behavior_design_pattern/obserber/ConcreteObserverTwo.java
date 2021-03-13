package com.example.study.behavior_design_pattern.obserber;

/**
 * 创建   订阅者 二
 * @Author HeSuiJin
 * @Date 2021/3/13 13:36
 * @Description:
 */
public class ConcreteObserverTwo  implements Observer {

    @Override
    public void update(String message) {
        //可以根据 发布者的消息 执行自己的逻辑
        System.out.println("ConcreteObserverTwo is notified." +message);
    }
}
