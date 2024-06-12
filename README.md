# 彭小风的java速通之路

# 数据类型：
整型（Integral Types）：用于表示整数值，包括：

byte：8位，范围为 -128 到 127
short：16位，范围为 -32768 到 32767
int：32位，范围为 -2147483648 到 2147483647
long：64位，范围为 -9223372036854775808 到 9223372036854775807
浮点型（Floating-Point Types）：用于表示带小数点的数值，包括：

float：32位，范围为 ±3.40282347E+38F（有效位数为6-7位）
double：64位，范围为 ±1.79769313486231570E+308（有效位数为15位）
字符型（Character Type）：

char：16位 Unicode 字符，范围为 0 到 65535
布尔型（Boolean Type）：

boolean：表示逻辑值，只能是true或false


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
算术运算符
+：加法
-：减法
*：乘法
/：除法
%：取模（取余数）
赋值运算符
=：赋值
+=：加后赋值
-=：减后赋值
*=：乘后赋值
/=：除后赋值
%=：取模后赋值
自增自减运算符
++：自增
--：自减
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



