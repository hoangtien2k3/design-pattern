
## Các hình thức của mẫu thiết kế Singleton:
Có hai dạng mô hình thiết kế singleton, đó là:

- [Lazy Instantiation](): Việc tạo đối tượng được thực hiện theo yêu cầu.
- [Early Instantiation](): Việc tạo đối tượng diễn ra tại thời điểm tải.


### 1. Sử dụng [lazy initialization]() (kỹ thuật khởi tạo lười biếng):
Để tạo một lớp singleton bằng phương pháp Lazy Initialization:
- #### Khai báo hàm tạo của lớp là private.
- #### Tạo một cá thể tĩnh riêng của lớp này nhưng không khởi tạo nó.
- #### Trong bước cuối cùng, hãy tạo một phương thức nhà máy. Phương thức này trước tiên sẽ kiểm tra xem thành viên thể hiện có là null hay không. Nếu nó không phải là null, thì nó sẽ tạo một thể hiện của lớp singleton cho bạn và trả về nó; nếu không, nó sẽ không tạo ra bất kỳ trường hợp nào.

#### Ưu điểm
- Việc tạo một đối tượng chỉ diễn ra khi nó được yêu cầu. Điều này ngăn ngừa sự lãng phí tài nguyên và thời gian của CPU.
- Kỹ thuật này cũng có thể xử lý ngoại lệ.
#### Nhược điểm
- Cần phải kiểm tra điều kiện của null mỗi lần.
- Chúng ta không thể truy cập trực tiếp đối tượng của lớp.


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



### 2. Sử dụng [eager initialization]() (kỹ thuật khởi tạo tức thì):
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
