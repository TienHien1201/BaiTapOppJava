package quanLiNhanSu;

public class NhanVien extends ConNguoi {
private String congViecChinh;

public NhanVien(String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String congViecChinh) {
	super(hoVaTen, namSinh, gioiTinh, soDienThoai);
	this.congViecChinh = congViecChinh;
}

public String getCongViecChinh() {
	return congViecChinh;
}

public void setCongViecChinh(String congViecChinh) {
	this.congViecChinh = congViecChinh;
}

@Override
public String toString() {
	return super.toString() + "|"+congViecChinh+"|";
}

	
	
}
