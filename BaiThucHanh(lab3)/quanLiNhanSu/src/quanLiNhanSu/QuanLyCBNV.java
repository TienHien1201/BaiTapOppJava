package quanLiNhanSu;

import java.util.ArrayList;

public class QuanLyCBNV {
	
private ArrayList<ConNguoi>nhanSu;


public QuanLyCBNV() {
	//Đây là cách khai báo 1 Arraylist rỗng để chứa các nhân viên trong phòng nhân sự
	this.nhanSu = new ArrayList<ConNguoi>();
}

public QuanLyCBNV(ArrayList<ConNguoi> nhanSu) {
	this.nhanSu = nhanSu;
} 

public void addNewNhanSu(ConNguoi conNguoi) {
	this.nhanSu.add(conNguoi);
}

public void lietKeThongTinNhanSu() {
	short kySuCount = 1;
/*Vòng lặp "for-each" được sử dụng để lặp qua các phần tử
 *  trong một danh sách "nhanSu" của lớp "ConNguoi". Trong
 *   mỗi lần lặp, phần tử được gán vào biến "conNguoi".*/	
for (ConNguoi conNguoi : nhanSu) {
	
/*câu lệnh "instanceof" được sử dụng để kiểm tra xem phần tử
 *  "conNguoi" có thuộc kiểu "KySu" hay không. Nếu phần tử là
 *   một đối tượng của lớp "KySu" hoặc một lớp con của nó, câu 
 *   lệnh trong khối if sẽ được thực thi.*/	
	  if (conNguoi instanceof KySu) {
		  
/*"(KySu) conNguoi" được sử dụng để ép kiểu biến "conNguoi" về 
 * kiểu "KySu" và gán vào biến "kySu". Điều này cho phép chúng ta 
 * sử dụng các phương thức và thuộc tính riêng của lớp "KySu" trên
 *  biến "kySu".*/		  
          KySu kySu = (KySu) conNguoi;
          System.out.println("\nThong tin Ky Su thu " + kySuCount + ":");
          System.out.println(kySu.toString());
          kySuCount++;
      }
	  
	  
}
short congNhanCount = 1;
for (ConNguoi conNguoi : nhanSu) {
    if (conNguoi instanceof CongNhan) {
        CongNhan congNhan = (CongNhan) conNguoi;
        System.out.println("\nThong tin Cong Nhan thu " + congNhanCount + ":");
        System.out.println(congNhan.toString());
        congNhanCount++;
      }
	  
}

short nhanVien = 1;
for (ConNguoi conNguoi : nhanSu) {
	if(conNguoi instanceof NhanVien) {
		NhanVien nhanvien =(NhanVien) conNguoi;
		 System.out.println("\nThong tin Nhan Vien thu " + nhanVien + ":");
		 System.out.println(nhanvien.toString());
		 nhanVien++;
	}
}

}

public void timKienNhanSu(String hoVaten) {
for (ConNguoi conNguoi : nhanSu) {
/*"indexOf" trả về vị trí đầu tiên của chuỗi con
 *  "hoVaten" trong chuỗi gốc "hoVaTen". Nếu không 
 *  tìm thấy, phương thức sẽ trả về -1.*/	
	if (conNguoi.getHoVaTen().indexOf(hoVaten) >= 0) {
		System.out.println(conNguoi);
	}
}	
}
}
