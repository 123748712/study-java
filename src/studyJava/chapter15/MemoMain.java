package studyJava.chapter15;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemoMain {
	public MemoMain() throws Exception {
		// CRUD : Create(insert), Read(select), Update, Delete
		// selectOne, selectAll
		// insert, update, delete
		// 메모 데이터 조회
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT NO, WRITER, CONTENTS, REGISTER_DATE, MODIFY_DATE FROM MEMO");
		while(resultSet.next()) {
			int no = resultSet.getInt("no");
			String writer = resultSet.getString("writer");
			String contents = resultSet.getString("contents");
			Date registerDate = resultSet.getDate("register_date");
			Date modifyDate = resultSet.getDate("modify_date");
			System.out.printf("%d \t %s \t %s \t %s \t %s\n", no, writer, connection, registerDate, modifyDate);
		}
		resultSet.close();
		statement.close();
		resultSet.close();
	}
}