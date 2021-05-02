package com.example.study.structural_design_pattern.proxy.dynamicProxy;

import com.example.study.structural_design_pattern.proxy.MetricsCollector;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Proxy;

public class MetricsCollectorProxy {
    @Autowired
    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public Object createProxy(Object proxiedObject) {

        // 目标类的类加载
        ClassLoader classLoader = proxiedObject.getClass().getClassLoader();
        // 代理需要实现的接口，可指定多个
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        //代理对象对应的自定义 InvocationHandler
        //注意 DynamicProxyHandler 是new出来的 因此要通过参数的方式注入metricsCollector
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject,metricsCollector);

        //创建对应需要代理的实例
        return Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}

