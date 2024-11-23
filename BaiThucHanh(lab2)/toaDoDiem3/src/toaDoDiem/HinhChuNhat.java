package toaDoDiem;

public class HinhChuNhat {
	private float ngang;
	private float cao;
	private ToaDoDiemV3  gocTayBac;
	
	public HinhChuNhat(float ngang, float cao, ToaDoDiemV3 gocTayBac) {
		this.ngang = ngang;
		this.cao = cao;
		this.gocTayBac = gocTayBac;
	}
	public float getNgang() {
		return ngang;
	}
	
	public float getCao() { 
		return cao;
	}
	
	public ToaDoDiemV3 getGocTayBac() {
		return gocTayBac;
	}
	public float KhoangCachGocTayBacĐenDiem0() {
		return  gocTayBac.khoangcachDenO();
	}
	public float khoangCachTamDenO() {
		float a = gocTayBac.getX() + ngang/2;  
		float b	= gocTayBac.getY() + cao/2; 
		return (float)Math.sqrt(a*a + b*b); 
	}
}
	

