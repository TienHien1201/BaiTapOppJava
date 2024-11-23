package quanLiNhanSu;

public class LanhDao extends ConNguoi {
private String capLanhDao;
private String phonngBanLamviec;

public LanhDao(String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String daThoiViec, String capLanhDao,
		String phonngBanLamviec) {
	super(hoVaTen, namSinh, gioiTinh, soDienThoai, daThoiViec);
	this.capLanhDao = capLanhDao;
	this.phonngBanLamviec = phonngBanLamviec;
}



public String getCapLanhDao() {
	return capLanhDao;
}



public void setCapLanhDao(String capLanhDao) {
	this.capLanhDao = capLanhDao;
}



public String getPhonngBanLamviec() {
	return phonngBanLamviec;
}



public void setPhonngBanLamviec(String phonngBanLamviec) {
	this.phonngBanLamviec = phonngBanLamviec;
}



@Override
public String toString() {
	return String.format("|"+ hoVaTen+"|"+namSinh+"|"+gioiTinh+"|"+soDienThoai+  "|"+ capLanhDao + "|" + phonngBanLamviec +"|"+daThoiViec+"|" );
}



}
