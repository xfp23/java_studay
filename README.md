# 彭小风的java速通之路

# 数据类型：
## 整型（Integral Types）：用于表示整数值，包括：

1. byte：8位，范围为 -128 到 127
2. short：16位，范围为 -32768 到 32767
3. int：32位，范围为 -2147483648 到 2147483647
4. long：64位，范围为 -9223372036854775808 到 9223372036854775807
## 浮点型（Floating-Point Types）：用于表示带小数点的数值，包括：

1. float：32位，范围为 ±3.40282347E+38F（有效位数为6-7位）
2. double：64位，范围为 ±1.79769313486231570E+308（有效位数为15位）
## 字符型（Character Type）：

1. char：16位 Unicode 字符，范围为 0 到 65535
## 布尔型（Boolean Type）：

boolean：表示逻辑值，只能是true或false
## 字符串型
String 

```java
public class DataTypesExample {
    public static void main(String[] args) {
        // 基本数据类型
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 30;
        long longVar = 40L;
        float floatVar = 3.14f;
        double doubleVar = 3.1415926;
        char charVar = 'A';
        boolean boolVar = true;

        // 引用数据类型
        String stringVar = "Hello, World!";
        int[] arrayVar = {1, 2, 3, 4, 5};
        MyClass myObject = new MyClass();
        MyInterface myInterfaceObject = new MyInterfaceImpl();
        EnumExample enumVar = EnumExample.RED;
    }
}
```
# 定义数组
## 语法:
1.声明数组变量
dataType[] arrayName;
### 示例:
```java
int[] numbers; // 声明整型数组变量
double[] scores; // 声明双精度浮点型数组变量
String[] names; // 声明字符串数组变量
```
2.创建数组对象
arrayName = new dataType[arraySize];

```java
numbers = new int[5]; // 创建一个包含5个元素的整型数组
scores = new double[10]; // 创建一个包含10个元素的双精度浮点型数组
names = new String[100]; // 创建一个包含100个元素的字符串数组
```
# 标准输入输出
```java
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your name:");
String name = scanner.nextLine();
System.out.println("Hello, " + name + "!");
```
# 运算符
**算术运算符**
-- +：加法
-- -：减法
-- *：乘法
-- /：除法
-- %：取模（***取余数***）
**赋值运算符**
-- =：赋值
-- +=：加后赋值
-- -=：减后赋值
-- *=：乘后赋值
-- /=：除后赋值
-- %=：取模后赋值
-- 自增自减运算符
-- ++：自增
-- --：自减
比较运算符
==：等于
!=：不等于
>：大于
<：小于
>=：大于等于
<=：小于等于
逻辑运算符
&&：逻辑与（AND）
||：逻辑或（OR）
!：逻辑非（NOT）
位运算符
&：按位与
|：按位或
^：按位异或
~：按位取反
<<：左移
>>：右移
>>>：无符号右移
条件运算符
? :：条件表达式（三元运算符）
instanceof 运算符
instanceof：用于判断对象是否为特定类的实例
类型转换运算符
(type)：强制类型转换
数组访问运算符
[]：用于访问数组元素
其他运算符
.：成员访问符（用于访问对象的字段和方法）
::：方法引用运算符
```java
int a = 10;
int b = 20;

// 算术运算符示例
int sum = a + b;
int difference = a - b;
int product = a * b;
int quotient = a / b;
int remainder = a % b;

// 赋值运算符示例
int x = 5;
x += 3; // 相当于 x = x + 3;

// 自增自减运算符示例
int c = 5;
c++; // c现在的值为6
c--; // c现在的值又变成了5

// 比较运算符示例
boolean isEqual = (a == b);
boolean isGreater = (a > b);

// 逻辑运算符示例
boolean condition1 = true;
boolean condition2 = false;
boolean result = condition1 && condition2;

// 条件运算符示例
int max = (a > b) ? a : b;

// instanceof 运算符示例
Object obj = new String("Hello");
boolean isString = (obj instanceof String);

// 类型转换运算符示例
double d = 3.14;
int integerPart = (int) d;

// 数组访问运算符示例
int[] array = {1, 2, 3};
int element = array[0]; // 获取数组第一个元素的值
```
#权限控制
1. public：公共访问。任何类都可以访问。
2. protected：受保护访问。同一包内的类和任何子类可以访问。
3. default（也称包级访问）：默认访问。只有同一包内的类可以访问。没有显式声明访问修饰符时，使用这种访问级别。
4. private：私有访问。只有同一类内可以访问。
# 访问修饰符的具体使用
类
1. public class：可以被任何其他类访问。
2. default class（没有修饰符）：只能被同一包内的类访问。
成员变量和方法
3. public：可以被任何其他类访问。
4. protected：可以被同一包内的类和任何子类访问（即使子类在不同包中）。
5. default：只能被同一包内的类访问。
6. private：只能被定义它的类访问。

# static 关键字
1. 静态 **方法**的特性
属于类，而不是实例：静态方法属于类本身，而不是类的某个实例。你可以通过类名直接调用静态方法，而不需要创建类的对象。
```java
public class MyClass {
    public static void myStaticMethod() {
        System.out.println("This is a static method.");
    }
}

// 调用静态方法
MyClass.myStaticMethod();
```
2.只能访问静态成员：静态方法只能访问类中的静态变量和静态方法。它们不能直接访问实例变量或实例方法，因为实例变量和实例方法是属于某个具体对象的，而静态方法在调用时可能没有任何对象的上下文
```java
public class MyClass {
    private static int staticVar = 10;
    private int instanceVar = 20;

    public static void staticMethod() {
        System.out.println("Static variable: " + staticVar);
        // System.out.println("Instance variable: " + instanceVar); // 错误：无法从静态上下文中访问实例变量
    }

    public void instanceMethod() {
        System.out.println("Static variable: " + staticVar);
        System.out.println("Instance variable: " + instanceVar);
    }
}
```
3.可以被类的实例方法调用：静态方法可以被类的实例方法调用，因为实例方法本身就是在某个对象的上下文中运行的，因而可以访问静态方法。
```java
public class MyClass {
    private static int staticVar = 10;

    public static void staticMethod() {
        System.out.println("Static variable: " + staticVar);
    }

    public void instanceMethod() {
        // 调用静态方法
        staticMethod();
    }
}
```

***其他类中的调用***
静态方法也可以被其他类的方法调用。调用方式依然是通过类名来调用，而不是通过实例。
```java
public class MyClass {
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

public class AnotherClass {
    public void callStaticMethod() {
        // 调用MyClass中的静态方法
        MyClass.staticMethod();
    }
}
```
