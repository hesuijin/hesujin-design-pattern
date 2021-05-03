package com.example.study.structure_design_pattern.decorator.decorator;

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
