package com.example.study.behavior_design_pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/3
 */
//有状态  需要创建对象
public class StrategyFactoryState {

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }

        if("ConcreteStrategyA".equals(type)){
            return new ConcreteStrategyA();
        }else if ("ConcreteStrategyB".equals(type)){
            return new ConcreteStrategyB();
        }
        return null;
    }
}
