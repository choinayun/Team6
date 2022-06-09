package members;

import java.util.Scanner;

public class Member {

	public void membership() {
		
		System.out.println("1. 회원 저장");
		System.out.println("2. 회원 수 확인");
		
		int choice;
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();
		
		if(choice == 1) {
			System.out.println("회원 저장기능입니다.");
		}else if(choice == 2){
			System.out.println("회원 수를 보여주는 기능입니다.");
		}else {
			System.out.println("잘못 선택하셨습니다.");
		}
	}
}
