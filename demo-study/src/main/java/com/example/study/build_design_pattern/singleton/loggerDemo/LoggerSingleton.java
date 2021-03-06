package com.example.study.build_design_pattern.singleton.loggerDemo;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/1
 */
@Slf4j
public class LoggerSingleton {

    //static 静态变量                    在类加载时初始化
    //final  变量变常量  只能被赋值一次  在类加载时初始化
    private static final   LoggerSingleton instance = new LoggerSingleton();
    public static LoggerSingleton getInstance() { return instance; }

    private FileWriter writer;

    public LoggerSingleton() {
        File file = new File("A:\\log.txt");
        //true表示追加写入
        try {
            writer = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) throws IOException {
        log.info("写入数据：{}", message);
        writer.write(message);
        writer.write("\n");
        writer.close();
    }
}
