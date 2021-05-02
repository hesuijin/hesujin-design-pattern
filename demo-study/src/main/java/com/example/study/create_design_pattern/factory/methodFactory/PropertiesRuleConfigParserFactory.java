package com.example.study.create_design_pattern.factory.methodFactory;

import com.example.study.create_design_pattern.factory.configParser.IRuleConfigParser;
import com.example.study.create_design_pattern.factory.configParser.PropertiesRuleConfigParser;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        //可以在接口实现层 做组合
        return new PropertiesRuleConfigParser();
    }
}