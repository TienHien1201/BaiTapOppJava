package quanLiNhanSu;


import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	/*Tạo danh sách rỗng để chứa các nhân sự của công ty thông qua contructor
	 *  đã tạo ở class QuanLyCBNV*/
	QuanLyCBNV dsns = new QuanLyCBNV();

	
	while (true) {
		System.out.println("\n\t\t==================MENU==================");
		System.out.println(
				"\t\t1. Them moi nhan su\r\n"
				+ "\t\t2. Liet ke tat ca nhan su trong cong ty\r\n"
				+ "\t\t3. Tim kiem theo ho va ten\r\n"
				+ "\t\t0. Thoat khoi chuong trinh\r\n");
		short luaChon;
System.out.print("\t\tMoi ban lua chon, tuong ung: ");
		luaChon = sc.nextShort();
		sc.nextLine();
		if (luaChon == 1) {
			while (true) {
			short chon;
			System.out.println("Ban Muon Nhap thong tin cua nhan su nao ? Hay nhap lua chon tuong ung: ");
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
				dsns.addNewNhanSu(ks);
				
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
			dsns.addNewNhanSu(cn);
			}
			else if (chon == 3) {
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
				dsns.addNewNhanSu(nv);
			}
			else {
				break;
			}
			}
		}
			else if (luaChon == 2) {
				System.out.println("\n\t\tLiet ke tat ca thong tin cua nhan su: \n");
				dsns.lietKeThongTinNhanSu();
			}
		else if (luaChon == 3) {
			System.out.println("Nhap Ho va Ten can tim: " );
			String hoVaTen = sc.nextLine();
			System.out.println("Ket qua tim kiem: ");
			dsns.timKienNhanSu(hoVaTen);
		}
			
		else {
			break;
		}
				
		}//Ngoặc của của while Tổng
		
	}
	
	
}

