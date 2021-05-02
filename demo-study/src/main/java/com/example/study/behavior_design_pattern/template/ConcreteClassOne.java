package com.example.study.behavior_design_pattern.template;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/3
 */
public class ConcreteClassOne extends AbstractClassTemplate {

  @Override
  protected void methodOne() {
    System.out.println("我是ConcreteClassOne 的  methodOne()");
  }
 
  @Override
  protected void methodTwo() {
    System.out.println("我是ConcreteClassOne 的  methodTwo()");
  }
}