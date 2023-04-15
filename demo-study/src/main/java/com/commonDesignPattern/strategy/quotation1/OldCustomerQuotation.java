package com.commonDesignPattern.strategy.quotation1;

public class OldCustomerQuotation implements ICustomerQuotation {

    @Override
        public Double getPriceQuotation(Double originalPrice) {
            return originalPrice*0.8;
        }
}