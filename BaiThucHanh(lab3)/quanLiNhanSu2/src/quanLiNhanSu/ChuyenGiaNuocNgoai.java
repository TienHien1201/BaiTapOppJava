package quanLiNhanSu;

public class ChuyenGiaNuocNgoai extends ConNguoi {
private String chuyenNghanh;
private String quoctich;
private String ngayHetHanVisa;



public ChuyenGiaNuocNgoai(String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String daThoiViec,
		String chuyenNghanh, String quoctich, String ngayHetHanVisa) {
	super(hoVaTen, namSinh, gioiTinh, soDienThoai, daThoiViec);
	this.chuyenNghanh = chuyenNghanh;
	this.quoctich = quoctich;
	this.ngayHetHanVisa = ngayHetHanVisa;
}



public String getChuyenNghanh() {
	return chuyenNghanh;
}



public void setChuyenNghanh(String chuyenNghanh) {
	this.chuyenNghanh = chuyenNghanh;
}



public String getQuoctich() {
	return quoctich;
}



public void setQuoctich(String quoctich) {
	this.quoctich = quoctich;
}



public String getNgayHetHanVisa() {
	return ngayHetHanVisa;
}



public void setNgayHetHanVisa(String ngayHetHanVisa) {
	this.ngayHetHanVisa = ngayHetHanVisa;
}



@Override
public String toString() {
	return String.format("|"+ hoVaTen+"|"+namSinh+"|"+gioiTinh+"|"+soDienThoai+"|" + chuyenNghanh + "|" + quoctich + "|"+daThoiViec+"|"
			+ ngayHetHanVisa + "|");
}




}
