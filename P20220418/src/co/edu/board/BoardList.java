package co.edu.board;

import java.util.ArrayList;

public class BoardList implements BoardApp{
	ArrayList<Board> boards = new ArrayList<Board>();
	
	
	
	@Override
	public void addBo(Board board) {
		boards.add(board);
	}

	@Override
	public void modBo(Board board) {
		for(int i=0; i<boards.size(); i++) {
			Board b2 = (Board) boards.get(i);
			if(b2.getName().equals(board.getName())){
				b2.setLet(board.getLet());
				break;
			}
		}
	}

	@Override
	public void delBo(String name) {
		for(int i=0; i<boards.size(); i++) {
			Board b2 = (Board) boards.get(i);
			if(b2.getName().equals(name)) {
				boards.remove(i);
			}
		}
		
	}

	@Override
	public void searBo(String name) {
		for(int i=0; i<boards.size(); i++) {
			Board b2 = (Board) boards.get(i);
			if(b2.getName().equals(name)) {
				System.out.println("=======================================");
				System.out.println(boards.get(i));
				System.out.println("=======================================");
			}
		}
		
	}

	@Override
	public void listBo(String name) {
		for(int i=0; i<boards.size(); i++) {
			if(boards.get(i) != null) {
				System.out.println("=======================================");
				System.out.println(boards.get(i));
				System.out.println("=======================================");
			}
		}
		
	}

}
