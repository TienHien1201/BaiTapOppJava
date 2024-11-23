package toaDoDiem;

public class ToaDoDiemV2 {
	private float x;
	private float y;
	
	public ToaDoDiemV2(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	
	}

	
	public float khoangcachDenO() {
		return (float)Math.sqrt(x*x + y*y);
	}
	
	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	
	
	
	
	
}

	

	
	
	

