package com.example.study.behavior_design_pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/3
 */
//无状态  可以缓存对象
public class StrategyFactoryStateless {

    private static final Map <String,Strategy> strategies = new HashMap<>();

    static {
        strategies.put("ConcreteStrategyA", new ConcreteStrategyA());
        strategies.put("ConcreteStrategyB", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }
}
