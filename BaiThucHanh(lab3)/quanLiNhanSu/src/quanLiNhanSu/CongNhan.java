package quanLiNhanSu;

public class CongNhan extends ConNguoi {
private String bacNghe;

public CongNhan(String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String bacNghe) {
	super(hoVaTen, namSinh, gioiTinh, soDienThoai);
	this.bacNghe = bacNghe;
}



public String getBacNghe() {
	return bacNghe;
}



public void setBacNghe(String bacNghe) {
	this.bacNghe = bacNghe;
}



@Override
public String toString() {
	return super.toString() +  "|"+bacNghe+"|";
}



}
