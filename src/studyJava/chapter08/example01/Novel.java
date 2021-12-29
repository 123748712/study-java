package studyJava.chapter08.example01;

public class Novel extends Book {

	public Novel(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		return lateDays * 300;
	}
}
