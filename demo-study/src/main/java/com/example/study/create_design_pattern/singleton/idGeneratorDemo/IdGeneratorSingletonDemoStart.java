package com.example.study.create_design_pattern.singleton.idGeneratorDemo;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/1
 */
public class IdGeneratorSingletonDemoStart {

    public static void main(String[] args) {
        //已经被设置为单例了
        Long id = IdGeneratorSingleton.getInstance().getId();
        System.out.println(id);
    }
}
