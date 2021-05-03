package com.example.study.behavior_design_pattern.strategy.StrategyEnum;

import com.example.study.behavior_design_pattern.strategy.ConcreteStrategyA;
import com.example.study.behavior_design_pattern.strategy.ConcreteStrategyB;
import com.example.study.behavior_design_pattern.strategy.Strategy;
import org.springframework.util.StringUtils;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/3
 */
public enum  StrategyTypeEnum {

    ConcreteStrategyTypeA("ConcreteStrategyNameA","ConcreteStrategyA"),
    ConcreteStrategyTypeB("ConcreteStrategyNameB","ConcreteStrategyB");

    private String name;

    private String strategyType;

    StrategyTypeEnum(String name , String strategyType){
        this.name = name;
        this.strategyType = strategyType;
    }

    public String getName() {
        return name;
    }

    public String getStrategyType() {
        return strategyType;
    }

    //根据名称遍历 获取对应的对象
    public static String getStrategyeByName(String name){
        if (StringUtils.isEmpty(name)){
            return null;
        }
        for (StrategyTypeEnum strategyTypeEnum : StrategyTypeEnum.values()) {
            if (name.equals(strategyTypeEnum.getName())){
                return strategyTypeEnum.getStrategyType();
            }
        }
        return null;
    }
}
