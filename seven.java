package java_basics;
import java.util.*;
public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a number : ");
		Scanner o1 = new Scanner(System.in);
		int a = o1.nextInt();
		for (int i=1;i<=10;i++)
	{	
			int c = a * i ;
			System.out.println(a + " x " + i +  " = " + c);
		}
		
		

	}

}
