package com.example.study.structure_design_pattern.decorator.decorator;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class OrderDecoratorDemoStart {

    public static void main(String[] args) {

        OrderService orderService =new OrderServiceImpl();
        orderService.finishOrder(10);

        //对OrderService 的实现类的具体方法做了增强
        OrderService orderServiceOther =new OrderServiceImpl();
        OrderService orderServiceDecorator =new OrderServiceImplDecorator(orderServiceOther);
        orderServiceDecorator.finishOrder(10);
    }
}
