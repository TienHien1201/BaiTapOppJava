package quanLiNhanSu;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ConNguoi implements Serializable {

	private static final long serialVersionUID = 2L;
	protected String maNhanVien;
	protected String hoVaTen;
	/*Định dạng dữ liệu: Kiểu LocalDate cho phép lưu trữ thông tin
	 *về ngày tháng năm sinh theo đúng định dạng và quy tắc của ngày tháng năm . 
	 *Điều này giúp đảm bảo tính chính xác và tránh sai sót trong việc xử lý ngày tháng.
	 *Các phương thức hỗ trợ: Kiểu LocalDate cung cấp các phương thức và tính năng hữu ích 
	 *cho việc xử lý ngày tháng, bao gồm tính toán, so sánh và định dạng ngày tháng. Điều này giúp 
	 *dễ dàng thực hiện các thao tác như tính tuổi, so sánh tuổi, kiểm tra khoảng thời gian, và nhiều hơn nữa.*/    
	protected LocalDate namSinh;
	protected String goiTinh;
	protected String soDienThoai;
	protected String daThoiViec;
	protected float soGioLamViec;




	public ConNguoi(String maNhanVien, String hoVaTen, LocalDate namSinh, String goiTinh, String soDienThoai,
			String daThoiViec, float soGioLamViec) {
		super();
		this.maNhanVien = maNhanVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.goiTinh = goiTinh;
		this.soDienThoai = soDienThoai;
		this.daThoiViec = daThoiViec;
		this.soGioLamViec = soGioLamViec;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public LocalDate getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(LocalDate namSinh) {
		this.namSinh = namSinh;
	}

	public String getGoiTinh() {
		return goiTinh;
	}

	public void setGoiTinh(String goiTinh) {
		this.goiTinh = goiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}


	public String getDaThoiViec() {
		return daThoiViec;
	}

	public void setDaThoiViec(String daThoiViec) {
		this.daThoiViec = daThoiViec;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}



	public float getSoGioLamViec() {
		return soGioLamViec;
	}

	public void setSoGioLamViec(float soGioLamViec) {
		this.soGioLamViec = soGioLamViec;
	}

	@Override
	public String toString() {
		return "|" + hoVaTen + "|" + namSinh + "|" + goiTinh + "|"
				+ soDienThoai + "|" + daThoiViec + "|";
	}

	public double tinhTongLuongThang() {
		return 0;
	}

}