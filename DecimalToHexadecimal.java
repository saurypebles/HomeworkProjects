import  java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int decimalNumber =sc.nextInt();
		
		System.out.println(Integer.toHexString(decimalNumber).toUpperCase());
	}

}
