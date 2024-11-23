package toaDoDiem;

public class HinhChuNhatManagemnt {

	public static void main(String[] args) {
		//Lớp tọa độ điểm 
		ToaDoDiemV3 P = new ToaDoDiemV3(3,4);
System.out.print("Diem P: "+ "(" + P.getX() +";"+P.getY()+")");
System.out.print("\nKhoang cach tu P den O: " + P.khoangcachDenO());

//Lớp hình chữ nhật
HinhChuNhat hcn = new HinhChuNhat(16, 4, P);
System.out.print("\nToa do goc tay bac: " + 
"(" + hcn.getGocTayBac().getX() + ";" + hcn.getGocTayBac().getY() + ")");
System.out.print("\nChieu ngang: "+ hcn.getNgang());
System.out.print("\nChieu cao: " + hcn.getCao());
System.out.print("\nKhoang cach tu goc tay bac den goc toa do O: " + hcn.KhoangCachGocTayBacĐenDiem0());
System.out.print("\nKhoang cach tu tam hinh chu nhat den goc toa do O: " + hcn.khoangCachTamDenO());
	}

}

