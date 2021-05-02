package com.example.study.create_design_pattern.factory.simpleFactory;

import com.example.study.create_design_pattern.factory.simpleFactory.configParser.IRuleConfigParser;
import com.example.study.create_design_pattern.factory.simpleFactory.configParser.PropertiesRuleConfigParser;
import com.example.study.create_design_pattern.factory.simpleFactory.configParser.YamlRuleConfigParser;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class RuleConfigSourceCreateParserMethod {

    public String load(String ruleConfigFilePath) throws Exception {
        //获取文件后缀名称
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        //把创建方法独立抽取出来
        IRuleConfigParser parser = createParser(ruleConfigFileExtension);
        if(parser == null){
                throw new Exception("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        //使用对应对象的方法
        String ruleConfig = parser.parser();
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.yaml，返回yaml 比如rule.properties，返回properties
        return "yaml";
    }

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
