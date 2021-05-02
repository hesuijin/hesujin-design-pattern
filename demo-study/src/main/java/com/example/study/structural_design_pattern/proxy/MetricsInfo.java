package com.example.study.structural_design_pattern.proxy;


import lombok.Data;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/5/2
 */
@Data
public class MetricsInfo {

    private String event;

    private Long startTimestamp;

    private Long responseTime;

    public MetricsInfo(String event, Long startTimestamp, Long responseTime){
        this.event = event;
        this.startTimestamp = startTimestamp;
        this.responseTime = responseTime;
    }

}
