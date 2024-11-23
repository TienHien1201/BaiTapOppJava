package quanLiNhanSu;

public class ConNguoi {
	private String hoVaTen;
	private int namSinh;
	private String gioiTinh;
	private String soDienThoai;
	public ConNguoi(String hoVaTen, int namSinh, String gioiTinh, String soDienThoai) {
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	@Override
	public String toString() {
		return String.format("|%-15s|%4d|%-3s|%10s|", hoVaTen,namSinh,gioiTinh,soDienThoai);
	}
	
	
	
	
}
