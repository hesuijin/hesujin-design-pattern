package com.example.study.build_design_pattern.singleton.idGeneratorDemo;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description: 内部静态类
 * @Author HeSuiJin
 * @Date 2021/5/1
 */
public class IdGeneratorSingletonInnerClass {

    private AtomicLong id = new AtomicLong(0);
    private IdGeneratorSingletonInnerClass() {
    }

    private static class SingletonHolder {
        //饿汉式  创建单例
        private static final IdGeneratorSingletonInnerClass instance = new IdGeneratorSingletonInnerClass();
    }

    //懒汉式  加载  当外部类 IdGenerator 被加载的时候，并不会创建 SingletonHolder 实例对象
    public static IdGeneratorSingletonInnerClass getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet(); }

}
