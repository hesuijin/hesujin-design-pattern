package com.example.study.behavior_design_pattern.template;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/3
 */
public abstract class AbstractClassTemplate {

  //使用templateMethod方法依次执行对应方法
  //使用final避免子类重写
  public final void templateMethod() {
    methodOne();
    methodTwo();
  }
  
  protected abstract void methodOne();
  protected abstract void methodTwo();
}