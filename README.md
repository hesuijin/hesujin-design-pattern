#### 项目介绍
    以各种常用的设计模式Demo代码组合成的项目,方便学习以及整理。
    配合我在简书的技术文章食用 效果更佳 https://www.jianshu.com/nb/49695197

#### 项目背景
    由于工作上经常需要使用到常见的设计模式，但一直没有做比较系统的整理，
    因此通过阅读极客时间王争老师的设计模式之美并且进行代码上的实战,
    运用常见的设计模式，整理成该项目。

##### 三大类设计模式介绍
    创建型模式（build_design_pattern）     是将创建和使用代码解耦    
    结构型模式（structure_design_pattern） 是将不同大功能的代码解耦
    行为型模式（behavior_design_pattern）  是将不同小行为的代码解耦

#### 文章阅读流程：   
    目录：
    如何写好代码
    1：创建型  单例模式           
    2：创建型  工厂模式   
    3：结构型  代理模式
    4：结构型  装饰器模式
    5：行为型  模板模式
    6：行为型  观察者模式
    7：行为型  策略模式
    
    至此：常用的设计模式的相关已经编写完成
 
    注意：现在已经完成了常用设计模式的文章以及相关代码编写
          后续有时间会继续编写本设计模式项目 
       
#### 个人博客(上述文章)   
    文章链接：https://www.jianshu.com/nb/49695197
    简书：https://www.jianshu.com/u/5adf0da43d75
    
#### 常用设计模式介绍

    1：单例模式  
                创建一个单例对象 避免重复创建对象而导致的资源浪费
    
    2：工厂模式  
                 主要分简单工厂 工厂方法  抽象工厂        
                 其中抽象工厂了解即可：实际上是一个类中创建多类对象
                  
                 简单工厂：把创建对象的逻辑抽取出来 形成一个真正生产对象的工厂类 （或工厂方法）
                 工厂方法： 使用内外部工厂的结构  外部工厂生产内部工厂   内部工厂真正的生产对象
                 可以使用Map集合容器来存储创建好的 有状态 或者 无状态的对象            
***    
    3：代理模式  
                 静态代理 与 动态代理
                 静态代理  A 调用 B的方式时  先经过B的代理类的方法 通过代理类的方法做增强 （每一个方法都需要代理）
                 动态代理  利用反射完成AOP思想  在实现接口的实现类中 直接代理所有方法  在所有方法前后做增强 （自动代理所有的方法）           
                  
    4：装饰器模式  
                   装饰器类与普通类 一起继承抽象类或者实现父接口类  
                   因此装饰器利用了组合的方法  可以使用多个装饰器组合在一起 对某个类的某个方法 做各种增强
                   装饰器类里面的方法名 与 普通类的方法名一致  并且调用普通方法  在调用前后实现了增强
     注意：
         代理和装饰器的区别
         1：代理通常是   使用反射的方法  增强所有方法  并且 增强前后与本身方法没有太大关联（打印日志）
         2：装饰器通常是 使用类组合的方法 增强单个方法  并且 增强前后与本身方法有太大关联 （支付时积分抵扣）
                
***
    5：模板模式                   
                 使用抽象类做为模板  抽象类中用使用final修饰的方法 去顺序调用本抽象类的其他方法
                 实现类继承了该抽象类的模板就需要 按照该模板来执行相应的逻辑  做到了代码规范流程的作用 
    
    6：观察者模式 
                  实际上观察者模式就是发布订阅模式  一个发布者 多个订阅者 类似于消息框架 或者 spring的监听器
                  发布者具有注册订阅者功能  使用Map集合容器存储订阅者的信息 当发布者发布信息对容器中的订阅发送消息即可
                  
    7: 策略模式
                 策略模式 主要是用来做策略（逻辑）的选择 同时避免大量的if-else判断
                 主要通过方法：
                    1：可以使用枚举来获取对应的 策略类型  
                    2：可以使用枚举来获取对应的 策略对象
                    3：可以使用Map集合容器来存储策略对象 并 根据策略类型获取Map集合容器的策略对象  
                 最终达到：完全避免了if-else 就能 使用 有状态或者无状态 的策略对象并执行对应逻辑            