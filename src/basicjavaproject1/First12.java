package basicjavaproject1;

import java.util.Scanner;

public class First12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter 1st number");
		int a=s.nextInt();
		
		System.out.println("enter 2nd number");
		int b=s.nextInt();
		
		System.out.println("enetr 3rd number");
		int c=s.nextInt();
		
		int avg=(a+b+c)/3;
		System.out.println(avg);
	}

}
