package com.commonDesignPattern.strategy;

import com.alibaba.fastjson.JSONObject;
import com.commonDesignPattern.strategy.quotation2.CustomerQuotationContext;


import com.commonDesignPattern.strategy.quotation2.ICustomerQuotation;
import com.commonDesignPattern.strategy.quotation2.NewCustomerQuotation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
//@Service
public class StrategyDemo2 {

//    public static void main(String[] args) {
//        getPriceByCustomerType("新用户");
//    }

//    @GetMapping("mytest")
    public Double getPriceByCustomerType(String customerType) {
        Double originalPrice = 100.00;

        log.info("此方法会获取到：{}",JSONObject.toJSONString(ICustomerQuotation.strategyMap));
        //策略接口
        ICustomerQuotation quotation =ICustomerQuotation.strategyMap.get(customerType);

        //避免获取不到类型对应的策略对象
        if(quotation == null){
            quotation = new NewCustomerQuotation();
        }

        //通过使用 策略实现类对象 在上下文的类中去使用该对象
        CustomerQuotationContext customerQuotationContext = new CustomerQuotationContext(quotation);

        //使用该上下类的方法  这个时候已经会在里面调用 策略实现类对象的方法了
        return customerQuotationContext.getPrice(originalPrice);
    }
}
