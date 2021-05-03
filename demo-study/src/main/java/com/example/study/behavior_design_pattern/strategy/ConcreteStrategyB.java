package com.example.study.behavior_design_pattern.strategy;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/3
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithmInterface() {
        //具体逻辑
        System.out.println("我是ConcreteStrategyB 的算法逻辑");
    }
}
