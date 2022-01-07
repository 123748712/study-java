package studyJava.chapter15.memo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/*
 * VO : Value Object
 * DTO : Data Transfer Object
 * Bean : 자바에서 객체를 bean 이라고 하낟.
 * Model : 데이터를 모델이라고 ㅎ나다.
 * Item : 데이터를 담는 항목
 */

public class MemoVO {
	private int no;
	private String writer;
	private String contents;
	private LocalDateTime registerDate;
	private LocalDateTime modifyDate;

	public MemoVO() {
	}

	public MemoVO(String writer, String contents) {
		this.writer = writer;
		this.contents = contents;
	}

	public MemoVO(int no, String writer, String contents, LocalDateTime registerDate) {
		this.no = no;
		this.writer = writer;
		this.contents = contents;
		this.registerDate = registerDate;
	}

	public MemoVO(int no, String writer, String contents, LocalDateTime registerDate, LocalDateTime modifyDate) {
		this.no = no;
		this.writer = writer;
		this.contents = contents;
		this.registerDate = registerDate;
		this.modifyDate = modifyDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public LocalDateTime getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDateTime registerDate) {
		this.registerDate = registerDate;
	}

	public LocalDateTime getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(LocalDateTime modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contents, modifyDate, no, registerDate, writer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MemoVO)) {
			return false;
		}
		MemoVO other = (MemoVO) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(modifyDate, other.modifyDate)
				&& no == other.no && Objects.equals(registerDate, other.registerDate)
				&& Objects.equals(writer, other.writer);
	}

	@Override
	public String toString() {
		return "MemoVo [no=" + no + ", writer=" + writer + ", contents=" + contents + ", registerDate=" + registerDate
				+ ", modifyDate=" + modifyDate + "]";
	}

}
