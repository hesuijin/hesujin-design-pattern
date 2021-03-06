package com.example.study.structure_design_pattern.decorator.decorator;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */

public class OrderServiceImplDecorator implements OrderService {

    private OrderService orderService;

    public OrderServiceImplDecorator(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void finishOrder(int amount) {
        //积分抵扣
        amount = amount -5;
        orderService.finishOrder(amount);
    }
}
