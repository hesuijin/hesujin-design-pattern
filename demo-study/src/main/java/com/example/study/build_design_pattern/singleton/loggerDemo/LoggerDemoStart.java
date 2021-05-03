package com.example.study.build_design_pattern.singleton.loggerDemo;

import java.io.IOException;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/1
 */
public class LoggerDemoStart {

    public static void main(String[] args) throws IOException, InterruptedException {

        //线程1 执行user方法
        new Thread(()->{
            try {
                UserController userController = new UserController();
                userController.login();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        //线程2 执行order方法
        new Thread(()->{
            try {
                OrderController  orderController = new OrderController();
                orderController.create();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();


        Thread.sleep(10000L);
    }
}
