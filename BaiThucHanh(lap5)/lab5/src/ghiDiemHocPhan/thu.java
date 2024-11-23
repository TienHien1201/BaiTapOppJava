package ghiDiemHocPhan;

public class thu {

	public static void main(String[] args) {
thu t = new thu();
t.name();
t.Tong();
	}
	int sum = 0;
	int tongHop = 0;
	short dem = 0;
public void Tong() {
	for (int i = 1; i <= 2; i++) {
		sum = 3 + 2 + i ;
		tongHop += sum;
		System.out.println("Tong thu " + i);
		System.out.println(sum);
		System.out.println(tongHop);
		dem++;
	}
	
}
public void name() {
	System.out.println("Trung binh thu " + dem + " = " + tongHop + "/" + dem);
	double avegare = tongHop/dem;
	double a = 13/2;
	System.out.println(avegare + "|" + a);
	System.out.println(tongHop);
}


}
