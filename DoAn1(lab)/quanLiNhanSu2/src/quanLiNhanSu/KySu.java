package quanLiNhanSu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KySu extends ConNguoi{
	private String chuyenNhanhDaoTao;

	public KySu(String maNhanVien, String hoVaTen, LocalDate namSinh, String goiTinh, String soDienThoai, String daThoiViec,
			float soGioLamViec, String chuyenNhanhDaoTao) {
		super(maNhanVien, hoVaTen, namSinh, goiTinh, soDienThoai, daThoiViec, soGioLamViec);
		this.chuyenNhanhDaoTao = chuyenNhanhDaoTao;
	}

	public String getChuyenNhanhDaoTao() {
		return chuyenNhanhDaoTao;
	}

	public void setChuyenNhanhDaoTao(String chuyenNhanhDaoTao) {
		this.chuyenNhanhDaoTao = chuyenNhanhDaoTao;
	}

	//Phương thức tính lương KySu
	public double tinhLuong() {
		float motGio = 70000;
		return soGioLamViec * motGio;
	}

	public double tinhTongLuongThang() {
		float heSoLuong = 1.5f;
		Scanner sc = new Scanner(System.in);
		int soNgay = sc.nextInt();
		sc.nextLine();

		double tongLuong = soNgay * tinhLuong() * heSoLuong;

		String formattedLuong = String.format("%.20f", tongLuong);
		return Double.parseDouble(formattedLuong);
	}

	@Override
	public String toString() {
		/*Đoạn code này giúp chuyển đổi ngày tháng năm sinh từ đối tượng LocalDate thành 
		 * chuỗi ký tự có định dạng ngày/tháng/năm, để có thể hiển thị thông tin năm sinh 
		 * dễ đọc hơn cho người dùng.*/	

		//	khai báo một đối tượng DateTimeFormatter với mẫu định dạng "dd/MM/yyyy".
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		/*, sử dụng phương thức format() của đối tượng LocalDate (namSinh) để chuyển đổi nó 
		 * thành chuỗi ký tự theo định dạng đã cho sau đó lưu vào biến Formatted, là chuỗi ký 
		 * tự đã định dạng theo "dd/MM/yyyy".*/	  
		String Formatted = namSinh.format(formatter);
		return "|"+maNhanVien+"|" + hoVaTen +"|" + Formatted + "|" + goiTinh + "|"+ soDienThoai + "|" + chuyenNhanhDaoTao + "|"+soGioLamViec+"|"+ daThoiViec+"|";
	}


}
