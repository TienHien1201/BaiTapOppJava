package exception;

public class ThuNghiem {

	public static void main(String[] args) {
		
	try {
		int []a = new int[5];
		a[10] = 6;
		System.out.println("a[10] = " + a[10]);
		
		int zero = 0;
		int average = 10/zero;
		System.out.println("Aveagre = " + average);
		
		String obj = null;
		System.out.println(obj.length());
//	} catch (NullPointerException ex) {
//		System.out.println("NULL error!" + ex);
//	}	catch (ArithmeticException ex) {
//		System.out.println("Arithmetic error!" + ex);
//	}catch (ArrayIndexOutOfBoundsException ex) {
//		System.out.println("Index out of bounds error!" +ex);
		
//		chỉ cần nhớ cái này thì sẽ bắt đc lỗi không cần báo lỗi chi tiết
	}catch (Exception ex) {
		System.out.println(ex);
	}finally {
		System.out.println("Finished!");
	}
	}

}
