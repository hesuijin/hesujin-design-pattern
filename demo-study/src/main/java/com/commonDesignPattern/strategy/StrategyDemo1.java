package com.commonDesignPattern.strategy;

import com.commonDesignPattern.strategy.quotation1.*;


public class StrategyDemo1 {

    public static void main(String[] args) {
        getPriceByCustomerType("新用户");
    }

    public static Double getPriceByCustomerType(String customerType) {
        Double originalPrice = 100.00;
        //策略接口
        ICustomerQuotation quotation;

        //在if-else中 仅负责 新建对象  即是选择不同的逻辑
        //根据类型用户类型 new  一个实现策略接口的  策略实现类对象（里面是不同逻辑实现）
        if ("新用户".equals(customerType)) {
            quotation = new NewCustomerQuotation();
        } else if ("老用户".equals(customerType)) {
            quotation = new OldCustomerQuotation();
        } else if ("Vip用户".equals(customerType)){
            quotation = new VIPCustomerQuotation();
        } else {
            quotation = new NewCustomerQuotation();
        }

        //通过使用 策略实现类对象 在上下文的类中去使用该对象
        CustomerQuotationContext customerQuotationContext = new CustomerQuotationContext(quotation);

        //使用该上下类的方法  这个时候已经会在里面调用 策略实现类对象的方法了
        return customerQuotationContext.getPrice(originalPrice);
    }
}
