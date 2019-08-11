package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode; // 렌트가 됐냐 안됐냐 default를 0로 준다.

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book() {
		
	}
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
	
	public void print() {
		System.out.println("책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + (stateCode == 1 ? "재고있음" : "대여중"));
	}
	public void rent() {
		stateCode = 0;
		System.out.println(title + "이(가) 대여 됐습니다.");
	}

}