package board;

import java.util.Scanner;

class BoardFunction {
	
	public void boardWrite() {
		System.out.println("�Խù��� ����մϴ�.");
	}
	
	public void boardList() {
		System.out.println("�Խù��� ����մϴ�.");
	}
}

public class board {

	public void boardForm() {
		BoardFunction bf = new BoardFunction();
		Scanner scan = new Scanner(System.in);
		int select;
		
		System.out.println("1.�Խù� ���");
		System.out.println("2.�Խù� ���");
		select = scan.nextInt();
		
		if(select == 1) {
			bf.boardWrite();
		}else if(select == 2) {
			bf.boardList();
		}	
	}
}
