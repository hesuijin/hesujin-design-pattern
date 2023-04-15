package com.commonDesignPattern.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RuleConfigParserXml extends RuleConfigParser {

    @Override
    public RuleConfiguration parse(String value) {
        log.info("RuleConfigParserXml");
        return new RuleConfigurationXml();
    }
}
