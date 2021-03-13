package com.example.study.behavior_design_pattern.obserber;


public class ObserberDemo {
    public static void main(String[] args) {
//        1：设置 发布者订阅者   模块方法  Observer Subject
//        2：创建 发布者订阅者   实现类  ConcreteSubject  ConcreteObserver
//        3：订阅者 注册到发布者上 表示监听发布者
//        4：给发布者发送消息  然后监听该发布者的所有订阅者 都能收到

        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());

        subject.notifyObservers("你好啊");
    }
}