package co.edu.board;


public class Board{
	
	private int num;
	private String title;
	private String let;
	private String name;
	private String day;
	
	
	
	public Board(int num, String title, String let, String name, String day) {
		super();
		this.num = num;
		this.title = title;
		this.let = let;
		this.name = name;
		this.day = day;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLet() {
		return let;
	}

	public void setLet(String let) {
		this.let = let;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	

	@Override
	public String toString() {
		return 			"| 글번호 = " + num + " | 제목 = " + title + " | "
						+ "\n**************************************"
						+ "\n| 글 내용 | " + let + " | "
						+ "\n**************************************"
						+ "\n| 작성자 = " + name + " | 게시날짜 | " + day + " | ";
	}

}	
	