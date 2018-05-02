package Gugudan;

import java.util.Scanner;

public class arraygugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number < 1) {
			return;
		}
		else {
		for(int i = 1; i <arr.length; i++) {
			arr[i] = number * i;
			System.out.println("result: " +arr[i]);
			}
		}
	}
}
