
## Mẫu thiết kế Factory Method
Factory method là một pattern cho việc khởi tạo đối tượng(thuộc nhóm creational patterns). Pattern này được sinh ra nhằm mục đích khởi tạo đối tượng mà bản thân muốn che giấu class nào được khởi tạo.

### Lợi thế của Factory Design Pattern:
Một số lợi ích của việc sử dụng Factory Method trong lập trình bao gồm:

- Cho phép chúng ta tạo đối tượng theo cách phù hợp với yêu cầu của mình, mà không cần phải chỉnh sửa mã nguồn.
- Cho phép chúng ta dễ dàng mở rộng các đối tượng và thêm các loại đối tượng mới.
- Cho phép chúng ta giảm sự phụ thuộc vào các lớp cụ thể và tăng tính linh hoạt trong mã nguồn của chúng ta.
- Giúp tăng tính khả bảo trì và dễ dàng kiểm tra và sửa lỗi trong mã của chúng ta.


### Bản chất của Factory method pattern:
- Về cơ bản thì ta sẽ định nghĩa một interface hoặc Abstract class , các class con sẽ extends hoặc implements nó.
- Tiếp đến mình sẽ tạo một class được xem là FactoryClass, bên trong FactoryClass này mình sẽ có một phương thức giúp chúng ta khởi tạo các Object chúng ta cần.

- ![Screenshot 2023-02-16 143712](https://user-images.githubusercontent.com/122768076/219298749-999bac48-4474-49d9-96bc-f00e2b2245b6.png)

