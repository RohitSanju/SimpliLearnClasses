package simplilearn_classes;

import java.util.Scanner;

public class ConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String stringToBeConverted  = sc.nextLine();
		
		int s = Integer.parseInt(stringToBeConverted);
		
		System.out.println("Integer value is :"+s);
		
		float f = Float.parseFloat(stringToBeConverted);
				
				
		

	}

}
