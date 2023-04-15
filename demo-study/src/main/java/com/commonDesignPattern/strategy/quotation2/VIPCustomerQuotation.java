package com.commonDesignPattern.strategy.quotation2;

import org.springframework.stereotype.Service;

@Service
public class VIPCustomerQuotation implements ICustomerQuotation {

    @Override
        public Double getPriceQuotation(Double originalPrice) {
            return originalPrice*0.7;
        }

    @Override
    public String getCustomerType() {
        return "Vip用户";
    }
}