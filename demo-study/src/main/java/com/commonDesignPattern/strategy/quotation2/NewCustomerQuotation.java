package com.commonDesignPattern.strategy.quotation2;

import org.springframework.stereotype.Service;

@Service
public class NewCustomerQuotation implements ICustomerQuotation {

    //实现方法
    @Override
        public Double getPriceQuotation(Double originalPrice) {
            return originalPrice*0.9;
        }

    @Override
    public String getCustomerType() {
        return "新用户";
    }
}