package com.example.study.build_design_pattern.factory.methodFactory;

import com.example.study.build_design_pattern.factory.configParser.IRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class RuleConfigSourceCreateParserMethodFactoryMap {

    private static final Map<String,IRuleConfigParserFactory> cachedParsers = new HashMap<>();

    //类加载的时候已经执行了  这时候cachedParsers 就可以获取到对应发map集合
    static {
        cachedParsers.put("yaml", new YamlRuleConfigParserFactory());
        cachedParsers.put("properties", new PropertiesRuleConfigParserFactory());
    }

    private IRuleConfigParser createParser(String ruleConfigFileExtension) {

        if (ruleConfigFileExtension == null || ruleConfigFileExtension.isEmpty()) {
            //返回null  或者 IllegalArgumentException都行
            return null;
        }
        //根据文件 后缀名称获取相应的配置
        IRuleConfigParserFactory iRuleConfigParserFactory = cachedParsers.get(ruleConfigFileExtension);

        return iRuleConfigParserFactory.createParser();
    }
}
