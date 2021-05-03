package com.example.study.build_design_pattern.singleton.loggerDemo;

import java.io.IOException;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/1
 */
public class UserController {
    private Logger logger = new Logger();

    public UserController() throws IOException {
    }

    public void login() throws IOException {
        // ...省略业务逻辑代码...
        logger.log("HSJ  User  logined!");
    }
}
