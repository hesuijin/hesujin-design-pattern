package com.commonDesignPattern.factory;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactory {


    /**
     * 简单工厂的第一种方法
     * @param configFormat
     * @return
     */
//    public static RuleConfigParser createParser(String configFormat) {
//        RuleConfigParser parser = null;
//        if ("json".equalsIgnoreCase(configFormat)) {
//            parser = new RuleConfigParserJson();
//        } else if ("xml".equalsIgnoreCase(configFormat)) {
//            parser = new RuleConfigParserXml();
//        }
//        return parser;
//    }


    private static final Map cachedParsers = new HashMap<>();

    static {
        //创建后缓存起来
        cachedParsers.put("json", new RuleConfigParserJson());
        cachedParsers.put("xml", new RuleConfigParserXml());
    }

    /**
     * 简单工厂的第二种方法
     * @param configFormat
     * @return
     */
    public static RuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null;//返回null还是IllegalArgumentException全凭你自己说了算
        }
        RuleConfigParser parser = (RuleConfigParser) cachedParsers.get(configFormat.toLowerCase());
        return parser;
    }
}
