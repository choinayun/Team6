package event;

import java.util.Scanner;

public class EventFunc {
	Scanner input = new Scanner(System.in);
	int num;
	public void print() {
		System.out.println("1.이달의 이벤트 보기");
		System.out.println("2.전체 이벤트 보기");
		num = input.nextInt();
		
		if(num==1) {
			TMEvent();
		}else if(num==2) {
			AllEvent();
		}
	}
	public void TMEvent(){
		System.out.println("이달의 이벤트 입니다");
	}
	public void AllEvent() {
		System.out.println("전체 이벤트 입니다.");
	}
}
