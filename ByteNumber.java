package converttobyte;


import java.util.Scanner;


public class ByteNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t\t A simple java program to convert a number to byte\n");
		System.out.println("Enter a number.. \n");
		n=input.nextInt();
		byte b=(byte)n;
		System.out.println("The byte is : "+b);
	}

}
