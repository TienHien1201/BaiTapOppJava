package quanLiNhanSu;

import java.util.Objects;

public class ConNguoi implements Comparable<ConNguoi>{
	
	protected String hoVaTen;
	protected int namSinh;
	protected String gioiTinh;
	protected String soDienThoai;
	protected String daThoiViec;
	
	public ConNguoi(String daThoiViec) {
		this.daThoiViec = daThoiViec;
	}
	
	public ConNguoi(String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String daThoiViec) {
		super();
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.daThoiViec = daThoiViec;
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
	public void setDaThoiViec(String daThoiViec) {
		this.daThoiViec = daThoiViec;
	}
	public String getDaThoiViec() {
		return daThoiViec;
	}
	

	@Override
	public String toString() {
	return "|" + hoVaTen +"|" + namSinh + "|" + gioiTinh + "|"
			+ soDienThoai + "|"+ daThoiViec+"|";
	}
	@Override
	public int compareTo(ConNguoi o) {
		return this.daThoiViec.compareTo(o.daThoiViec);
	}

	@Override
	public int hashCode() {
		return Objects.hash(daThoiViec, gioiTinh, hoVaTen, namSinh, soDienThoai);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConNguoi other = (ConNguoi) obj;
		return Objects.equals(daThoiViec, other.daThoiViec);
	}
}
