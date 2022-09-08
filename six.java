package java_basics;
import java.util.*;
public class six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input first number :");
		Scanner o1 = new Scanner (System.in);
		int a = o1.nextInt();
		System.out.println("Input second number :");
		Scanner o2 = new Scanner (System.in);
		int b = o2.nextInt();
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		System.out.println(a + " + " + b  + " = " + c);
		System.out.println(a + " - " + b  + " = " + d);
		System.out.println(a + " x " + b  + " = " + e);
		System.out.println(a + " / " + b  + " = " + f);
		System.out.println(a + " mod " + b  + " = " + g);
		
	}

}
