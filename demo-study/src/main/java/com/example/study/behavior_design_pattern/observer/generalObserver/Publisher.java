package com.example.study.behavior_design_pattern.observer.generalObserver;


import java.util.List;

/**
 * @Author HeSuiJin
 * @Date 2021/3/13 13:31
 * @Description:
 */
public interface Publisher {
    //注册订阅者
    void registerObserver(Observer observer);

    //移除订阅者
    void removeObserver(Observer observer);

    //给所有发布者发布消息
    void notifyObserversSuccess(String message);

    //一次性注册所有发布者（可以不用
    void registerAllObserver(List<Observer> observers);
}
