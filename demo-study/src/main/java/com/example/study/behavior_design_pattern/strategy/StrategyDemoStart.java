package com.example.study.behavior_design_pattern.strategy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/3
 */
public class StrategyDemoStart {

    public static void main(String[] args) throws IOException {

        strategyOne();

        strategyTwo();
    }

    private static void strategyOne() throws IOException {
        //运行时动态 根据配置文件的配置决定使用哪种策略
        Properties props = new Properties();
        props.load(new FileInputStream("./config.properties"));
        String strategyType = props.getProperty("eviction_type");

        StrategyFactoryStateless strategyFactoryStateless = new StrategyFactoryStateless();
        Strategy strategy = strategyFactoryStateless.getStrategy(strategyType);
        strategy.algorithmInterface();
    }

    private static void strategyTwo() {
        //非运行时动态  在代码中指定使用哪种策略
        StrategyFactoryStateless strategyFactoryStateless = new StrategyFactoryStateless();
        Strategy strategy = strategyFactoryStateless.getStrategy("ConcreteStrategyB");
        strategy.algorithmInterface();
    }
}
