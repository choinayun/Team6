package members;

import java.util.Scanner;

public class Member {

	public void membership() {
		
		System.out.println("1. ȸ�� ����");
		System.out.println("2. ȸ�� �� Ȯ��");
		
		int choice;
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();
		
		if(choice == 1) {
			System.out.println("ȸ�� �������Դϴ�.");
		}else if(choice == 2){
			System.out.println("ȸ�� ���� �����ִ� ����Դϴ�.");
		}else {
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
	}
}
