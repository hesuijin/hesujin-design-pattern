package com.commonDesignPattern.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RuleConfigParserJson extends RuleConfigParser {

    @Override
    public RuleConfiguration parse(String value) {
        log.info("RuleConfigParserJson");
        return new RuleConfigurationJson();
    }
}
