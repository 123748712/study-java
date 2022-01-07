package studyJava.chapter15;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// import oracle.jdbc.driver.OracleDriver;


public class JDBCProgramming {
	public static void main(String[] args) throws Exception {
		// JDBC : 자바와 데이터베이스와의 만남
		// java database connection

		// 0. JDBC driver 필요
		// 드라이버 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 1. 접속 (접속 정보 : 접속할 DB, 아이디, 비밀번호)
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");
		// 2. 쿼리를 작성할 워크시트 만듬
		Statement statement = connection.createStatement();
		// 3. 쿼리를 작성하고 실행
		ResultSet resultSet = statement.executeQuery("SELECT MEM_ID, MEM_NAME, MEM_HP, MEM_MAIL, MEM_BIR FROM MEMBER");
		// resultSet 은 워크시트에 실행한 결과를 말한다.
		// 4. 결과 화면에 표시
		while (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			Date memBir = resultSet.getDate("mem_bir");
			System.out.printf("%s \t %s \t %s \t %s \t %s\n", memId, memName, memHp, memMail, memBir);
		}
		// 5. 종료 
		resultSet.close();
		statement.close();
		connection.close();
		// 메모리에 쌓이기 때문에 close 해줘야한다.
	}
}