package quanLiNhanVien;

public class KySu extends NhanSu{
	private String chuyenNghanhDaoTao;

	public KySu(String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String chuyenNghanhDaoTao) {
		super(hoVaTen, namSinh, gioiTinh, soDienThoai);
		this.chuyenNghanhDaoTao = chuyenNghanhDaoTao;
	}

	public String getChuyenNghanhDaoTao() {
		return chuyenNghanhDaoTao;
	}

	public void setChuyenNghanhDaoTao(String chuyenNghanhDaoTao) {
		this.chuyenNghanhDaoTao = chuyenNghanhDaoTao;
	}

	@Override
	public String toString() {
		return super.toString() + "|"+chuyenNghanhDaoTao+"|"  ;
	}


	

}
