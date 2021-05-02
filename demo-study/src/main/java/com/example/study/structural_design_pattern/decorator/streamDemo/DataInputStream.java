package com.example.study.structural_design_pattern.decorator.streamDemo;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class DataInputStream extends InputStream {
    protected volatile InputStream in;
    protected DataInputStream(InputStream in) {
        System.out.println("提供基本类型读取数据 功能");
        this.in = in;
    }
    //...实现读取基本类型数据的接口
    @Override
    public int read() throws IOException {
        return 0;
    }
}