package com.commonDesignPattern.strategy.quotation1;

public class NewCustomerQuotation implements ICustomerQuotation {

    //实现方法
    @Override
        public Double getPriceQuotation(Double originalPrice) {
            return originalPrice*0.9;
        }
}