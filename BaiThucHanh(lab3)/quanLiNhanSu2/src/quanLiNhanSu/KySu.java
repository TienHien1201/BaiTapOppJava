package quanLiNhanSu;

public class KySu extends ConNguoi {
   
	private String chuyenNghanhDaoTao;


public KySu(String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String daThoiViec,
			String chuyenNghanhDaoTao) {
		super(hoVaTen, namSinh, gioiTinh, soDienThoai, daThoiViec);
		this.chuyenNghanhDaoTao = chuyenNghanhDaoTao;
	}


public String getChuyenNghanhDaoTao() {
	return chuyenNghanhDaoTao;
}

public void setChuyenNghanhDaoTao(String chuyenNghanhDaoTao) {
	this.chuyenNghanhDaoTao = chuyenNghanhDaoTao;
}



/*Để các thông tin của cha là protected thì lớp con có thể 
 * truy xuất trực tiếp vào các thông tin mà cha đã để là 
 * protected*/
@Override
public String toString() {
	return String.format("|"+ hoVaTen+"|"+namSinh+"|"+gioiTinh+"|"+soDienThoai+"|"+chuyenNghanhDaoTao+"|"+daThoiViec+"|");
}
/*Để truy xuất lại các thông tin mà cha đã để là private mà 
 * lớp con muốn kế thừa thì phải dùng supper.toString() thì
 * mới kế thừa đc các thông tin mà cha đã để là protected*/
//@Override
//public String toString() {
//	return super.toString()+"|"+chuyenNghanhDaoTao+"|";
//}

}
