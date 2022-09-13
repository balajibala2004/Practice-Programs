

import java.util.*;
public class thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					// TODO Auto-generated method stub
				Double length,breadth,area,perimeter;
				
				Scanner o = new Scanner(System.in);
				System.out.println("enter the length");
				length = o.nextDouble();
			    System.out.println("enter the breadth");
			    breadth = o.nextDouble();
				
				area = length *breadth;
				perimeter =  2 * (length + breadth);
				System.out.printf(  "area is %.2f ",area  );
				System.out.println();
				
				System.out.printf("perimeter is %.2f ",perimeter);
				
			

		
	}

}
