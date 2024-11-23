package ghiDiemHocPhan;

import java.util.ArrayList;

public class KiemThu {
	public static void main(String[] args) {
		//Kiểm thử điểm học phần và lớp ghi vào tập tin
		DiemHocPhan diemHocPhanSV1 = new DiemHocPhan("22150319", "OP", 8.9f);
		DiemHocPhan diemHocPhanSV2 = new DiemHocPhan("22150329", "OP", 8.7f);
		
		ArrayList<DiemHocPhan> bangDiemHocPhans = new ArrayList<DiemHocPhan>();
		bangDiemHocPhans.add(diemHocPhanSV1);
		bangDiemHocPhans.add(diemHocPhanSV2);
		
//		String tenTapTin = "SinhVien.dat";/*Lưu ý đây là tạo ra 1 tập tin nên không cần tạo
//		 trước mà đây là bước tạo kiểm tra nơi lưu tập tin "SinhVien.dat" nằm ở đâu thì 
//		 chuột phài vào class ở project rồi properties rồi nó lằm ở ngoài nơi lưu 1 đường truyền 
//		 */
//		GhiVaoTapTin ghi = new GhiVaoTapTin(tenTapTin, bangDiemHocPhans);
//		String ketQuaGhi = ghi.ghiDiemHocPhan();
//		System.out.println(ketQuaGhi);
		
//		Kiểm thử lớp doctaptin
String tenTapTin = "SinhVien.dat";	
DocTaptin doc = new DocTaptin(tenTapTin);
ArrayList<DiemHocPhan> bangDiemHocPhan = doc.docDiemHocPhan();
if (bangDiemHocPhans!= null) {
	for (DiemHocPhan i : bangDiemHocPhan) {
		System.out.println("Ma so sinh vien: " + i.getMaSoSV());
		System.out.println("Ma hoc phan: " + i.getMaHocPhan());
		System.out.println("Diem thi: "+ i.getDiem());
		System.out.println();
	}
}		
else {
	System.out.println("Co loi [ma loi 001]. Khong the doc duoc du lieu. Hay lien he......");
}		
	}

}
