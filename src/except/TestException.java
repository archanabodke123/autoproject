package except;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter divisor:");
			int i = sc.nextInt();
			System.out.println("Enter divident:");
			int j = sc.nextInt();
			int[] arth =new int[4];	
			
			try {
				
				int k = i/j;		//ArithmeticException
				System.out.println("Ans: "+k);
				
				arth[3]=20;			//ArrayIndexOutOfBoundsException [0 to 3 index address will allow]
				System.out.println("Array value at location 3"+arth[3]);
				
			}catch(ArithmeticException e1) {
				System.out.println("put valid divident");
			}catch(ArrayIndexOutOfBoundsException e2)
			{
				System.out.println("array out of size");
			}
			catch(Exception e) {
				System.out.println("Put valid data"); 		//parent exception class which defines always last
			}
			
		}
		
		
		

	}

}
