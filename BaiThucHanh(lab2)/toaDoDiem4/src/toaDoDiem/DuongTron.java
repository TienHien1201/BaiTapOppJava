package toaDoDiem;

public class DuongTron {
private ToaDoDiemV4 tam;
private float banKinh;
public DuongTron(ToaDoDiemV4 tam, float banKinh) {
	this.tam = tam;
	this.banKinh = banKinh;
}

public ToaDoDiemV4 getTam() {
	return tam;
}

public float getBanKinh() {
	return banKinh;
}

public float khoangCachTamDuongTronDenO() {
	return tam.khoangcachDenO();
}

public float chuVi() {
	return (float)Math.PI * (2*banKinh);
}

public float dienTich() {
	return (float)Math.PI*(banKinh * banKinh);
}

public String phuongTrinhChinhTat() {
	float a = getTam().getX();
	float b = getTam().getY();
	return("(x - " + a + ")^2 + (y - " + b + ")^2 = " + banKinh*banKinh);
}

}





