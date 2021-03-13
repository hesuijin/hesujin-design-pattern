package com.example.study.behavior_design_pattern.observer.eventBus;

import java.util.concurrent.Executor;

/**
 * 。为了实现异步非阻塞的观察者模式，它就不能再继续使用 MoreExecutors.directExecutor() 了，
 * 而是需要在构造函数中，由调用者注入线程池。
 * @Author HeSuiJin
 * @Date 2021/3/13 19:07
 * @Description:
 */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
