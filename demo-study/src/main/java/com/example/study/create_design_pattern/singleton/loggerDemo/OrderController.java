package com.example.study.create_design_pattern.singleton.loggerDemo;

import java.io.IOException;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/1
 */
public class OrderController {
    private Logger logger = new Logger();

    public OrderController() throws IOException {
    }

    public void create() throws IOException {
        // ...省略业务逻辑代码...
        logger.log("Created an order");
    }
}

