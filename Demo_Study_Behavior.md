#### Observer

#####  1:@Retention(RetentionPolicy.RUNTIME)
    1:RetentionPolicy.SOURCE：注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃；
    2:RetentionPolicy.CLASS：注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期
    3:RetentionPolicy.RUNTIME：注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在；

#####  2:@Target({ElementType.METHOD}  
    ElementType 这个枚举类型的常量提供了一个简单的分类：
    注释可能出现在Java程序中的语法位置（这些常量与元注释类型(@Target)一起指定在何处写入注释的合法位置）
    
#####  3:@Beta     
    Beta (google的包)
    表明一个公用API的未来版本是受不兼容变更或删除限制的
    拥有这个注释标志的API不受任何兼容性保证