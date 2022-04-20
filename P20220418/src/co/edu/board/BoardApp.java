package co.edu.board;

public interface BoardApp {
	
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int LIST = 5;
	
	
	public void addBo(Board board);
	
	public void modBo(Board board);
	
	public void delBo(String name);
	
	public void searBo(String name);
	
	public void listBo(String name);
	

}
