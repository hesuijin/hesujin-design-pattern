package com.example.study.behavior_design_pattern.observer.eventBus.eventBusDemo;


import com.example.study.behavior_design_pattern.observer.eventBus.eventBusframe.AsyncEventBus;
import com.example.study.behavior_design_pattern.observer.eventBus.eventBusframe.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public class ObserverEventBusDemo {

//    当调用 register() 函数注册观察者的时候，EventBus 通过解析 @Subscribe 注解，生成 Observer 注册表。
//    当调用 post() 函数发送消息的时候，EventBus 通过注册表找到相应的可接收消息的函数，然后通过 Java 的反射语法来动态地创建对象、执行函数。
//    对于同步阻塞模式，EventBus 在一个线程内依次执行相应的函数。
//    对于异步非阻塞模式，EventBus 通过一个线程池来执行相应的函数。

    public static void main(String[] args) {
//        subject中直接add
        test1();
//        先创建observe再add
        test2();
    }

    private static void test1() {
        //EventBus eventBus = new EventBus();
        AsyncEventBus eventBus = new AsyncEventBus(Executors.newFixedThreadPool(10));

        eventBus.register(new ConcreteObserverEventBusOne());
        eventBus.register(new ConcreteObserverEventBusTwo());
        //1：添加到event注册表的类
        //2：方法使用了@Subscribe注解
        //3：方法类型为String
        eventBus.post("我是字符串");

    }

    private static void test2() {
        EventBus eventBus = new EventBus();
//        AsyncEventBus eventBus = new AsyncEventBus(Executors.newFixedThreadPool(10));

        List<Object> objects =new ArrayList<>();
        objects.add(new ConcreteObserverEventBusOne());
        objects.add(new ConcreteObserverEventBusTwo());

        eventBus.registerAllObserver(objects);
        EventBusData eventBusData = new EventBusData();
        eventBusData.setEvent("event");
        eventBusData.setData("date");

        //1：添加到event注册表的类
        //2：方法使用了@Subscribe注解
        //3：方法类型为EventBusData
        eventBus.post(eventBusData);

    }

}