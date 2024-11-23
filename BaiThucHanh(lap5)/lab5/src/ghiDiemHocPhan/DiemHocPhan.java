package ghiDiemHocPhan;

import java.io.Serializable;
//Bên đồ án thì coppy lại đổi DiemHocPhan thành conNguoi
public class DiemHocPhan implements Serializable{
	private static final long serialVersionUID = 2L;

	private String maSoSV;;
	private String maHocPhan;
	private float diem;
	public DiemHocPhan(String maSoSV, String maHocPhan, float diem) {
		super();
		this.maSoSV = maSoSV;
		this.maHocPhan = maHocPhan;
		this.diem = diem;
	}
	public String getMaSoSV() {
		return maSoSV;
	}
	public void setMaSoSV(String maSoSV) {
		this.maSoSV = maSoSV;
	}
	public String getMaHocPhan() {
		return maHocPhan;
	}
	public void setMaHocPhan(String maHocPhan) {
		this.maHocPhan = maHocPhan;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}

}
