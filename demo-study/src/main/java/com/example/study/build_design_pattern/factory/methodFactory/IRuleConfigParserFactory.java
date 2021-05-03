package com.example.study.build_design_pattern.factory.methodFactory;

import com.example.study.build_design_pattern.factory.configParser.IRuleConfigParser;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public interface IRuleConfigParserFactory {

    IRuleConfigParser createParser();
}