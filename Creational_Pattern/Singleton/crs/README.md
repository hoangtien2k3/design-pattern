
## Trong Java, có hai cách để khởi tạo Singleton Pattern

### 1. Sử dụng lazy initialization (kỹ thuật khởi tạo lười biếng):
```java
public class Singleton {
   private static Singleton instance = null;
   
   private Singleton() {
      // private constructor
   }
   
   public static Singleton getInstance() {
      if(instance == null) {
         instance = new Singleton();
      }
      return instance;
   }
}
```



### 2. Sử dụng eager initialization (kỹ thuật khởi tạo tức thì):
```java
public class Singleton {
   private static Singleton instance = new Singleton();
   
   private Singleton() {
      // private constructor
   }
   
   public static Singleton getInstance() {
      return instance;
   }
}
```






