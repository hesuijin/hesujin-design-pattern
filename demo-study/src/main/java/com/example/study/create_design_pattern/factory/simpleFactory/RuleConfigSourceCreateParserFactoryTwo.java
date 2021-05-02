package com.example.study.create_design_pattern.factory.simpleFactory;

import com.example.study.create_design_pattern.factory.simpleFactory.parser.IRuleConfigParser;
import com.example.study.create_design_pattern.factory.simpleFactory.parser.PropertiesRuleConfigParser;
import com.example.study.create_design_pattern.factory.simpleFactory.parser.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class RuleConfigSourceCreateParserFactoryTwo {

    private static final Map<String,IRuleConfigParser> cachedParsers = new HashMap<>();

    //类加载的时候已经执行了  这时候cachedParsers 就可以获取到对应发map集合
    static {
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    private IRuleConfigParser createParser(String ruleConfigFileExtension) {

        if (ruleConfigFileExtension == null || ruleConfigFileExtension.isEmpty()) {
            //返回null  或者 IllegalArgumentException都行
            return null;
        }
        //根据文件 后缀名称获取相应的配置
        IRuleConfigParser parser = cachedParsers.get(ruleConfigFileExtension);
        return parser;
    }

    public static void main(String[] args) {
        cachedParsers.get(null);
    }
}
