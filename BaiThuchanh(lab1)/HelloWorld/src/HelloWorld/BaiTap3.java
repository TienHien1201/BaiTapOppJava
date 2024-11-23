package HelloWorld;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		calculateAvegareAm();
	}
public static void calculateAvegareAm() {
	int Avegare = 0, count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap n phan tu: ");
   int n = sc.nextShort();
	for (int i = 0; i < n; i++) { 
		System.out.print("\nNhap phan tu thu "+ i +": ");
		int m = sc.nextShort();
			if(m < 0) {
				count++;
				Avegare += m;
	
		}
			}
			if(count > 0) {
				System.out.println("Trung binh cong cua cac phan tu am la " + Avegare);
			}
			
			else{
				System.out.print("\nKhong ton tai phan tu am.");
				}
			}
	
   }
	



