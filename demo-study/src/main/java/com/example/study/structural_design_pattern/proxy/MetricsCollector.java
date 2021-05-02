package com.example.study.structural_design_pattern.proxy;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
@Component
public class MetricsCollector {

    public void recordRequest(MetricsInfo metricsInfo){
        System.out.println("event：  "+ metricsInfo.getEvent());
        System.out.println("StartTimestamp：  "+ metricsInfo.getStartTimestamp());
        System.out.println("ResponseTime：  "+ metricsInfo.getResponseTime());
    }
}
