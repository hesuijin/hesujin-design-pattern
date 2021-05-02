package com.example.study.behavior_design_pattern.template;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/3
 */
public class TemplateDemoStart {

    public static void main(String[] args) {
        AbstractClassTemplate concreteClassOne = new ConcreteClassOne();
        concreteClassOne.templateMethod();

        AbstractClassTemplate concreteClassTwo = new ConcreteClassTwo();
        concreteClassTwo.templateMethod();

    }

}
