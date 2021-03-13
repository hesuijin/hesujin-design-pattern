package com.example.study.behavior_design_pattern.obserber;


import java.util.List;

/**
 * @Author HeSuiJin
 * @Date 2021/3/13 13:31
 * @Description:
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    /**
     * 全部方法执行一遍
     * @param messsage
     */
    void notifyObservers(String messsage);

    void notifyObserversFail(String message);
    void notifyObserversSuccess(String message);

    void registerAllObserver(List<Observer> observers);
}
