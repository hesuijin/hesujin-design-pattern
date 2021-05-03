package com.example.study.behavior_design_pattern.strategy.StrategyEnum;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.alibaba.fastjson.JSONObject;
import com.example.study.behavior_design_pattern.strategy.ConcreteStrategyA;
import com.example.study.behavior_design_pattern.strategy.ConcreteStrategyB;
import com.example.study.behavior_design_pattern.strategy.Strategy;
import org.springframework.beans.BeanUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/3
 */
public class StrategyFactoryStatelessEnum {

    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("ConcreteStrategyA", new ConcreteStrategyA());
        strategies.put("ConcreteStrategyB", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        //使用JSONObject进行深拷贝
        Strategy strategy = JSONObject.parseObject(JSONObject.toJSONString(strategies.get(type)), Strategy.class);
        return strategy;
    }
}
