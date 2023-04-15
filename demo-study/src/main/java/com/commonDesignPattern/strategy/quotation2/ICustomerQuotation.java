package com.commonDesignPattern.strategy.quotation2;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public interface ICustomerQuotation {

    public static Map<String,ICustomerQuotation> strategyMap = new ConcurrentHashMap<>();

    //抽象方法
     Double getPriceQuotation(Double originalPrice);

     //获取Type
     public String getCustomerType();

     @PostConstruct
//        1：已经调用了实现类的getCustomerType()方法
//        2：返回  策略实现类对象
//        3：策略类型作为key值  策略实现类对象作为Value存放在map中
    default public void initStrategy(){
         strategyMap.put(getCustomerType(),this);
     }

}