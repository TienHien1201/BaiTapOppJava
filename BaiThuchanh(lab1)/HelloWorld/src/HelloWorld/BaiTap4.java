package HelloWorld;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class BaiTap4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	short[] a = new short[10];
	System.out.print("Nhap so luong phan tu n: ");
    short n = sc.nextShort();
	input(a, n);
	output(a, n);
	count(a, n);

	
}
public static void input(short[] a, short n) {
	Scanner sc = new Scanner(System.in);
for (int i = 0; i < n; i++) {
	System.out.print("a["+ i +"] =");
	 a[i] = sc.nextShort();
}
}
public static void output(short[] a, short n) {
System.out.print("Day a vua nhap: ");
	for (int i = 0; i < n; i++) {
	System.out.print(a[i]+ " ");
	}
}

public static void count(short[] a,short n) {
	short dem = 0;
for (int i = 0; i < n; i++) {
	if(a[i] > 0) {
		dem++;
	}
}
	if(dem > 0) {
		System.out.print("\nSo luong phan tu khong nho hon 0 la: " + dem);
	}	
	else {
		System.out.print("\nKhong ton tai phan tu khong nho hon 0.");
	}
}	

}

