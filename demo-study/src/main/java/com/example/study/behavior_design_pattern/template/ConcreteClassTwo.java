package com.example.study.behavior_design_pattern.template;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/3
 */
public class ConcreteClassTwo extends AbstractClassTemplate {

  @Override
  protected void methodOne() {
    System.out.println("我是ConcreteClassTwo 的  methodOne()");
  }
 
  @Override
  protected void methodTwo() {
    System.out.println("我是ConcreteClassTwo 的  methodTwo()");
  }
}