package ghiDiemHocPhan;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GhiVaoTapTin {
private String tenTapTin;
private ArrayList<DiemHocPhan>diemHocPhan;
public GhiVaoTapTin(String tenTapTin, ArrayList<DiemHocPhan> diemHocPhan) {
	super();
	this.tenTapTin = tenTapTin;
	this.diemHocPhan = diemHocPhan;
}

//Ghi đối tượng vào tập tin, Thành công trả về "ghi thành công", thất bị trả về "ghi thất bại"
public String ghiDiemHocPhan() {
	try {
		FileOutputStream f = new FileOutputStream(tenTapTin, false);//false xóa thông tin cũ khi ghi cái mới
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(diemHocPhan);
		
		o.close();
		f.close();
		return "Ghi thanh cong";
	} catch (Exception e) {
		
		return "Co loi xay ra. Ma loi: " + e.getMessage();
	}
	
}


}
