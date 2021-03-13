package com.example.study.behavior_design_pattern.obserber;



/**
 * @Author HeSuiJin
 * @Date 2021/3/13 13:31
 * @Description:
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
