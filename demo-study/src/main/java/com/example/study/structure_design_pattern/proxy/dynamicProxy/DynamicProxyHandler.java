package com.example.study.structure_design_pattern.proxy.dynamicProxy;

import com.example.study.structure_design_pattern.proxy.MetricsCollector;
import com.example.study.structure_design_pattern.proxy.MetricsInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
class DynamicProxyHandler implements InvocationHandler {

    private Object proxiedObject;
    private MetricsCollector metricsCollector;

    public DynamicProxyHandler(Object proxiedObject,MetricsCollector metricsCollector) {
      this.proxiedObject = proxiedObject;
      this.metricsCollector = metricsCollector;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      long startTimestamp = System.currentTimeMillis();

      //真正的执行相关方法
      Object result = method.invoke(proxiedObject, args);

      long endTimeStamp = System.currentTimeMillis();
      long responseTime = endTimeStamp - startTimestamp;
      String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
      MetricsInfo metricsInfo = new MetricsInfo(apiName, responseTime, startTimestamp);
      metricsCollector.recordRequest(metricsInfo);
      return result;
    }
  }