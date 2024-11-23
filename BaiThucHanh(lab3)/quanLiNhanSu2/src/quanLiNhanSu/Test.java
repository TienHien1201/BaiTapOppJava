package quanLiNhanSu;


import java.util.ArrayList;
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
				+ "\t\t4. Xoa NHAN SU da thoi viec\r\n"
				+ "\t\t5. Sua thong tin NHAN SU khi nhap sai\r\n"
				+ "\t\t0. Thoat khoi chuong trinh\r\n");
		short luaChon;
System.out.print("\t\tMoi ban lua chon, tuong ung: ");
		luaChon = sc.nextShort();
		sc.nextLine();
		if (luaChon == 1) {
			while (true) {
			short chon;
			System.out.println("Ban Muon Nhap thong tin cua nhan su nao ?\n Hay nhap lua chon tuong ung: ");
			System.out.println("1.Nhan su KY SU.");
			System.out.println("2.Nhan su CONG NHAN.");
			System.out.println("3.Nhan su NHAN VIEN.");
			System.out.println("4.Nhan su CHUYEN GIA NUOC NGOAI.");
			System.out.println("5.Nhan su LANH DAO.");
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
				System.out.println("Da thoi viec chua: ");
				String daThoiViec = sc.nextLine(); 
				KySu ks = new KySu(hoVaTen, namSinh, gioiTinh, soDienThoai, chuyenNghanhDaoTao,daThoiViec);
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
				System.out.println("Da thoi viec chua: ");
				String daThoiViec = sc.nextLine(); 
			CongNhan cn = new CongNhan(hoVaTen, namSinh, gioiTinh, soDienThoai, bacNghe,daThoiViec);
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
				System.out.println("Da thoi viec chua: ");
				String daThoiViec = sc.nextLine(); 
				NhanVien nv = new NhanVien(hoVaTen, namSinh, gioiTinh, soDienThoai, congViecChinh,daThoiViec);
				dsns.addNewNhanSu(nv);
			}
			
			else if (chon == 4) {
				System.out.println("Moi nhap thong tin nhan su CHUYEN GIA NUOC NGOAI:");
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
				String chuyenNghanh = sc.nextLine();
				System.out.println("Quoc Tich: ");
				String quocTich = sc.nextLine();
				System.out.println("Ngay Het Han Visa(dd/mm/yy): ");
				String ngayHetHanVisa = sc.nextLine();
				System.out.println("Da thoi viec chua: ");
				String daThoiViec = sc.nextLine(); 
				ChuyenGiaNuocNgoai cgnn = new ChuyenGiaNuocNgoai(hoVaTen, namSinh, gioiTinh, soDienThoai, chuyenNghanh, quocTich, ngayHetHanVisa, daThoiViec);
				dsns.addNewNhanSu(cgnn);
			}
			
			else if (chon == 5) {
				System.out.println("Moi nhap thong tin nhan su LANH DAO:");
				System.out.println("Ho va Ten: " );
				String hoVaTen = sc.nextLine();
				System.out.println("Nam sinh: " );
				int namSinh = sc.nextInt();
				sc.nextLine();
				System.out.println("Gioi Tinh: " );
				String gioiTinh = sc.nextLine();
				System.out.println("So Dien Thoai: " );
				String soDienThoai = sc.nextLine();
				System.out.println("Cap Lanh Dao: ");
				String capLanhDao = sc.nextLine();
				System.out.println("Phong Ban Lam Viec: ");
				String phongBanLamviec = sc.nextLine();
				System.out.println("Da thoi viec chua: ");
				String daThoiViec = sc.nextLine(); 
				LanhDao ld = new LanhDao(hoVaTen, namSinh, gioiTinh, soDienThoai, capLanhDao, phongBanLamviec,daThoiViec );
				dsns.addNewNhanSu(ld);
			}
			
			else {
				break;
			}
			}
		}
			else if (luaChon == 2) {
				System.out.println("\nLiet ke tat ca thong tin cua nhan su: \n");
				dsns.lietKeThongTinNhanSu();
			}
		else if (luaChon == 3) {
			System.out.println("Nhap Ho va Ten can tim: " );
			String hoVaTen = sc.nextLine();
			System.out.println("Ket qua tim kiem: ");
			dsns.timKienNhanSu(hoVaTen);
		}
		
			else if (luaChon == 4) {
	System.out.println("Nhap vao nhan su muon xoa : ");
	String daThoiViec = sc.nextLine();
	System.out.println("Ket qua sau khi xoa: " +  dsns.xoaNhanSu(daThoiViec));
		}
			
			else if (luaChon == 5) {
				System.out.println("Nhap ho  va ten nhan su muon sua: ");
				String hoVaTen = sc.nextLine();
				dsns.suaThongTinNhanSu(hoVaTen);
			}
		else {
			break;
		}
				
		}//Ngoặc của của while Tổng
		
	}

	
	
}

