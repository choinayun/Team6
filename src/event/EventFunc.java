package event;

import java.util.Scanner;

public class EventFunc {
	Scanner input = new Scanner(System.in);
	int num;
	public void print() {
		System.out.println("1.�̴��� �̺�Ʈ ����");
		System.out.println("2.��ü �̺�Ʈ ����");
		num = input.nextInt();
		
		if(num==1) {
			TMEvent();
		}else if(num==2) {
			AllEvent();
		}
	}
	public void TMEvent(){
		System.out.println("�̴��� �̺�Ʈ �Դϴ�");
	}
	public void AllEvent() {
		System.out.println("��ü �̺�Ʈ �Դϴ�.");
	}
}
