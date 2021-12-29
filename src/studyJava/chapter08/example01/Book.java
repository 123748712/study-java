package studyJava.chapter08.example01;

public abstract class Book {
	private int number;
	private String title;
	private String author;
	private static int countOfBooks;

	public Book(String title, String author) {
		this.countOfBooks++;
		this.number = countOfBooks;
		this.title = title;
		this.author = author;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	public abstract int getLateFee(int lateDays);

	public boolean equals(Book book) {
		if (this.title.equals(book.title)) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return hashCode();
	}

	public String toString() {
		return "관리번호 " + number + "번, 제목 : " + getTitle() + ", 작가 : " + getAuthor() + "(일주일 연체료 : "
				+ String.format("%,d", getLateFee(7)) + "원)";
	}
}