package com.example.study.create_design_pattern.singleton.loggerDemo;

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
public class Logger {
    private FileWriter writer;

    public Logger() throws IOException {
        File file = new File("A:\\log.txt");
        //true表示追加写入
        writer = new FileWriter(file, true);
    }

    public void log(String message) throws IOException {
        log.info("写入数据：{}", message);
        //不加锁 有可能导致写入覆盖
        writer.write(message);

        //添加this  为对象级别的锁  锁无效
        synchronized (this) {
            writer.write(message);
        }

        //添加Logger.class  为类级别的锁  锁生效
        synchronized (Logger.class) {
            writer.write(message);
        }
        writer.write("\n");
        writer.close();
    }
}

