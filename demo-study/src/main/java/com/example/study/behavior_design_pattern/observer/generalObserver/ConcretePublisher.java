package com.example.study.behavior_design_pattern.observer.generalObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 创建发布者  发布者可以  注册/移除 订阅者   可以给所有的订阅者发信息
 *
 * @Author HeSuiJin
 * @Date 2021/3/13 13:32
 * @Description:
 */
public class ConcretePublisher implements Publisher {

    private List<Observer> observers = new ArrayList();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //    同步阻塞
    @Override
    public void notifyObserversSuccess(String message) {
        for (Observer observer : observers) {
            observer.success(message);
        }
    }

    @Override
    public void registerAllObserver(List<Observer> observers) {
        this.observers = observers;
    }

//    异步非阻塞 新增线程
//    @Override
//    public void notifyObserversSuccess(String message) {
//        for (Observer observer : observers) {
//            Thread thread = new Thread(() -> {
//                observer.success(message);
//            });
//            thread.start();
//        }
//    }

//    创建线程池
//    private static  ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 0L,
//            TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(1024));


//    异步非阻塞 新增线程池
//    @Override
//    public void notifyObserversSuccess(String message) {
//        for (Observer observer : observers) {
//            threadPoolExecutor.execute(() -> observer.success(message));
//        }
//    }
}
