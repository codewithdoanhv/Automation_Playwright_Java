# Playwright Java Demo

Dự án demo automation test sử dụng Java và Playwright.

## Yêu cầu
- Java 11 hoặc cao hơn
- Maven
- Playwright cho Java

## Cài đặt
1. Clone repository này
2. Chạy lệnh sau để cài đặt dependencies:
```bash
mvn clean install

Chạy test

Chạy lệnh sau để thực thi các test case:
mvn test

Cấu trúc dự án:
src/main/java/com/example/utils: Chứa các class tiện ích (PageFactory)
src/test/java/com/example/tests: Chứa các test case
pom.xml: File cấu hình Maven

Test case mẫu:
Dự án bao gồm một test case mẫu kiểm tra chức năng đăng nhập trên trang https://the-internet.herokuapp.com/login với:
Username: tomsmith
Password: SuperSecretPassword!


## Hướng dẫn sử dụng
1. **Cài đặt môi trường**:
   - Cài Java 11 (hoặc cao hơn) và Maven.
   - Tạo dự án mới trong IDE (IntelliJ, Eclipse, v.v.).
   - Sao chép các file trên vào đúng cấu trúc thư mục.

2. **Chạy test**:
   - Mở terminal trong thư mục dự án.
   - Chạy lệnh: `mvn test`

3. **Kết quả**:
   - Test case sẽ truy cập trang web mẫu, nhập thông tin đăng nhập và kiểm tra thông báo đăng nhập thành công.
   - Kết quả test sẽ được hiển thị trên console.

## Lưu ý
- Đảm bảo kết nối internet để Playwright tải các trình duyệt cần thiết (Chromium, Firefox, WebKit) lần đầu tiên.
- Có thể mở rộng dự án bằng cách thêm các test case khác trong thư mục `tests`.
- Sử dụng Page Object Model để tổ chức code tốt hơn cho các dự án lớn.