package com.example.study.behavior_design_pattern.observer.eventBus.eventBusDemo;


import com.example.study.behavior_design_pattern.observer.eventBus.eventBusframe.AsyncEventBus;
import com.example.study.behavior_design_pattern.observer.eventBus.eventBusframe.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public class ObserverEventBusDemo {


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

        eventBus.post(eventBusData);

    }

}