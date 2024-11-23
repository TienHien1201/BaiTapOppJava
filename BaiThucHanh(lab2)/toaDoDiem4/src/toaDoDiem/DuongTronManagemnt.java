package toaDoDiem;

public class DuongTronManagemnt {
	//
	public static void main(String[] args) {
		//Kiểm thử lớp tọa độ điểm
		ToaDoDiemV4 P = new ToaDoDiemV4(4, 3);
		
		//Kiểm thử lớp Đường tròn
		DuongTron duongTron = new DuongTron(P, 7);
		System.out.print("Toa do tam duong tron O: " +
		"(" + duongTron.getTam().getX()+ ";"+duongTron.getTam().getY()+")");
		System.out.print("\nBan kinh duong tron: " + duongTron.getBanKinh());
		System.out.print("\nKhoang cach tu tam duong tron den toa do O: " + duongTron.khoangCachTamDuongTronDenO());
		System.out.print("\nChu vi duong tron: " + duongTron.chuVi() + 
				"\n" + "Dien Tich duong tron: " + duongTron.dienTich());
		System.out.print("\nPhuong trinh chinh tat Duong Tron: "+ duongTron.phuongTrinhChinhTat());
		
	}
	
}
