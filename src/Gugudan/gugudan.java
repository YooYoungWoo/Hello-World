package Gugudan;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("number: " +number);
		
		for(int i = 1; i <=9; i++) {
			System.out.println(number*i);
		}
		
	}

}


