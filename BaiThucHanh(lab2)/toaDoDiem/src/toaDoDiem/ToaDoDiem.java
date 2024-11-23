package toaDoDiem;

public class ToaDoDiem {
	private int x;
	private int y;
	
	
	public ToaDoDiem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//Method
	public double khoangcachDenO() {
		return Math.sqrt(x*x + y*y);	
	}
	
}
