package practice;

import java.util.Scanner;
import java.util.Arrays;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ��� ");
	            System.out.print("ö��>> ");
				String var1 = scan.nextLine();
				System.out.print("����>> ");
				String var2 = scan.nextLine();
				
				if(!Arrays.asList(new String[] {"����", "����", "��"}).contains(var1) || !Arrays.asList(new String[] {"����", "����", "��"}).contains(var2)) {
					System.out.println("�߸��Է� \n");
				}
				
				switch(var1) {
				case "����":
					if(var2.equals("����"))
						System.out.println("���");
					else if(var2.equals("����"))
						System.out.println("���� �̱�");
					else if(var2.equals("��"))
						System.out.println("ö���� �̱�");
					break;
				case "����":
					if(var2.equals("����"))
						System.out.println("ö���� �̱�");
					else if(var2.equals("����"))
						System.out.println("���");
					else if(var2.equals("��"))
						System.out.println("���� �̱�");
					break;
				case "��":
					if(var2.equals("����"))
						System.out.println("���� �̱�");
					else if(var2.equals("����"))
						System.out.println("ö���� �̱�");
					else if(var2.equals("��"))
						System.out.println("���");
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
