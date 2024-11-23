package quanLiNhanSu;

public class CongNhan extends ConNguoi {
private String bacNghe;


public CongNhan(String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String daThoiViec, String bacNghe) {
	super(hoVaTen, namSinh, gioiTinh, soDienThoai, daThoiViec);
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
	return String.format("|"+ hoVaTen+"|"+namSinh+"|"+gioiTinh+"|"+soDienThoai+"|"+bacNghe+"|"+daThoiViec+"|");
}








}
