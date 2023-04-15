package com.commonDesignPattern.strategy.quotation2;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomerQuotationContext {
    private ICustomerQuotation quotation;

    //引入 策略对象
    public CustomerQuotationContext(ICustomerQuotation quotation) {
        this.quotation = quotation;
    }

    //使用 策略对象
    public Double getPrice(Double originalPrice) {
        log.info("处理前金额：{}",originalPrice);
        Double price = quotation.getPriceQuotation(originalPrice);
        log.info("处理后金额：{}",price);
        return price;
    }
}