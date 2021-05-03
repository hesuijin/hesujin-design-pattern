package com.example.study.behavior_design_pattern.strategy.StrategyEnum;

import com.example.study.behavior_design_pattern.strategy.ConcreteStrategyA;
import com.example.study.behavior_design_pattern.strategy.ConcreteStrategyB;
import com.example.study.behavior_design_pattern.strategy.Strategy;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/3
 */
public class StrategyFactoryStateEnum {

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }

        //使用枚举获取对象
        return StrategyEnum.getStrategyeByName(type);
    }
}
