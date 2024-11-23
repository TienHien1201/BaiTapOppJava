package HelloWorld;

import java.util.Scanner;

public class BaiTap5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short[] a = new short[10];
		System.out.print("Nhap so luong phan tu n: ");
	    short n = sc.nextShort();
		input(a, n);
		output(a, n);
        MaxOne(a, n);
		
	}
	public static void input(short[] a, short n) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			if(n < 1) {
				System.out.print("\nNhap sai.Can Nhap n > 1 !");
				System.out.print("\nNhap so luong phan tu n: ");
			     n = sc.nextShort();	
			}	
			else {
	for (int i = 0; i < n; i++) {
		System.out.print("a["+ i +"]= ");
		 a[i] = sc.nextShort();
		 
		 for (int j = 0; j < n; j++) {
			if(a[i] == a[j])
				break;
		}
	     }
	break;
	  }
    }
}
	public static void output(short[] a, short n) {
	System.out.print("Day a vua nhap: ");
		for (int i = 0; i < n; i++) {
		System.out.print(a[i]+ " ");
		}
	}
		
	public static void MaxOne(short[] a, short n) {
		//Tìm số lớn nhất trong dãy
	    short max = a[0];
	    for (int i = 0; i < n; i++) {
	        if (a[i] > max) {
	            max = a[i];
	        }
	    }
	    //Fix lỗi nếu nhập số lớn nhất đầu tiên
	    short max0 = 0;
	    for (int i = 0; i < n; i++) {
			if(a[i] != max) {
				max0 = a[i];
			break;}        
	    }
	    //Duyệt mảng để tìm phần tử lớn thứ 2 trong mảng
	    for (int i = 0; i < n; i++) {
			if(a[i] > max0 && a[i] < max)
				max0 = a[i];
	}
	    System.out.print("\nPhan tu lon thu hai trong mang a la: " + max0);
	}
}
