package first;
import java.util.*;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius,area,perimeter;
		System.out.println("Enter the radius ");
		Scanner o = new Scanner(System.in);
		
		
		radius = o.nextDouble();
		o.close ();
		area = 3.1415926535897927  * radius *radius ;
		perimeter =  2 *3.1415926535897927 *radius ;
		System.out.println(  "area is " + area  );
		System.out.println("perimeter is" + perimeter);
		
	}

}
