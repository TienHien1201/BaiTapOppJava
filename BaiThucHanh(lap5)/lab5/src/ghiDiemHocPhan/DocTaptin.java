package ghiDiemHocPhan;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DocTaptin {
private String tenTapTin;

public DocTaptin(String docTapTin) {
	this.tenTapTin = docTapTin;
}

//Đọc đối tượng từ tập tin,  Thành công trả về "diem", thất bị trả về "doc thất bại"
public ArrayList<DiemHocPhan> docDiemHocPhan(){
ArrayList<DiemHocPhan> bangDiemHocPhan = null;
try {
	FileInputStream f = new FileInputStream(tenTapTin);
	ObjectInputStream o = new ObjectInputStream(f);
	bangDiemHocPhan = (ArrayList<DiemHocPhan>)o.readObject();//ép kiểu về ArrayList
	
	o.close();
	f.close();
return bangDiemHocPhan;
} catch (Exception e) {
	return null;
}
}
}
