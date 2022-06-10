package team;

import java.util.Scanner;

import board.board;
import event.EventFunc;
import members.Member;


public class Teammain {

		public static void main(String[] args) {
			
			int num;
			board board = new board();
			EventFunc ef = new EventFunc();
			Scanner input = new Scanner(System.in);
			
			while(true) {
			
				System.out.println("1. 회원관리 이동");
				System.out.println("2. 이벤트관리 이동");
				System.out.println("3. 게시판 이동");
				num = input.nextInt();
				
				switch(num) {
				case 1 :
					Member m = new Member();
					m.membership();
					break;
				case 2 : 
					ef.print();
					break;
				case 3 : board.boardForm(); break;
				
				}
			
			}
		}
}
