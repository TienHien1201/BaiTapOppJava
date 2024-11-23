package quanLiNhanSu;

public class NhanVien extends ConNguoi {
private String congViecChinh;

public NhanVien(String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String daThoiViec,
		String congViecChinh) {
	super(hoVaTen, namSinh, gioiTinh, soDienThoai, daThoiViec);
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
	return String.format("|"+ hoVaTen+"|"+namSinh+"|"+gioiTinh+"|"+soDienThoai+"|"+congViecChinh+"|"+daThoiViec+"|");
}



}
