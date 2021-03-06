package com.example.study.build_design_pattern.factory.simpleFactory;

import com.example.study.build_design_pattern.factory.configParser.IRuleConfigParser;
import com.example.study.build_design_pattern.factory.configParser.PropertiesRuleConfigParser;
import com.example.study.build_design_pattern.factory.configParser.YamlRuleConfigParser;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class RuleConfigSourceCreateParserFactoryOne {

    private IRuleConfigParser createParser(String ruleConfigFileExtension){
        IRuleConfigParser parser = null;
        //根据文件 后缀名称获取相应的配置
        if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}
