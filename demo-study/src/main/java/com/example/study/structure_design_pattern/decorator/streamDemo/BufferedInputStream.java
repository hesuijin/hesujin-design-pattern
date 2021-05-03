package com.example.study.structure_design_pattern.decorator.streamDemo;

import java.io.*;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class BufferedInputStream extends InputStream {

    protected volatile InputStream in;

    protected BufferedInputStream(InputStream in) {
        System.out.println("提供支持缓存读取数据 功能");
        this.in = in;
    }

    //...实现基于缓存的读数据接口...
    @Override
    public int read() throws IOException {
        return 0;
    }

}

