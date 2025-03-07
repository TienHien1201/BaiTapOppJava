package quanLiNhanSu;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ChucNangPNS {
	//	 nhanSu là một biến kiểu ArrayList trong Java, được khai báo để lưu trữ danh sách các đối tượng thuộc lớp ConNguoi.
	protected ArrayList<ConNguoi>nhanSu;
	protected String tenTapTin;


	public ChucNangPNS(String tenTapTin) {
		this.tenTapTin = tenTapTin;

		DocTapTin doc = new DocTapTin(tenTapTin);//Đọc data lưu sẵn vào ArrayList 
		nhanSu = doc.docDsConNguoi();
		if (nhanSu == null)//Nếu chưa tồn tại data thì khởi tạo ArrayList mới để sẵn sàng thêm dữ liệu vào sau này
			nhanSu = new ArrayList<ConNguoi>();
	}

	//Add nhân Sự
	public String addNhanSu(ConNguoi cn) {
		nhanSu.add(cn);
		GhiVaoTapTin ghi = new GhiVaoTapTin(tenTapTin, nhanSu);
		return ghi.ghiDsConNguoi();
	}

	//Liệt kê tất cả nhân sự trong công ty
	public void listNhanSu() {

		if (nhanSu.size() == 0) {
			System.out.println("Khong ton tai bat ki nao trong danh sach! ");
		}else {
			/*Tạo 1 danh sách mới có tên sortedNhanSu để lưu (các nhân sự 
			trong danh sách nhanSu đã tạo) sau khi sắp xếp*/
			ArrayList<ConNguoi> sortedNhanSu = new ArrayList<ConNguoi>(nhanSu);	
			/*Sử dụng phương thức Collections.sort sắp xếp danh sách sortedNhanSu 
			 *theo 1 bộ so sánh tùy chỉnh Comparator Truyền vào new Comparator<ConNguoi>()
			 *để tạo một đối tượng Comparator với mục đích là chỉ định cách so sánh các đối tượng 
			 *ConNguoi trong danh sách sortedNhanSu */
			Collections.sort(sortedNhanSu, new Comparator<ConNguoi>() {
				@Override
				/* Tạo 1 phương compare dùng để xác định cách so sánh hai đối tượng 
				 *ConNguoi để sắp xếp. */
				public int compare(ConNguoi nguoi1, ConNguoi nguoi2) {
					//	   Lấy họ và tên của hai đối tượng để so sánh
					String hoTen1 = nguoi1.getHoVaTen();
					String hoTen2 = nguoi2.getHoVaTen();

					/*      Tách chuỗi hoTen1 và hoTen2 thành một mảng các từ riêng 
					 *      biệt bằng cách sử dụng phương thức split với dấu cách
					 *      làm dấu phân tách. Ví Dụ ["Nguyễn", "Văn", "An"]. Độ dài
					 *      của mảng này là 3, thể hiện rằng chuỗi ban đầu có 3 từ.*/
					String[] hoTenArray1 = hoTen1.split(" ");
					String[] hoTenArray2 = hoTen2.split(" ");

					/*      truy cập phần tử cuối cùng trong mảng hoTenArray1, tức là 
					 *      tên của đối tượng nguoi1.Vì theo Ví dụ ở split độ dài của
					 *      mảng đã lưu là 3 , 3 - 1 = 2 là phần tử cuối của mảng tức
					 *      là tên của đối tượng c onNguoi 1.và compareTo để so sánh sánh
					 *      compareToIgnoreCase là một phương thức trong Java được sử dụng
					 *      để so sánh hai chuỗi dựa trên thứ tự từ điển(alphabet), bỏ qua
					 *      sự khác biệt về chữ hoa/chữ thường */
					//      Trả về giá trị âm nếu chuỗi gọi phương thức đứng trước chuỗi được so sánh.
					//	    Trả về giá trị dương nếu chuỗi gọi phương thức đứng sau chuỗi được so sánh.
					//		Trả về giá trị 0 nếu hai chuỗi bằng nhau.
					int tenComparison = hoTenArray1[hoTenArray1.length - 1].compareToIgnoreCase(hoTenArray2[hoTenArray2.length - 1]);

					/*      Kiểm tra tên của nguoi1 và nguoi 2 có giống nhau hay không
					 *      Nếu == 0 thì tên giống nhau thì sẽ bỏ qua việc thực hiện so
					 *      sánh tên và so sánh họ còn khác 0 thì thực hiện so sánh tên*/
					if (tenComparison != 0) {
						return tenComparison;
					}

					// Nếu tên giống nhau, so sánh họ
					int hoComparison = hoTenArray1[0].compareToIgnoreCase(hoTenArray2[0]);
					if (hoComparison != 0) {					                
						return hoComparison;
					}

					// Nếu họ và tên đều giống nhau, không thay đổi thứ tự
					return 0;
				}
			}); short kySuCount = 1;
			short conNhanCount = 1;
			short nhanVienCount = 1;
			short chuyenGiaNuocNgoaiCount = 1;
			short thucTapSinhCount = 1;
			short laoDongPhoThongCount = 1;
			short nhanVienPartTimeCount = 1;
			short canBoQuanLiCount = 1;
			for (ConNguoi conNguoi : sortedNhanSu) {
				// để xác định xem phần tử trong danh sách con người có phải là một kỹ sư hay không 
				if (conNguoi instanceof KySu) {
					KySu ks = (KySu) conNguoi;
					System.out.println("Thong tin nhan su KY SU thu " + kySuCount + ":");
					System.out.println(ks.toString());
					System.out.println("Tien luong: "+ks.tinhLuong()); 
					kySuCount++;
				} else if (conNguoi instanceof CongNhan) {					        	
					CongNhan cn = (CongNhan) conNguoi;
					System.out.println("Thong tin nhan su CONG NHAN thu " + conNhanCount + ":");
					System.out.println(cn.toString());
					System.out.println("Tien luong: "+ cn.tinhLuong());
					conNhanCount++;

				} else if (conNguoi instanceof NhanVien) {					        
					NhanVien nv = (NhanVien) conNguoi;
					System.out.println("Thong tin nhan su NHAN VIEN thu " + nhanVienCount + ":");
					System.out.println(nv.toString());
					System.out.println("Tien luong: "+nv.tinhLuong());
					nhanVienCount++;
				} else if (conNguoi instanceof ChuyenGiaNuocNgoai) {
					ChuyenGiaNuocNgoai cgnn = (ChuyenGiaNuocNgoai) conNguoi;
					System.out.println("Thong tin nhan su CHUYEN GIA NUOC NGOAI thu " + chuyenGiaNuocNgoaiCount + ":");
					System.out.println(cgnn.toString());
					System.out.println("Tien luong: "+cgnn.tinhLuong());
					chuyenGiaNuocNgoaiCount++;

				} else if (conNguoi instanceof ThucTapSinh) { 
					ThucTapSinh tts = (ThucTapSinh) conNguoi;
					System.out.println("Thong tin nhan su THUC TAP SINH thu " + thucTapSinhCount + ":");
					System.out.println(tts.toString());
					System.out.println("Tien luong: "+tts.tinhLuong());
					thucTapSinhCount++; 

				} else if (conNguoi instanceof LaoDongPhoThong) {	 
					LaoDongPhoThong ldpt = (LaoDongPhoThong) conNguoi;
					System.out.println("Thong tin nhan su LAO DONG PHO THONG thu " + laoDongPhoThongCount + ":");
					System.out.println(ldpt.toString());
					System.out.println("Tien luong: "+ldpt.tinhLuong());
					laoDongPhoThongCount++;   

				} else if (conNguoi instanceof NhanVienPartTime) {
					NhanVienPartTime nvpt = (NhanVienPartTime) conNguoi;
					System.out.println("Thong tin nhan su THUC TAP SINH thu " + nhanVienPartTimeCount + ":");
					System.out.println(nvpt.toString());
					System.out.println("Tien luong: "+nvpt.tinhLuong());
					nhanVienPartTimeCount++;   

				} else if (conNguoi instanceof CanBoQuanLy) {					        	 
					CanBoQuanLy cbql = (CanBoQuanLy) conNguoi;
					System.out.println("Thong tin nhan su CAN BO QUAN LI thu " + canBoQuanLiCount + ":");
					System.out.println(cbql.toString());
					System.out.println("Tien luong: "+cbql.tinhLuong());
					canBoQuanLiCount++;   }
			}}}



	//Tìm kiếm nhân sự theo tên
	public ArrayList<ConNguoi> searchNhanSu(String Ten) {
		ArrayList<ConNguoi> ketQua = new ArrayList<ConNguoi>();
		if(nhanSu.size() != 0)  
			for (ConNguoi conNguoi : nhanSu) {
				/*Đầu tiên, chúng ta có một biến được gọi là "hoVaTen" để lưu trữ
				 *  một chuỗi họ và tên của một người.*/
				String hoVaTen = conNguoi.getHoVaTen();
				/*"split" để chia chuỗi này thành một mảng các phần tử, sử dụng
				 *  dấu cách (" ") để phân tách từng phần tử trong chuỗi.*/
				String[] hoVaTenArray = hoVaTen.split(" ");
				//lấy phần tử cuối cùng trong mảng lưu vào biến tenNhanSu
				String tenNhanSu = hoVaTenArray[hoVaTenArray.length - 1];
				//Kiểm tra tên của đối tượng có khớp với nhân sự cần sửa hay không
				if (tenNhanSu.contains(Ten)) 
					ketQua.add(conNguoi);}

		return ketQua;
	}

	//Sửa Thông tin nhân sự khi nhập sai 
	public void suaThongTin(String hoVaTen) {
		boolean kt = false;
		Scanner sc = new Scanner(System.in);
		for (ConNguoi conNguoi : nhanSu) {
			if (conNguoi.getHoVaTen().equalsIgnoreCase(hoVaTen)) {
				System.out.println("Thong tin nhan su can sua: " + conNguoi.toString());

				//			Nhập thông tin cần sửa 
				System.out.println("Nhap thong tin moi can sua: ");
				System.out.println("Ma nhan vien");
				String maNhanVien = sc.nextLine();
				conNguoi.setMaNhanVien(maNhanVien);
				System.out.println("Ho va Ten: ");
				hoVaTen = sc.nextLine();
				conNguoi.setHoVaTen(hoVaTen);
				System.out.println("Nam sinh(dd/MM/yyyy): " );
				String namSinhInput = sc.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate namSinh = LocalDate.parse(namSinhInput,formatter);
				conNguoi.setNamSinh(namSinh);
				System.out.println("Gioi Tinh: ");
				String gioiTinh = sc.nextLine();
				conNguoi.setGoiTinh(gioiTinh);
				System.out.println("So dien thoai");
				String soDienThoai = sc.nextLine();
				conNguoi.setSoDienThoai(soDienThoai);
				kt = true;
				break;
			}
		}if (!kt) {
			System.out.println("Khong tim thay Ten nhan su de sua !");}}

	//Xóa nhân sự 
	public void xoaNhanSuDaThoiViec() {
		boolean kt = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ban Muon xoa nhan su nhu the nao ? \n(da thoi viec): ");
		String daThoiViec = sc.nextLine();
		// Biến phanTuCanXoa là một danh sách ArrayList chứa các đối tượng ConNguoi.
		ArrayList<ConNguoi> phanTuCanXoa = new ArrayList<ConNguoi>();
		for (ConNguoi conNguoi : nhanSu) {
			if (conNguoi.getDaThoiViec().equalsIgnoreCase(daThoiViec)) {
				phanTuCanXoa.add(conNguoi);
				kt = true;
			}
		} 

		if (!kt) { 
			System.out.println("Khong ton tai nhan su da thoi viec !");
		}
		else {
			System.out.println("Danh sach sau khi xoa nhan su: " );
			nhanSu.removeAll(phanTuCanXoa);
			listNhanSu();
		}
	}

	//Tìm Kiếm theo Mã nhân viên
	public ArrayList<ConNguoi> searchMaNhanVien(String maNhanVien) {
		ArrayList<ConNguoi> ketQua = new ArrayList<ConNguoi>();
		if(nhanSu.size() != 0) 
			for (ConNguoi conNguoi : nhanSu) 
				if (conNguoi.getMaNhanVien().equals(maNhanVien)) 
					ketQua.add(conNguoi);
		return ketQua;
	}

	//Tìm Kiếm theo Họ Và Tên
	public ArrayList<ConNguoi> searchNhanSuTheoHoVaTen(String hoVaTen) {
		ArrayList<ConNguoi> ketQua = new ArrayList<ConNguoi>();
		if(nhanSu.size() != 0)
			for (ConNguoi conNguoi : nhanSu)
				if (conNguoi.getHoVaTen().equalsIgnoreCase(hoVaTen))
					ketQua.add(conNguoi);
		return ketQua;
	}


	//Liệt kê theo đối tượng
	public void lietKeNhanSuTheoMa(String maNhanVien) {

		short kySuCount = 1;
		short conNhanCount = 1;
		short nhanVienCount = 1;
		short chuyenGiaNuocNgoaiCount = 1;
		short thucTapSinhCount = 1;
		short laoDongPhoThongCount = 1;
		short nhanVienPartTimeCount = 1;
		short canBoQuanLiCount = 1;


		//	List<ConNguoi> chỉ định rõ rằng NhanSu là một danh sách chứa các đối tượng thuộc lớp ConNguoi.
		//	Lấy danh sách nhân sự từ phương thức getNhanSu() và lưu trữ vào biến NhanSu
		List<ConNguoi> NhanSu = nhanSu;
		boolean kt = false;

		/* Bắt đầu vòng lặp for-each để duyệt qua từng đối tượng conNguoi trong danh sách NhanSu*/
		for (ConNguoi conNguoi :NhanSu) {
			//Lấy mã nhân viên của đối tượng conNguoi và lưu trữ vào biến maNhanVienConNguoi
			String maNhanVienConNguoi = conNguoi.getMaNhanVien();
			/* Phương thức charAt(0) trả về ký tự đầu tiên của chuỗi maNhanVienConNguoi,  Điều kiện này so
			 *  sánh ký tự đầu tiên của chuỗi maNhanVienConNguoi với ký tự đầu tiên của chuỗi maNhanVien. 
			 *  Nếu hai ký tự này giống nhau, điều kiện này trả về true.*/			
			if (maNhanVienConNguoi.length() >= 1 && maNhanVienConNguoi.charAt(0) == maNhanVien.charAt(0)) {
				kt = true;

				// để xác định xem phần tử trong danh sách con người có phải là một kỹ sư hay không 
				if (conNguoi instanceof KySu) {
					System.out.println("Thong tin nhan su Ky Su thu: " + kySuCount );
					System.out.println(conNguoi.toString());
					kySuCount++;
				} else if (conNguoi instanceof CongNhan) {
					System.out.println("Thong tin nhan su Cong Nhan thu: " + conNhanCount);
					System.out.println(conNguoi.toString());
					conNhanCount++;
				} else if (conNguoi instanceof NhanVien) {
					System.out.println("Thong tin nhan su Nhan Vien thu: "+ nhanVienCount);
					System.out.println(conNguoi.toString());
					nhanVienCount++;
				} else if (conNguoi instanceof ChuyenGiaNuocNgoai) {
					System.out.println("Thong tin nhan su Chuyen Gia Nuoc Ngoai thu: " + chuyenGiaNuocNgoaiCount);
					System.out.println(conNguoi.toString());
					chuyenGiaNuocNgoaiCount++;
				} else if (conNguoi instanceof ThucTapSinh) {
					System.out.println("Thong tin nhan su Thuc Tap Sinh thu: " + thucTapSinhCount++);
					System.out.println(conNguoi.toString());
					thucTapSinhCount++;
				} else if (conNguoi instanceof LaoDongPhoThong) {
					System.out.println("Thong tin nhan su Lao Dong Pho Thong: " + laoDongPhoThongCount);
					System.out.println(conNguoi.toString());
					laoDongPhoThongCount++;
				} else if (conNguoi instanceof NhanVienPartTime) {
					System.out.println("Thong tin nhan su Nhan Vien Part Time thu: " + nhanVienPartTimeCount);
					System.out.println(conNguoi.toString());
					nhanVienCount++;
				} else if (conNguoi instanceof CanBoQuanLy) {
					System.out.println("Thong tin nhan su Can Bo Quan Ly: "+ canBoQuanLiCount);
					System.out.println(conNguoi.toString());
					canBoQuanLiCount++;
				}
			}
		}
		if (!kt) {
			System.out.println("Khong ton tai NHAN SU co ma " + maNhanVien);
		}
	}

	//	Tính tổng lương tháng của từng loại đối tượng
	Double sumKySu = 0.0;
	Double sumCongNhan = 0.0;
	Double sumNhanVien = 0.0;
	Double sumChuyenGiaNuocNgoai = 0.0;
	Double sumThucTapSinh = 0.0;
	Double sumLaoDongPhoThong = 0.0;
	Double sumNhanVienPartTiem = 0.0;
	Double sumCanBoQuanLi = 0.0;
	double tongLuongCongTy = 0.0;
	public void TongLuongThang() {
		short demKs = 1;
		short demNv = 1;
		short demCn = 1;
		short demCgnn = 1;
		short demtts = 1;
		short demLdpt = 1;
		short demNvpt = 1;
		short demCbql = 1;
		short kySuCount = 0;
		short conNhanCount = 0;
		short nhanVienCount = 0;
		short chuyenGiaNuocNgoaiCount = 0;
		short thucTapSinhCount = 0;
		short laoDongPhoThongCount = 0;
		short nhanVienPartTimeCount = 0;
		short canBoQuanLiCount = 0;
		for (ConNguoi conNguoi : nhanSu) {
			if (conNguoi instanceof KySu) {
				KySu ks = (KySu) conNguoi;
				System.out.println("So ngay lam duoc thang nay cua KY SU thu "+ demKs++);
				sumKySu += ks.tinhTongLuongThang();
				tongLuongCongTy += sumKySu;
				kySuCount++;
			} else if (conNguoi instanceof CongNhan) {
				CongNhan cn = (CongNhan) conNguoi;
				System.out.println("So ngay lam duoc thang nay cua CONG NHAN thu "+ demCn++);
				sumCongNhan += cn.tinhTongLuongThang();
				tongLuongCongTy += sumCongNhan;
				conNhanCount++;

			} else if (conNguoi instanceof NhanVien) {	
				NhanVien nv = (NhanVien) conNguoi;
				System.out.println("So ngay lam duoc thang nay cua NHAN VIEN thu "+ demNv++);
				sumNhanVien += nv.tinhTongLuongThang();
				tongLuongCongTy += sumNhanVien;
				nhanVienCount++;
			} else if (conNguoi instanceof ChuyenGiaNuocNgoai) {
				ChuyenGiaNuocNgoai cgnn = (ChuyenGiaNuocNgoai) conNguoi;
				System.out.println("So ngay lam duoc thang nay cua CHUYEN GIA NUOC NGOAI thu "+ demCgnn++);
				sumChuyenGiaNuocNgoai += cgnn.tinhTongLuongThang();
				tongLuongCongTy += sumChuyenGiaNuocNgoai;
				chuyenGiaNuocNgoaiCount++;

			} else if (conNguoi instanceof ThucTapSinh) {
				ThucTapSinh tts = (ThucTapSinh) conNguoi;
				System.out.println("So ngay lam duoc thang nay cua THUC TAP SINH thu "+ demtts++);
				sumThucTapSinh += tts.tinhTongLuongThang();
				tongLuongCongTy += sumThucTapSinh;
				thucTapSinhCount++;
			} else if (conNguoi instanceof LaoDongPhoThong) {
				LaoDongPhoThong ldpt = (LaoDongPhoThong) conNguoi;
				System.out.println("So ngay lam duoc thang nay cua LAO DONG PHO THONG thu "+ demLdpt++);
				sumLaoDongPhoThong += ldpt.tinhTongLuongThang();
				tongLuongCongTy += sumLaoDongPhoThong;
				laoDongPhoThongCount++;

			} else if (conNguoi instanceof NhanVienPartTime) {
				NhanVienPartTime nvpt = (NhanVienPartTime) conNguoi;
				System.out.println("So ngay lam duoc thang nay cua NHAN VIEN PARTTIME thu "+ demNvpt++);
				sumNhanVienPartTiem += nvpt.tinhTongLuongThang();
				tongLuongCongTy += sumNhanVienPartTiem;
				nhanVienPartTimeCount++;
			} else if (conNguoi instanceof CanBoQuanLy) {
				CanBoQuanLy cbql = (CanBoQuanLy) conNguoi;
				System.out.println("So ngay lam duoc thang nay cua CAN BO QUAN LI thu "+ demCbql++);
				sumCanBoQuanLi += cbql.tinhTongLuongThang();
				tongLuongCongTy += sumCanBoQuanLi;
				canBoQuanLiCount++;}

		}
		System.out.println("Tong tien luong thang nay cua "+kySuCount+ " KY SU : " + sumKySu);
		System.out.println("Tong tien luong thang nay cua "+conNhanCount+ " CONG NHAN : " + sumCongNhan);
		System.out.println("Tong tien luong thang nay cua "+nhanVienCount+ " NHAN VIEN :"+ sumNhanVien);
		System.out.println("Tong tien luong thang nay cua "+chuyenGiaNuocNgoaiCount+ " CHUYEN GIA NUOC NGOAI: "+sumChuyenGiaNuocNgoai);
		System.out.println("Tong tien luong thang nay cua "+thucTapSinhCount+ " THUC TAP SINH thu: "+sumThucTapSinh);
		System.out.println("Tong tien luong thang nay cua "+laoDongPhoThongCount+ " LAO DONG PHO THONG: "+sumLaoDongPhoThong);
		System.out.println("Tong tien luong thang nay cua "+nhanVienPartTimeCount+ " NHAN VIEN PARTTIME: "+sumNhanVienPartTiem);
		System.out.println("Tong tien luong thang nay cua "+canBoQuanLiCount+ " CAN BO QUAN LI: "+sumCanBoQuanLi);

	}

	//Tính Lương trung bình của công ty
	public void luongTrungBinh() {
		int soLuongNhanVien = 0;
		if (nhanSu.size()==0) {
			System.out.println("Khong ton tai nhan su nao!");
		}
		else {

			for (ConNguoi conNguoi : nhanSu) {
				soLuongNhanVien++;
			}
			double luongTrungBinhCongTy =   tongLuongCongTy/soLuongNhanVien;
			System.out.println("So luong nhan su = " + soLuongNhanVien);
			System.out.println("Luong trung binh cua ca cong ty: " + luongTrungBinhCongTy);

		}

	}

	//	Tính lương trung bình của từng loại đối tượng
	public void tinhLuongTrungBinhCuaTungDoiTuong() {
		short kySuCount = 0;
		short congNhanCount = 0;
		short nhanVienCount = 0;
		short chuyenGiaNuocNgoaiCount = 0;
		short thucTapSinhCount = 0;
		short laoDongPhoThongCount = 0;
		short nhanVienPartTimeCount = 0;
		short canBoQuanLiCount = 0;

		for (ConNguoi conNguoi : nhanSu) {

			if (conNguoi instanceof KySu) {
				KySu ks = (KySu) conNguoi;
				kySuCount++;


			} else if (conNguoi instanceof CongNhan) {					        	
				CongNhan cn = (CongNhan) conNguoi;
				congNhanCount++;

			} else if (conNguoi instanceof NhanVien) {					        
				NhanVien nv = (NhanVien) conNguoi;
				nhanVienCount++;
			} else if (conNguoi instanceof ChuyenGiaNuocNgoai) {
				ChuyenGiaNuocNgoai cgnn = (ChuyenGiaNuocNgoai) conNguoi;
				chuyenGiaNuocNgoaiCount++;

			} else if (conNguoi instanceof ThucTapSinh) { 
				ThucTapSinh tts = (ThucTapSinh) conNguoi;
				thucTapSinhCount++;
			} else if (conNguoi instanceof LaoDongPhoThong) {	 
				LaoDongPhoThong ldpt = (LaoDongPhoThong) conNguoi;
				laoDongPhoThongCount++;

			} else if (conNguoi instanceof NhanVienPartTime) {
				NhanVienPartTime nvpt = (NhanVienPartTime) conNguoi;
				nhanVienPartTimeCount++;

			} else if (conNguoi instanceof CanBoQuanLy) {					        	 
				CanBoQuanLy cbql = (CanBoQuanLy) conNguoi;
				canBoQuanLiCount++;}

		}
		System.out.println("Trung Binh luong cua KY SU la: " + sumKySu/kySuCount);
		System.out.println("Trung Binh luong cua CONG NHAN la: " + sumCongNhan/congNhanCount);
		System.out.println("Trung Binh luong cua NHAN VIEN la: " + sumNhanVien/nhanVienCount);
		System.out.println("Trung Binh luong cua CHUYEN GIA NUOC NGOAI la: " + sumChuyenGiaNuocNgoai/chuyenGiaNuocNgoaiCount);
		System.out.println("Trung Binh luong cua THUC TAP SINH la: " + sumThucTapSinh/thucTapSinhCount);
		System.out.println("Trung Binh luong cua LAO DONG PHO THONG la: " + sumLaoDongPhoThong/laoDongPhoThongCount);
		System.out.println("Trung Binh luong cua NHAN VIEN PARTTIME la: " + sumNhanVienPartTiem/nhanVienPartTimeCount);
		System.out.println("Trung Binh luong cua CAN BO QUAN LI la: " + sumCanBoQuanLi/canBoQuanLiCount);

	}

	//Liệt kê tất cả nhân sự trong công ty từ người cao tuổi đến người thấp tuổi
	public void listNhanSuTheoTuoi() {
		if (nhanSu.size() == 0) {
			System.out.println("Khong ton tai bat ki nao trong danh sach!");
		} else {
			/*tạo một đối tượng ArrayList mới có tên là sortedNhanSu để lưu trữ danh sách các đối tượng 
 ConNguoi.*/			
			ArrayList<ConNguoi> sortedNhanSu = new ArrayList<ConNguoi>(nhanSu);
			/* sắp xếp danh sách sortedNhanSu theo một cách thức nhất định dựa vào 
			 * Đối tượng Comparator được tạo mới để xác định cách so sánh giữa hai
			 *  đối tượng ConNguoi khi thực hiện việc sắp xếp*/
			Collections.sort(sortedNhanSu, new Comparator<ConNguoi>() {
				@Override
				/*Trong đối tượng Comparator, chúng ta cần triển khai phương thức compare() 
				 * để xác định cách so sánh giữa hai đối tượng ConNguoi. Cụ thể 
				 * ta đặt thứ tự nguoi1 trước ngươi 2 co nghia là so sánh từ bé đến
				 * lớn theo thứ tự tăng dần người có ngày tháng năm sinh bé nhất sẽ 
				 * đứng đầu danh sách*/				
				public int compare(ConNguoi nguoi1, ConNguoi nguoi2) {
					LocalDate ngaySinh1 = nguoi1.getNamSinh();
					LocalDate ngaySinh2 = nguoi2.getNamSinh();


					/*So sánh theo năm sinh, tháng sinh và ngày sinh theo thứ tự từ trái qua phải.
Nếu ngày sinh của nguoi1 nhỏ hơn ngày sinh của nguoi2, trả về giá trị âm.()
Nếu ngày sinh của nguoi1 lớn hơn ngày sinh của nguoi2, trả về giá trị dương.
Nếu ngày sinh của nguoi1 bằng ngày sinh của nguoi2, trả về 0.*/					
					// So sánh theo năm sinh
					int namComparison = ngaySinh1.getYear() - ngaySinh2.getYear();
					if (namComparison != 0) {
						return namComparison;//Comparison(Là so sánh)
					}

					// So sánh theo tháng sinh
					int thangComparison = ngaySinh1.getMonthValue() - ngaySinh2.getMonthValue();
					if (thangComparison != 0) {
						return thangComparison;
					}

					// So sánh theo ngày sinh
					return ngaySinh1.getDayOfMonth() - ngaySinh2.getDayOfMonth();
				}
			});

			short kySuCount = 1;
			short conNhanCount = 1;
			short nhanVienCount = 1;
			short chuyenGiaNuocNgoaiCount = 1;
			short thucTapSinhCount = 1;
			short laoDongPhoThongCount = 1;
			short nhanVienPartTimeCount = 1;
			short canBoQuanLiCount = 1;
			for (ConNguoi conNguoi : sortedNhanSu) {

				if (conNguoi instanceof KySu) {
					KySu ks = (KySu) conNguoi;
					System.out.println("Thong tin nhan su KY SU thu " + kySuCount + ":");
					System.out.println(ks.toString());
					System.out.println("Tien luong: "+ks.tinhLuong());
					kySuCount++;
				} else if (conNguoi instanceof CongNhan) {					        	
					CongNhan cn = (CongNhan) conNguoi;
					System.out.println("Thong tin nhan su CONG NHAN thu " + conNhanCount + ":");
					System.out.println(cn.toString());
					System.out.println("Tien luong: "+cn.tinhLuong());
					conNhanCount++;

				} else if (conNguoi instanceof NhanVien) {					        
					NhanVien nv = (NhanVien) conNguoi;
					System.out.println("Thong tin nhan su NHAN VIEN thu " + nhanVienCount + ":");
					System.out.println(nv.toString());
					System.out.println("Tien luong: "+nv.tinhLuong());
					nhanVienCount++;
				} else if (conNguoi instanceof ChuyenGiaNuocNgoai) {
					ChuyenGiaNuocNgoai cgnn = (ChuyenGiaNuocNgoai) conNguoi;
					System.out.println("Thong tin nhan su CHUYEN GIA NUOC NGOAI thu " + chuyenGiaNuocNgoaiCount + ":");
					System.out.println(cgnn.toString());
					System.out.println("Tien luong: "+cgnn.tinhLuong());
					chuyenGiaNuocNgoaiCount++;

				} else if (conNguoi instanceof ThucTapSinh) { 
					ThucTapSinh tts = (ThucTapSinh) conNguoi;
					System.out.println("Thong tin nhan su THUC TAP SINH thu " + thucTapSinhCount + ":");
					System.out.println(tts.toString());
					System.out.println("Tien luong: "+tts.tinhLuong());
					thucTapSinhCount++; 

				} else if (conNguoi instanceof LaoDongPhoThong) {	 
					LaoDongPhoThong ldpt = (LaoDongPhoThong) conNguoi;
					System.out.println("Thong tin nhan su LAO DONG PHO THONG thu " + laoDongPhoThongCount + ":");
					System.out.println(ldpt.toString());
					System.out.println("Tien luong: "+ldpt.tinhLuong());
					laoDongPhoThongCount++;   

				} else if (conNguoi instanceof NhanVienPartTime) {
					NhanVienPartTime nvpt = (NhanVienPartTime) conNguoi;
					System.out.println("Thong tin nhan su THUC TAP SINH thu " + nhanVienPartTimeCount + ":");
					System.out.println(nvpt.toString());
					System.out.println("Tien luong: "+nvpt.tinhLuong());
					nhanVienPartTimeCount++;   

				} else if (conNguoi instanceof CanBoQuanLy) {					        	 
					CanBoQuanLy cbql = (CanBoQuanLy) conNguoi;
					System.out.println("Thong tin nhan su THUC TAP SINH thu " + canBoQuanLiCount + ":");
					System.out.println(cbql.toString());
					System.out.println("Tien luong: "+cbql.tinhLuong());
					canBoQuanLiCount++;   }
			}}}

	//	Tính tuổi trung bình của toàn công ty
	public double tinhDoTuoiTrungBinh() {
		//Tạo một đối tượng currentDate(Nghĩa là ngây hiện tại) của LocalDate để lưu trữ ngày hiện tại của hệ thống.
		LocalDate currentDate = LocalDate.now();
		//Lấy số lượng nhân sự trong danh sách nhanSu và lưu vào biến totalNhanSu(nghĩa là tổng cộng nhanSu).
		int totalNhanSu = nhanSu.size();
		int sumTuoi = 0;

		for (ConNguoi conNguoi : nhanSu) {
			//Lấy ngày sinh của đối tượng ConNguoi hiện tại và lưu vào biến ngaySinh kiểu LocalDate.
			LocalDate ngaySinh = conNguoi.getNamSinh();
			/*: Sử dụng phương thức between() của lớp Period để tính số tuổi của đối tượng ConNguoi. Phương thức 
			 * này tính khoảng cách giữa ngày tháng năm hiện tại với ngày tháng năm của đối tượng và trả về một đối
			 *  tượng Period.Sử dụng phương thức getYears() để lấy số tuổi từ đối tượng Period và lưu vào biến tuoi.*/			
			int tuoi = Period.between(ngaySinh, currentDate).getYears();
			sumTuoi += tuoi;
		}

		if (totalNhanSu > 0) {
			double tuoiTrungBinh = (double) sumTuoi / totalNhanSu;
			return tuoiTrungBinh;
		} else {
			return 0.0;
		}
	}

	//Tìm người trẻ và già nhất công ty
	public void timNguoiTreNhatVaLonTuoiNhat() {
		if (nhanSu.size() == 0) {
			System.out.println("Khong ton tai bat ki nguoi nao trong danh sach!");
		} else {
			/*Lấy đối tượng conNguoi đầu tiên từ danh sách nhân sự bằng phương thức get(0);
			 * lưu vào biến nguoiLonTuoiNhat và nguoiNhoTuoiNhat .Lý do cả 2 biến điều trỏ 
			 * đến đối tượng đầu tiêm trong danh sách cũng giống như t tìm phần tử lớn nhất
			 * và bé nhất trong mãng vậy khi tìm t mặc định thằng đầu tiên là bé nhất or lớn
			 * nhất và đem so sánh với các phần tử còn lại trong mảng nếu có phần tử nào lớn 
			 * or bé hơn giá trị ban đầu thì biến sẽ được cập nhật giá trị tương tự như ở đây là 
			 * tìm người cao tuổi nhất và thấp tuổi nhất*/
			ConNguoi nguoiLonTuoiNhat = nhanSu.get(0);
			ConNguoi nguoiTreTuoiNhat = nhanSu.get(0);

			for (ConNguoi conNguoi : nhanSu) {

				/*isBefore và isAfter là hai phương thức của lớp LocalDate trong gói java.time để so sánh thứ tự của
  hai đối tượng LocalDate*/
				/*isBefore được sử dụng để kiểm tra xem một đối tượng LocalDate có nhỏ hơn một đối tượng LocalDate khác 
				 * hay không nếu đúng thì trả về true sai thì false, cụ thể ở đây kiểm tra xem ngày tháng năm của một đối
				 *  tượng conNguoi có nhỏ hơn ngày tháng năm của đối tượng nguoiLonTuoiNhat hay không nếu đúng thì Lệnh trong 
				 *  điều kiện if được thực hiện*/			
				if (conNguoi.getNamSinh().isBefore(nguoiLonTuoiNhat.getNamSinh())) {
		 			nguoiLonTuoiNhat = conNguoi;/*Người có ngày tháng năm sinh nhỏ nhất tức người lớn tuổi
					 nhất được lưu vào biến nguoiLonTuoiNhat*/ 
				}

				/*/*isAfter được sử dụng để kiểm tra xem một đối tượng LocalDate có lớn hơn một đối tượng LocalDate khác 
				 * hay không nếu đúng trả về true sai thì false, cụ thể ở đây kiểm tra xem ngày tháng năm của một đối 
				 * tượng conNguoi có lớn hơn ngày tháng năm của đối tượng nguoiLonTuoiNhat hay không nếu đúng thì Lệnh 
				 * trong điều kiện if được thực hiện*/
				if (conNguoi.getNamSinh().isAfter(nguoiTreTuoiNhat.getNamSinh())) {
					nguoiTreTuoiNhat = conNguoi;/*Người có ngày tháng năm sinh lớn nhất tức người nhỏ tuổi
					 nhất được lưu vào biến nguoiNhoTuoiNhat*/ 
				}
			}

			System.out.println("Thong tin nguoi tre nhat:");
			System.out.println(nguoiTreTuoiNhat.toString());

			System.out.println("Thong tin nguoi lon tuoi nhat:");
			System.out.println(nguoiLonTuoiNhat.toString());
		}
	}
}
