package co.edu.board;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardExe {

	public static void main(String[] args) {
		// 게시글번호 / 제목/ 내용 / 작성자 / 작성일시
		// 등록, 수정, 삭제, 상세조회, 목록
		Scanner scanner = new Scanner(System.in);
//		ArrayList<Board> boards = new ArrayList<Board>();
		BoardApp service = new BoardList();

		while (true) {
			System.out.println("--------------------------------------");
			System.out.println("1.글등록, 2.글수정, 3.글삭제, 4.상세조회, 5.목록");
			System.out.println("--------------------------------------");

			int menu = 0;
			try {
				menu = Integer.parseInt(scanner.next());
			} catch (InputMismatchException | NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
			} catch (Exception e2) {
				System.out.println("알수 없는 예외 발생");
			}

			scanner.nextLine();
			if (menu == BoardApp.ADD) {
				try {
				System.out.println("글번호를 등록하세요");
				int num = Integer.parseInt(scanner.next());
				scanner.nextLine();
				System.out.println("글 제목을 입력하세요");
				String title = scanner.nextLine();
				;
				System.out.println("등록할 글을 작성하세요");
				String let = scanner.nextLine();
				System.out.println("작성자 이름을 적으세요");
				String name = scanner.nextLine();
				System.out.println("작성 날짜를 등록하세요");
				String day = scanner.nextLine();

				Board board = new Board(num, title, let, name, day);
				service.addBo(board);
				} catch (NumberFormatException e) {
					System.out.println("다시 한 번 확인하세요");
				}
				
			} else if (menu == BoardApp.MOD) {
				System.out.println("작성자 이름 입력");
				String name = scanner.nextLine();
				System.out.println("수정할 새 글을 입력하세요");
				String let = scanner.nextLine();
				Board board = new Board(0, null, let, name, null);
				service.modBo(board);

			} else if (menu == BoardApp.DEL) {
				System.out.println("삭제할 사람의 이름 입력");
				String name = scanner.nextLine();
				service.delBo(name);

			} else if (menu == BoardApp.SEARCH) {
				System.out.println("확인할 작성자 이름");
				String name = scanner.nextLine();
				service.searBo(name);

			} else if (menu == BoardApp.LIST) {
				service.listBo(null);

			}else {
				break;
			}
		}
		System.out.println("프로그램 종료");

	}

}
