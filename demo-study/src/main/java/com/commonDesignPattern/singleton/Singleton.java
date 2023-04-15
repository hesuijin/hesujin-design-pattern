package com.commonDesignPattern.singleton;


import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
public class Singleton {

    public static void main(String[] args) throws IOException {
        Logger logger = new Logger();
        logger.log("111");
    }

    public static class Logger {
        private FileWriter writer;

        public Logger() {
            File file = new File("A:/ProjectsDemo/hesuijin-project/log/project-design-pattern/log.txt");
//            File file = new File("C:/Users/wangzheng/log.txt");
            try {
                writer = new FileWriter(file, true); //true表示追加写入
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void log(String message) {
            try {
                writer.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Logger类的应用示例：
    public class UserController {
        private Logger logger = new Logger();

        public void login(String username, String password) {
            // ...省略业务逻辑代码...
            logger.log(username + " logined!");
        }
    }

    public class OrderController {
        private Logger logger = new Logger();

//        public void create(OrderVo order) {
//            // ...省略业务逻辑代码...
//            logger.log("Created an order: " + order.toString());
//        }
    }


}
