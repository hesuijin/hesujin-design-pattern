package com.example.study.behavior_design_pattern.obserber;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建发布者  发布者可以  注册/移除 订阅者   可以给所有的订阅者发信息
 * @Author HeSuiJin
 * @Date 2021/3/13 13:32
 * @Description:
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
