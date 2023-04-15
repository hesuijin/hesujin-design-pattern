package com.commonDesignPattern.strategy.quotation2;

import org.springframework.stereotype.Service;

@Service
public class OldCustomerQuotation implements ICustomerQuotation {

    @Override
        public Double getPriceQuotation(Double originalPrice) {
            return originalPrice*0.8;
        }

    @Override
    public String getCustomerType() {
        return "老用户";
    }

}