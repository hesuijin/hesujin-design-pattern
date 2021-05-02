package com.example.study.structural_design_pattern.decorator.decorator;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */

public class OrderServiceImpl implements OrderService {

    @Override
    public void finishOrder(int amount) {
        System.out.println("结束订单 扣除："+amount);
    }
}
