package team;

import java.util.Scanner;

import board.board;
import members.Member;


public class Teammain {

		public static void main(String[] args) {
			
			int num;
			board board = new board();
			Scanner input = new Scanner(System.in);
			
			while(true) {
			
				System.out.println("1. ȸ������ �̵�");
				System.out.println("2. �̺�Ʈ���� �̵�");
				System.out.println("3. �Խ��� �̵�");
				num = input.nextInt();
				
				switch(num) {
				case 1 :
					Member m = new Member();
					m.membership();
					break;
				case 2 : break;
				case 3 : board.boardForm(); break;
				
				}
			
			}
		}
}
