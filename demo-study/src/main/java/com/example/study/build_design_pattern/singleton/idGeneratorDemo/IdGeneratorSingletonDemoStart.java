package com.example.study.build_design_pattern.singleton.idGeneratorDemo;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/1
 */
public class IdGeneratorSingletonDemoStart {

    public static void main(String[] args) {
        //已经被设置为单例了 饿汉式
        Long id1 = IdGeneratorSingletonHungry.getInstance().getId();
        System.out.println(id1);

        //已经被设置为单例了 饿汉式
        Long id2 = IdGeneratorSingletonLazy.getInstance().getId();
        System.out.println(id2);
    }
}
