# design_pattern
设计模式

一、创建型模式

01.工厂方法模式

02.抽象工厂模式

03.建造者模式

04.单例模式

05.原型模式

二、结构型模式

06.适配器模式

07.装饰者模式

08.代理模式

09.外观模式

10.桥接模式

11.组合模式

12.享元模式

三、行为型模式

13.策略模式

14.观察者模式

15.责任链模式

16.备忘录模式

17.模板方法模式

18.迭代器模式

19.中介者模式

20.命令模式

21.访问者模式

22.解释器模式

23.状态模式

四、设计模式七大原则

1.开闭原则

def：一个软件实体如类、门口和函数应该对扩展开放，对修改关闭

用抽象构建框架，用实现扩展细节

advantage：提高软件系统的可复用性及可维护性

2.依赖倒置原则

def:高层模块不应该依赖底层模块，二者都应该依赖其抽象

抽象不应该依赖细节；细节应该依赖抽象

针对接口编程，不要针对实现编程

advantage：减少类间的耦合性，提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的的风险

3.单一职责原则

def:不要存在多余一个导致类变更的原因

一个类/接口/方法只负责一项职责

adv:降低类的复杂度、提高类的可读性，提高系统的可维护性、降低变更引起的风险

4.接口隔离原则

def：用多个专门的接口，而不是使用单一的总接口，客户端不应该依赖他不需要的机接口

一个类对一个类的依赖应该建立在最小的接口上

建立单一接口，不要建立庞大臃肿的接口

尽量细化接口，接口中的方法尽量少

注意适度原则，一定适度

adv:符合常说的高内聚低耦合设计思想

    从而使得类具有很好的可读性、可扩展性和可维护性

5.迪米特法则（最少知道原则）

def：一个对象应该对其他对象保持最少的了解，幼教最少知道原则

尽量降低类与类之间的耦合

强调纸盒朋友交流，不和陌生人说话

朋友：出现在成员变量、方法的输入、输出参数中的类称为成员朋友类，而出现在方法体内部的类不属于朋友类

adv：降低类之间的耦合

6.里式替换原则
7.合成/复用原则（组合/复用原则）


