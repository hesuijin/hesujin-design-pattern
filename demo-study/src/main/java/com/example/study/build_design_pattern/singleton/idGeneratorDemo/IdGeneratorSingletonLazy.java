package com.example.study.build_design_pattern.singleton.idGeneratorDemo;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description:懒汉式
 * @Author HeSuiJin
 * @Date 2021/5/1
 */
public class IdGeneratorSingletonLazy {

    private AtomicLong id = new AtomicLong(0);
    //初始化 instance 为空
    private static IdGeneratorSingletonLazy instance;

    private IdGeneratorSingletonLazy() {
    }

    //直接对该方法加锁
    public static synchronized IdGeneratorSingletonLazy getInstance() {
        if (instance == null) {
            instance = new IdGeneratorSingletonLazy();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
