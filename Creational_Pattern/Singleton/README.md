
## Singleton design pattern in Java:

Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".

- Singleton là 1 trong 5 design pattern của nhóm Creational Design Pattern.
- Một lớp Singleton trong Java **chỉ cho phép một cá thể được tạo và cung cấp quyền truy cập toàn cục vào tất cả các lớp khác thông qua đối tượng hoặc cá thể đơn lẻ này.**


### Các lợi ích của việc sử dụng Singleton Design Pattern bao gồm:
- Đảm bảo rằng chỉ có một đối tượng duy nhất được tạo ra cho một lớp cụ thể, giúp tiết kiệm bộ nhớ, đảm bảo rằng có quyền kiểm soát truy cập vào tài nguyên.
- Đảm bảo rằng toàn bộ ứng dụng sử dụng cùng một đối tượng, do đó, giúp đảm bảo tính nhất quán của dữ liệu.
- Các đối tượng Singleton có thể được chia sẻ trên nhiều luồng trong ứng dụng.



### Các hình thức của mẫu thiết kế Singleton:
Có hai dạng mô hình thiết kế singleton, đó là:

- [Early Instantiation](): Việc tạo đối tượng diễn ra tại thời điểm tải.
- [Lazy Instantiation](): Việc tạo đối tượng được thực hiện theo yêu cầu.










![image](https://user-images.githubusercontent.com/122768076/219697398-f86256a6-50e3-4417-92d2-71cb26e2fc95.png)










