package com.example.study.junit;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

/**
 * @Author HeSuiJin
 * @Date 2021/3/13 21:35
 * @Description:
 */
@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
public class TestDemo {

    @Test
    public void testDemo(){
        System.out.println("测试");
    }

}
