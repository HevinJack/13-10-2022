package basicjavaproject1;

import java.util.Scanner;

public class First6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a first number");
		
		int a=s.nextInt();
		System.out.println("enter a second number");
		
		int b=s.nextInt();
		
		int add=a+b;
		int sub=a-b;
		int mult=a*b;
		int div=a/b;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
	}

}
