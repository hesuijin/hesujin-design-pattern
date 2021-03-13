package com.example.study.behavior_design_pattern.obserber;


/**
 * @Author HeSuiJin
 * @Date 2021/3/13 13:32
 * @Description:
 */
public interface Observer {
    void fail(String message);

    void success(String message);
}
