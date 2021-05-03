package com.example.study.structure_design_pattern.decorator.streamDemo;

import java.io.*;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
public class FileInputStreamDemo {

    public void FileInputStreamDemo() throws IOException {
        InputStream inputStream = new FileInputStream("A:\\test.txt");
        //BufferedInputStream  继承了 InputStream  提供支持缓存读取数据 功能
        InputStream bufferedInputStream = new BufferedInputStream(inputStream);
        //DataInputStream  继承了 InputStream 提供基本类型读取数据 功能
        InputStream dataInputStream =new DataInputStream(bufferedInputStream);

        byte[] data = new byte[128];
        while (dataInputStream.read(data) != -1) {
            //...
        }
    }
}
