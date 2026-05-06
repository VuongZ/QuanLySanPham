HỆ THỐNG QUẢN LÝ Sản Phẩm 
Hệ thống Quản Lý Sản Phẩm là một ứng dụng Web Full-stack được xây dựng nhằm mục đích hỗ trợ quản lý sản phẩm và loại sản phẩm.

I. CÔNG NGHỆ SỬ DỤNG
Môi trường Backend:
Ngôn ngữ: Java (JDK 17)
Framework: Spring Boot, Spring Data JPA, Hibernate
Công cụ hỗ trợ: Lombok
Hệ quản trị: MySQL 8.0+
II. HƯỚNG DẪN CÀI ĐẶT VÀ VẬN HÀNH
Để khởi chạy dự án trên môi trường máy chủ cục bộ (localhost), thực hiện tuần tự các bước dưới đây:

Buoc 1: Khời tạo cơ sở dữ liệu (Database)
Sử dụng các công cụ quản trị MySQL (như HeidiSQL, MySQL Workbench, hoặc XAMPP).
Tạo một cơ sở dữ liệu mới với tên gọi: CRMOnline_Pro (khuyến nghị định dạng UTF-8).
Mở và thực thi (Execute) file script SQL được đính kèm trong mã nguồn: CRMOnline_Pro.sql.
Buoc 2: Cấu hình và khởi chạy Backend (Spring Boot)
Sử dụng phần mềm IntelliJ IDEA để mở thư mục chứa mã nguồn Backend (crm-backend).

Điều hướng đến file cấu hình cơ sở dữ liệu tại: src/main/resources/application.yml.

Thay đổi thông tin username và password tại mục datasource để khớp với cấu hình MySQL trên máy tính của bạn: spring: datasource: url: "jdbc:mysql://localhost:3306/CRMOnline_Pro?useSSL=false&serverTimezone=UTC" username: [Nhap_Username_Cua_Ban] password: [Nhap_Password_Cua_Ban]

Chờ tải hoàn tất các thư viện phụ thuộc (Dependencies).

Thực thi lớp chính: Version1Application.java.

Backend khởi chạy thành công khi cửa sổ Console thông báo ứng dụng đang hoạt động tại cổng 8081.
III.CÁC PHÂN HỆ NGHIỆP VỤ CHÍNH

Phân hệ Quản lý Kho hàng & Sản phẩm (Inventory)

Quản lý danh mục Sản phẩm và số lượng tồn kho thực tế.
