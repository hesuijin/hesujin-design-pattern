package com.commonDesignPattern.strategy.quotation1;

public class VIPCustomerQuotation implements ICustomerQuotation {

    @Override
        public Double getPriceQuotation(Double originalPrice) {
            return originalPrice*0.7;
        }
}