package com.example.study.behavior_design_pattern.observer.eventBus.eventBusframe;

import com.example.study.behavior_design_pattern.observer.generalObserver.Observer;
import com.google.common.util.concurrent.MoreExecutors;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * EventBus 实现的是阻塞同步的观察者模式
 * @Author HeSuiJin
 * @Date 2021/3/13 19:06
 * @Description:
 */

public class EventBus {
    private Executor executor;
    private ObserverRegistry registry = new ObserverRegistry();

    /**
     * MoreExecutors.directExecutor() 是 Google Guava 提供的工具类，看似是多线程，实际上是单线程
     *  之所以要这么实现，主要还是为了跟 AsyncEventBus 统一代码逻辑，做到代码复用。
     *  构造方法单线程
     */
    public EventBus() {
        this(MoreExecutors.directExecutor());
    }
    //与AsyncEventBus的构造方法代码复用
    protected EventBus(Executor executor) {
        this.executor = executor;
    }

    /**
     * @param object
     */
    public void register(Object object) {
        registry.register(object);
    }

    /**
     * @param objects
     */
    public void registerAllObserver(List<Object> objects) {
        objects.forEach(object -> registry.register(object));
    }

    public void post(Object event) {
        List<ObserverAction> observerActions = registry.getMatchedObserverActions(event);
        for (ObserverAction observerAction : observerActions) {
            executor.execute(() -> observerAction.execute(event));
        }
    }
}
