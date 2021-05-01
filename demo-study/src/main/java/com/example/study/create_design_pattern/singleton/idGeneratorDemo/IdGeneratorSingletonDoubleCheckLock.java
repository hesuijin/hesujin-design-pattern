package com.example.study.create_design_pattern.singleton.idGeneratorDemo;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description:双重校验锁
 * @Author HeSuiJin
 * @Date 2021/5/1
 */
public class IdGeneratorSingletonDoubleCheckLock {

    private AtomicLong id = new AtomicLong(0);
    //volatile 防止指令重排
    private static volatile IdGeneratorSingletonDoubleCheckLock instance;

    private IdGeneratorSingletonDoubleCheckLock() {
    }

    public static IdGeneratorSingletonDoubleCheckLock getInstance() {
        if (instance == null) {
            // 此处为类级别的锁
            synchronized (IdGeneratorSingletonDoubleCheckLock.class) {
                if (instance == null) {
                    instance = new IdGeneratorSingletonDoubleCheckLock();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
