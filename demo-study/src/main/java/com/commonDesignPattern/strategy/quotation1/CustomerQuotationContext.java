package com.commonDesignPattern.strategy.quotation1;

public class CustomerQuotationContext {
    private ICustomerQuotation quotation;

    //引入 策略对象
    public CustomerQuotationContext(ICustomerQuotation quotation) {
        this.quotation = quotation;
    }

    //使用 策略对象
    public Double getPrice(Double originalPrice) {
        System.out.println("进行一些前置处理");
        Double price = quotation.getPriceQuotation(originalPrice);
        System.out.println("进行一些后置处理");
        return price;
    }
}