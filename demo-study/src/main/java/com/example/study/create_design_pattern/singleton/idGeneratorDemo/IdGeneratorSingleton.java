package com.example.study.create_design_pattern.singleton.idGeneratorDemo;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/1
 */
public class IdGeneratorSingleton {
    // AtomicLong是一个Java并发库中提供的一个原子变量类型
    // 它将一些线程不安全需要加锁的复合操作封装为了线程安全的原子操作
    // 比如下面会用到的incrementAndGet().

    private AtomicLong id = new AtomicLong(0);
    private static final IdGeneratorSingleton instance = new IdGeneratorSingleton();

    public static IdGeneratorSingleton getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
