import java.util.Scanner;

public class twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of  elements:  ");
		Scanner o = new Scanner(System.in);
		int n = o.nextInt();

		int sum = 0;
		int a[] = new int[n];
		// TODO Auto-generated method stub
			for (int i =0;i<n;i++)
			{
				System.out.println("enter the element"   +  " " +  i + " ");
				a[i] = o.nextInt();
				sum = sum + a[i];
				}
		double average = (float)sum/n;
		System.out.println("the average is " + average );
		
	}

}
