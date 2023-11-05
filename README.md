# Design Pattern
- `Design pattern` giúp tăng cường tái sử dụng mã, giảm độ phức tạp, và tăng tính linh hoạt trong phát triển phần mềm.

## Sử dụng Design Pattern vì ?
- Tái sử dụng lại code và dễ mở rộng
- Là những giải pháp đã được tối ưu hóa và chúng ta có thể sử dụng tùy theo trường hợp mà không cần suy nghĩ.
- Đồng thời tăng tốc độ phát triển và testing cho các nhà phát triển
- Đương nhiên code sẽ trở nên dễ đọc và dễ hiểu kèm theo đó là dễ bảo trì nâng cấp về sau.
- Tiết kiệm thời gian làm việc với code của các dev khác.

## Phân loại Design Patterns
- Design Patterns có 23 mẫu được định nghĩa  bên trong và chia thành 3 nhóm.
  - `Creational Pattern`
  - `Structural Pattern`
  - `Behavioral Pattern`
  
### 1. Creational Patterns (Nhóm khởi tạo)
- Bao gồm 5 mẫu : [Factory Method](https://github.com/doctor-blue/design-patterns/tree/master/Creational/Factory-method), 
[Abstract Factory](https://github.com/doctor-blue/design-patterns/tree/master/Creational/Abstract-factory-method), 
[Builder](https://github.com/doctor-blue/design-patterns/tree/master/Creational/Builder), 
[Prototype](https://github.com/doctor-blue/design-patterns/tree/master/Creational/Prototype),
 [Singleton](https://github.com/doctor-blue/design-patterns/tree/master/Creational/Singleton).
  - Cung cấp giải pháp giúp tạo ra object và che giấu logic tạo ra nó thay vì tạo một cách trực tiếp, giúp chương trình mềm dẻo hơn khi muốn tạo object nào và theo tình huống nào.
  
### 2. Structural Patterns (Nhóm cấu trúc)
- Bao gồm 7 mẫu :[Adapter](), [Bridge](), [Composite](), [Decorator](), [Facade](), [Flyweight]() và [Proxy]().
  - Giúp ta thiết lập mối quan hệ giữa các đối tượng với nhau.
    
### 3. Behavioral Patterns (Nhóm tương tác)
- Bao gồm 11 mẫu: Interpreter, Template Method, Chain of Responsibility, 
[Command](), 
[Iterator](), 
[Mediator](), [Memento](), [Observer](), [State](), [Strategy]() và [Visitor]()
  - Cung cấp giải pháp để thực hiện các hành vi của đối tượng cũng như giữa các object với nhau.
