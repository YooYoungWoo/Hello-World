package practice;

import java.util.Scanner;
import java.util.Arrays;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요 ");
	            System.out.print("철수>> ");
				String var1 = scan.nextLine();
				System.out.print("영희>> ");
				String var2 = scan.nextLine();
				
				if(!Arrays.asList(new String[] {"가위", "바위", "보"}).contains(var1) || !Arrays.asList(new String[] {"가위", "바위", "보"}).contains(var2)) {
					System.out.println("잘못입력 \n");
				}
				
				switch(var1) {
				case "가위":
					if(var2.equals("가위"))
						System.out.println("비김");
					else if(var2.equals("바위"))
						System.out.println("영희가 이김");
					else if(var2.equals("보"))
						System.out.println("철수가 이김");
					break;
				case "바위":
					if(var2.equals("가위"))
						System.out.println("철수가 이김");
					else if(var2.equals("바위"))
						System.out.println("비김");
					else if(var2.equals("보"))
						System.out.println("영희가 이김");
					break;
				case "보":
					if(var2.equals("가위"))
						System.out.println("영희가 이김");
					else if(var2.equals("바위"))
						System.out.println("철수가 이김");
					else if(var2.equals("보"))
						System.out.println("비김");
					break;
				}	
			}
			catch(Exception e) {
				break;
			}
		}  
		scan.close();
	}
}
