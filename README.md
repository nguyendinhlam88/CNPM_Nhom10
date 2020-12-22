Phần mềm quản lý hộ khẩu, nhân khẩu và buổi họp

Tóm tắt: Phần mềm dùng để quản lý:
+Hộ khẩu với các chức năng thêm, sửa, tìm kiếm, tách hộ khẩu
+Nhân khẩu với các chức năng thêm, sửa, tìm kiếm, thống kê, đăng ký tạm trú, tạm vắng
+Các buổi họp với chức năng thêm buổi họp, tạo file word phục vụ cho in giấy mời
+Số hộ tham gia buổi họp (Điểm danh)


Yêu cầu môi trường 
JDK: Yêu cầu jdk1.8.0_271 và jre Cài đặt biến môi trường
có MySQL WorkBench hoặc XAMPP

Các bước cài đặt
1.mở git bash
2.clone source về máy tính git clone https://github.com/nguyendinhlam88/CNPM_Nhom10.git
3.mở NetBean IDE và import project về (Vào File -> Import Project -> Import Eclipse Project -> Import Eclipse Project -> Import Project ignoring Project Dependencies -> "Chọn Project Import là project trong file git(CNPM20201Group9), destination tùy thuộc vào người cài đặt" -> ấn import)
4.cài các thư viện như trong ảnh requirements trong file clone
5.import database vào MySQL Workbench (hoặc XAMPP) bằng file dump ở trong file git mới clone về
6.trong NetBean IDE vào Service -> chọn database -> chọn "jdbc:mysql://localhost:3306/congnghephanmem?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]" và connect, đồng thời copy URL(nếu dùng workbench) (nhấp chuột phải chọn properties -> chọn database URL -> copy cái url)
7.cài đặt ConnectToDB: vào project CNPM20201Group9 vừa mới import, vào source code -> Service -> ConnectToDB -> thiết lập password và dbName nếu dùng XAMPP hoặc thiết lập password và dbURL nếu dùng WorkBench (dbURL chính là URL ở bước trước)
8.khi chạy chương trình có phần đăng nhập, nhập username là vu, password là 123
