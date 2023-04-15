package com.commonDesignPattern.factory;

public class RuleConfigSource {
  public RuleConfiguration load(String ruleConfigFilePath) throws Exception {
    String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
    RuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);
    if (parser == null) {
      throw new
      Exception(
              "Rule config file format is not supported: " + ruleConfigFilePath);
    }

    String configText = "";
    //从ruleConfigFilePath文件中读取配置文本到configText中
    RuleConfiguration ruleConfiguration = parser.parse(configText);
    return ruleConfiguration;
  }

  private String getFileExtension(String filePath) {
    //...解析文件名获取扩展名，比如rule.json，返回json
    return "json";
  }
}

