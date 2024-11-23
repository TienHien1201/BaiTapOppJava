package quanLiNhanSu;

public class KySu extends ConNguoi {
   private String chuyenNghanh;

public KySu(String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String chuyenNghanh) {
	super(hoVaTen, namSinh, gioiTinh, soDienThoai);
	this.chuyenNghanh = chuyenNghanh;
}

public String getChuyenNghanh() {
	return chuyenNghanh;
}

public void setChuyenNghanh(String chuyenNghanh) {
	this.chuyenNghanh = chuyenNghanh;
}

@Override
public String toString() {
	return super.toString()+"|"+chuyenNghanh+"|";
}

   


}
