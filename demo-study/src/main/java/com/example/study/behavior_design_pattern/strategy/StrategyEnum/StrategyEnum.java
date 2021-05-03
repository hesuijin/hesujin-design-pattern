package com.example.study.behavior_design_pattern.strategy.StrategyEnum;

import com.example.study.behavior_design_pattern.strategy.ConcreteStrategyA;
import com.example.study.behavior_design_pattern.strategy.ConcreteStrategyB;
import com.example.study.behavior_design_pattern.strategy.Strategy;
import org.springframework.util.StringUtils;

public enum StrategyEnum {

    ConcreteStrategyA("ConcreteStrategyA",new ConcreteStrategyA()),
    ConcreteStrategyB("ConcreteStrategyB",new ConcreteStrategyB());

    private String name;

    private Strategy strategy;

    StrategyEnum(String name , Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }

    public String getName() {
    return name;
    }

    public Strategy getStrategy() {
      return strategy;
    }

    //根据名称遍历 获取对应的对象
    public static Strategy getStrategyeByName(String name){
    if (StringUtils.isEmpty(name)){
        return null;
     }
    for (StrategyEnum strategyEnum : StrategyEnum.values()) {
        if (name.equals(strategyEnum.getName())){
            return strategyEnum.getStrategy();
        }
    }
    return null;
    }
}