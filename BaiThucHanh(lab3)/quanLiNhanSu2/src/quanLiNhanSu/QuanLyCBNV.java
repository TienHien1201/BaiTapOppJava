package quanLiNhanSu;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCBNV {
private ArrayList<ConNguoi>nhanSu;


public QuanLyCBNV() {
	//Đây là cách khai báo 1 Arraylist rỗng để chứa các nhân viên trong phòng nhân sự
	this.nhanSu = new ArrayList<ConNguoi>();
}

public QuanLyCBNV(ArrayList<ConNguoi> nhanSu) {
	this.nhanSu = nhanSu;
} 

public ArrayList<ConNguoi> getNhanSu() {
	return nhanSu;
}

public void setNhanSu(ArrayList<ConNguoi> nhanSu) {
	this.nhanSu = nhanSu;
}

public void addNewNhanSu(ConNguoi conNguoi) {
	this.nhanSu.add(conNguoi);
}

//Liệt kê nhân sự trong công ty
public void lietKeThongTinNhanSu() {
	if (nhanSu.size() == 0) {
		System.out.println("Khong ton tai nhan su trong cong ty");
	} else {
	
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

short chuyenGiaNuocNgoai = 1;
for (ConNguoi conNguoi : nhanSu) {
	if(conNguoi instanceof ChuyenGiaNuocNgoai) {
		ChuyenGiaNuocNgoai chuyenGia = (ChuyenGiaNuocNgoai) conNguoi;
		System.out.println("\nThong tin Chuyen Gia thu " + chuyenGiaNuocNgoai + ":");
		System.out.println(chuyenGia.toString());  
		chuyenGiaNuocNgoai++;
	}
}

short lanhDao = 1;
for (ConNguoi conNguoi : nhanSu) {
	if (conNguoi instanceof LanhDao) {
		LanhDao ld = (LanhDao) conNguoi;
		System.out.println("\nThong tin Lanh Dao thu " + lanhDao + ":");
		System.out.println(ld.toString());
		lanhDao++;
	}
}

	}
}

//Tìm kiếm nhân sự theo Họ và Tên
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

//Xóa nhân sự đã thôi việc
public boolean xoaNhanSu( String daThoiViec ) {
	for (ConNguoi conNguoi : nhanSu) {
		if (conNguoi.getDaThoiViec().equals(daThoiViec)) {
			return this.nhanSu.remove(conNguoi);
		
		}
	}
	return false;
				
}

//Sửa thông tin nhân sự khi nhập sai thông tin
public void suaThongTinNhanSu(String hoVaTen) {
	boolean Kt = false;
	Scanner sc = new Scanner(System.in);
	for (ConNguoi conNguoi : nhanSu) {
//kiểm tra tên của đối tượng nhân sự có khớp với tên đã nhập vào hay không.
		if (conNguoi.getHoVaTen().equals(hoVaTen)) {
			//Hiển thị thông tin nhân sự cần sửa
			System.out.println("Thong tin nhan su can sua: \n" + conNguoi.toString());
			
           //Thực hiện sửa thông tin
			System.out.println("Nhap thong tin moi can sua: ");
			System.out.println("Ho va Ten: " );
			 hoVaTen = sc.nextLine();
			System.out.println("Nam sinh: " );
			int namSinh = sc.nextInt();
			sc.nextLine();
			System.out.println("Gioi Tinh: " );
			String gioiTinh = sc.nextLine();
			System.out.println("So Dien Thoai: " );
			String soDienThoai = sc.nextLine();
			conNguoi.setHoVaTen(hoVaTen);
			conNguoi.setNamSinh(namSinh);
			conNguoi.setGioiTinh(gioiTinh);
			conNguoi.setSoDienThoai(soDienThoai);
		 Kt = true;
		 break;
		}
	
	}
	if (!Kt) {
		System.out.println("Khong tim thay ten cua nhan su can sua!");
	}	
	}
}