package basicjavaproject1;

import java.util.Scanner;

public class First7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int a=s.nextInt();
		
		int i=0;
		
		for (i=0;i<10;i++){
			
			System.out.println(a+"*"+i+"="+(a*(i+1)));
		
			
		}
		
		
	}

}
