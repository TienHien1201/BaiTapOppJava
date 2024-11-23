package toaDoDiem;

public class ToaDoDiemV4 {
	private int x;
	private int y;
	
	
	public ToaDoDiemV4(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//Method
	public float khoangcachDenO() {
		return (float)Math.sqrt(x*x + y*y);	
	}

	public int getX() {
		return x;
	}

	
	public int getY() {
		return y;
	}
	
}
