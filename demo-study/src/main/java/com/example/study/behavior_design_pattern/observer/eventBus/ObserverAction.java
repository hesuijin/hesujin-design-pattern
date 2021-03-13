package com.example.study.behavior_design_pattern.observer.eventBus;

import com.google.common.base.Preconditions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ObserverAction 类用来表示 @Subscribe 注解的方法，其中，
 * target 表示观察者类，method 表示方法。
 * 它主要用在 ObserverRegistry 观察者注册表中。
 * @Author HeSuiJin
 * @Date 2021/3/13 18:56
 * @Description:
 */
@Slf4j
public class ObserverAction {

    @Autowired
    private ThreadPoolExecutor threadPoolExecutor;

    private Object target;
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = Preconditions.checkNotNull(target);
        this.method = method;
        this.method.setAccessible(true);
    }



    public void execute(Object event) {
        // event是method方法的参数
        try {
            method.invoke(target, event);
        } catch (InvocationTargetException | IllegalAccessException e) {
            log.info("ObserverAction execute异常"+e.getMessage(),e);
        }
        threadPoolExecutor.execute(()->{System.out.println("faf");});
    }
}
