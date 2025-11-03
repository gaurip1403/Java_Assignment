package methodsandvariables;

import java.util.Scanner;

class UnderstandingScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for int A: ");
		int A = sc.nextInt();
		
		System.out.print("Enter value for float B: ");
		float B = sc.nextFloat();
		
		System.out.print("Enter value for double C: ");
		double C = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Enter value for String Str: ");
		String Str = sc.nextLine();
		
		
		System.out.println("int A="+A +" float B="+B+ " double C="+C+ " String="+Str);
		
		double mul = B*C;
		
		String addStr = A+Str;
		
		System.out.println("Multiplication of float and double = "+mul);
		
		System.out.println("Addition of int and string = "+addStr);
		
		sc.close();

	}

}
