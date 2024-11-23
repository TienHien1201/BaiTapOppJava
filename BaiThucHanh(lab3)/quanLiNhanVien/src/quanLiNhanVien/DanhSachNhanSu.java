package quanLiNhanVien;

import java.util.ArrayList;

public class DanhSachNhanSu {
private ArrayList<NhanSu> danhSach;//Mảng danh sách chứa các nhân sự của công ty

//Đây là cách khai báo 1 Arraylist
public DanhSachNhanSu() {
	this.danhSach = new ArrayList<NhanSu>();
}

public DanhSachNhanSu(ArrayList<NhanSu> danhSach) {
	this.danhSach = danhSach;
}

//Thêm nhân sự mới vào công ty
public void addNhanSu(NhanSu ns) {
	//Có 2 cách thêm: 
	//(1)Chèn vào cuối danh sách
	this.danhSach.add(ns);
	//(2)Chèn vào vị trí bất kì trong danh sách
	//this.danhSach.add(0, ns);
}

//Liệt Kê tất cả nhân sự trong công ty
public void lietKeAllNhanSu() {
	//Cú pháp nhấn foreach + tab là ra như bên dưới
	for (NhanSu nhanSu : danhSach) {//Duyệt từng phần tử trong danh sách nhân sự
		/*Tức tạo ra 1 biến object nhanSu thuộc kiểu biến object NhanSu và biến 
		 * này sẽ lấy tất cả nhân sự trong danh sách */
		
		System.out.println(nhanSu);/*Để lấy tất cả thông tin của nhân sự trong công
		ty thì ta phải dùng hàm toString */
	}
}



}
