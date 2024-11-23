package main;

	import java.util.Scanner;


	import main.SinhVien;

	public class Test {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			DanhSachSienVien dssv = new DanhSachSienVien();
			int luaChon = 0;
			do {
				System.out.println("MENU ---------- ");
				System.out.println("Vui long chon chuc nang: ");
				System.out.println(
				  "1.	Them sinh vien vao danh sach.\n"
				+ "2.	In danh sach sinh vien ra man hinh.\n"
				+ "3.	Kiem tra danh sach co rong hay khong.\n"
				+ "4.	Lấy ra so luong sinh vien trong danh sach.\n"
				+ "5.	Lam rong danh sach sinh vien.\n"
				+ "6.	Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien.\n"
				+ "7.	Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.\n"
				+ "8.	Tim kiem tat ca sinh viên dua tren Ten duoc nhap tu ban phim.\n"
				+ "9.	Xuat ra danh sach sinh vien co điem tu cao đen thap.\n"
				+ "0.   Thoat khoi chuong trinh");
				luaChon = sc.nextInt();
				sc.nextLine();
				
				if(luaChon==1) {
//					1.	Thêm sinh viên vào danh sách.
					System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
					System.out.println("Nhap ho va ten: "); String hoVaTen = sc.nextLine();
					System.out.println("Nhap nam sinh: "); int namSinh = sc.nextInt();
					System.out.println("Nhap diem trung binh: "); float diemTrungBinh = sc.nextFloat();
					SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
					dssv.themSinhVien(sv);
					
				}else if(luaChon==2) {
//					2.	In danh sách sinh viên ra màn hình.
					dssv.inDanhSachSinhVien();
					
				}else if(luaChon==3) {
//					3.	Kiểm tra danh sách có rỗng hay không.
					System.out.println("Danh sach rong: "+ dssv.kiemTraDanhSachRong());
				}else if(luaChon==4) {
//					4.	Lấy ra số lượng sinh viên trong danh sách.
					System.out.println("So luong hien tai: "+ dssv.laySoLuongSinhVien());
				}else if(luaChon==5) {
//					5.	Làm rỗng danh sách sinh viên.
					dssv.lamRongDanhSach();
				}else if(luaChon==6) {
//					6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
					System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
					SinhVien sv = new SinhVien(maSinhVien);
					System.out.println("Kiem tra sinh vien co trong danh sach: "+dssv.kiemTraTonTai(sv));
				}else if(luaChon==7) {
//					7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
					System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
					SinhVien sv = new SinhVien(maSinhVien);
					System.out.println("Xoa sinh vien trong danh sach: "+dssv.xoaSinhVien(sv));
				}else if(luaChon==8) {
//					8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
					System.out.println("Nhap ho va ten: "); String hoVaTen = sc.nextLine();
					System.out.println("Ket qua tim kiem: ");
					dssv.timSinhVien(hoVaTen);
					
				}
			}while(luaChon!=0);
		}
}
