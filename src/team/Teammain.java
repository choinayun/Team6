package team;

import java.util.Scanner;

import board.board;

public class Teammain {

		public static void main(String[] args) {
			
			int num;
			board board = new board();
			Scanner input = new Scanner(System.in);
			
			while(true) {
			
				System.out.println("1. 회원관리 이동");
				System.out.println("2. 이벤트관리 이동");
				System.out.println("3. 게시판 이동");
				num = input.nextInt();
				
				switch(num) {
				case 1 : break;
				case 2 : break;
				case 3 : board.boardForm(); break;
				
				}
			
			}
		}
}
