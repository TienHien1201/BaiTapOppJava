package exception;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSort {
public static void main(String[] args) {
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	arrayList.add(3);
	arrayList.add(1);
	arrayList.add(2);
	arrayList.add(7);
	
	//Sắp xếp từ obj1 dến obj 2 
	//Tức thằng đầu là thằng nhỏ nhất và thằng tiếp là thằng lớn dần ((obj1, obj2) -> obj1 - obj2)
    //	Ngược lại giảm dần thì ((obj1, obj2) -> obj2 - obj1);
	arrayList.sort((obj1, obj2) -> obj1 - obj2);
	for (Integer i : arrayList) {
		System.out.println(i);
	}
}
}
