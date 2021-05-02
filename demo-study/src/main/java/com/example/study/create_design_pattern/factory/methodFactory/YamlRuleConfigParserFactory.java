package com.example.study.create_design_pattern.factory.methodFactory;

import com.example.study.create_design_pattern.factory.configParser.IRuleConfigParser;
import com.example.study.create_design_pattern.factory.configParser.YamlRuleConfigParser;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        //可以在接口实现层 做组合
        return new YamlRuleConfigParser();
    }
}