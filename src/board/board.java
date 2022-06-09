package board;

import java.util.Scanner;

class BoardFunction {
	
	public void boardWrite() {
		System.out.println("게시물을 등록합니다.");
	}
	
	public void boardList() {
		System.out.println("게시물을 출력합니다.");
	}
}

public class board {

	public void boardForm() {
		BoardFunction bf = new BoardFunction();
		Scanner scan = new Scanner(System.in);
		int select;
		
		System.out.println("1.게시물 등록");
		System.out.println("2.게시물 출력");
		select = scan.nextInt();
		
		if(select == 1) {
			bf.boardWrite();
		}else if(select == 2) {
			bf.boardList();
		}	
	}
}
