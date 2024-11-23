package quanLiNhanVien;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Tạo 1 danh sách sinh viên thông qua contructor rỗng đã khởi tạo
	DanhSachNhanSu dsns = new DanhSachNhanSu();
	
	
	short luachon;
	
	do {
		System.out.println("\n==================MENU==================");
		System.out.println("Moi ban lua chon");
		System.out.println(
				"1. Them moi nhan su\r\n"
				+ "2. Liet ke tat ca nhan su trong cong ty\r\n"
				+ "3. Tim kiem theo ho va ten\r\n"
				+ "0. Thoat khoi chuong trinh\r\n");
		luachon = sc.nextShort();
		sc.nextLine();
		//Thêm Nhan su vao danh sach
		if(luachon == 1) {
		short chon;
		System.out.println("Ban Muon Nhap thong tin cua nhan su nao ?");
		System.out.println("1.Nhan su KY SU.");
		System.out.println("2.Nhan su CONG NHAN.");
		System.out.println("3.Nhan su NHAN VIEN.");
		System.out.println("0.Ket thuc.");
         chon = sc.nextShort();
         sc.nextLine();
		if (chon == 1) {
			System.out.println("Moi nhap thong tin nhan su KY SU:");
			System.out.println("Ho va Ten: " );
			String hoVaTen = sc.nextLine();
			System.out.println("Nam sinh: " );
			int namSinh = sc.nextInt();
			sc.nextLine();
			System.out.println("Gioi Tinh: " );
			String gioiTinh = sc.nextLine();
			System.out.println("So Dien Thoai: " );
			String soDienThoai = sc.nextLine();
			System.out.println("Chuyen nghanh dao tao: ");
			String chuyenNghanhDaoTao = sc.nextLine();
			 KySu ks = new KySu(hoVaTen, namSinh, gioiTinh, soDienThoai, chuyenNghanhDaoTao);
			 dsns.addNhanSu(ks);
		}
		else if(chon == 2) {
			System.out.println("Moi nhap thong tin nhan su CONG NHAN:");
			System.out.println("Ho va Ten: " );
			String hoVaTen = sc.nextLine();
			System.out.println("Nam sinh: " );
			int namSinh = sc.nextInt();
			sc.nextLine();
			System.out.println("Gioi Tinh: " );
			String gioiTinh = sc.nextLine();
			System.out.println("So Dien Thoai: " );
			String soDienThoai = sc.nextLine();
			System.out.println("Bac Nghe: ");
			String bacNghe = sc.nextLine();
			CongNhan cn = new CongNhan(hoVaTen, namSinh, gioiTinh, soDienThoai, bacNghe);
			dsns.addNhanSu(cn);
		}
		
		else if(chon == 3) {
			System.out.println("Moi nhap thong tin nhan su NHAN VIEN:");
			System.out.println("Ho va Ten: " );
			String hoVaTen = sc.nextLine();
			System.out.println("Nam sinh: " );
			int namSinh = sc.nextInt();
			sc.nextLine();
			System.out.println("Gioi Tinh: " );
			String gioiTinh = sc.nextLine();
			System.out.println("So Dien Thoai: " );
			String soDienThoai = sc.nextLine();
			System.out.println("Cong Viec Chinh: ");
			String congViecChinh = sc.nextLine();
			NhanVien nv = new NhanVien(hoVaTen, namSinh, gioiTinh, soDienThoai, congViecChinh);
			dsns.addNhanSu(nv);
		}
		else {
			break;
		}
		}
		
		//Liet ke Tat ca nhan su trong cong ty
		else if(luachon == 2) {
			System.out.println("All nhan su trong cong ty: ");
			dsns.lietKeAllNhanSu();
		
		}
		
	} while (luachon != 0);
	
	
	
}
}

