package studyJava.chapter15.memo;

import java.nio.file.attribute.AclEntry.Builder;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import oracle.jdbc.driver.OracleDriver;

// DAO : Data Access Object, 데이터베이스만 담당함
public class MemoDAO {

	// Art + Shift + M 으로 메소드 생성
	public List<MemoVO> selectAll() throws Exception {
		List<MemoVO> list = new ArrayList<MemoVO>();
		// CRUD : Create(insert), Read(select), Update, Delete
		// selectOne, selectAll
		// insert, update, delete
		// 메모 데이터 조회
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");
		Statement statement = connection.createStatement();
		// select -> executeQuery()
		ResultSet resultSet = statement
				.executeQuery("SELECT NO, WRITER, CONTENTS, REGISTER_DATE, MODIFY_DATE FROM MEMO");
		while (resultSet.next()) {
			// 데이터만 받아서 돌려주기만 하면 된다. 출력까지 담당하지 않도록 해야한다.
			int no = resultSet.getInt("no");
			String writer = resultSet.getString("writer");
			String contents = resultSet.getString("contents");
			Timestamp registerDate = resultSet.getTimestamp("register_date");
			Timestamp modifyDate = resultSet.getTimestamp("modify_date");
			list.add(new MemoVO(no, writer, contents, registerDate.toLocalDateTime(), Objects.nonNull(modifyDate) ? modifyDate.toLocalDateTime() : null));
		}
		resultSet.close();
		statement.close();
		resultSet.close();
		return list;
	}

	public int insertMemo(MemoVO vo) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");
		Statement statement = connection.createStatement();
		// insert, update, delete, -> executeUpdate()
		int executeUpdate = statement.executeUpdate("INSERT INTO MEMO (NO, WRITER, CONTENTS) VALUES (MEMO_SEQ.NEXTVAL, '" + vo.getWriter()+ "', '" + vo.getContents() + "')");
		// 쿼리 내용을 Update에 넣어 쿼리를 직접 만들어준다.
		statement.close();
		connection.close();
		return executeUpdate;
	}
	public int upDateMemo(MemoVO vo) throws Exception {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");

		// 가독성 함수 및 방법
		StringBuilder builder = new StringBuilder(); // StringBuffer();
		builder.append(" UPDATE MEMO");
		builder.append("     SET");
		builder.append("         CONTENTS = ?,");
		builder.append("         MODIFY_DATE = SYSDATE");
		builder.append(" WHERE");
		builder.append("     NO = ?");
		// ? 를 해놓은 후 나중에 값을 넣는다.
		PreparedStatement statement = connection.prepareStatement(builder.toString());
		// 미리 쿼리를 준비한 후 괄호 안에 정보를 넣어준 후 실행한다. createStatement 대신 사용 !
		statement.setString(1, vo.getContents()); // 첫번째 물음표에 contents 를 넣는다.
		statement.setInt(2, vo.getNo()); 	  // 두번째 물음표에 no 를 넣는다.

		int executeUpdate = statement.executeUpdate(); // 이미 쿼리를 만들어 놓았기 때문에 괄호 안에 값을 넣지 않아도 된다.
		statement.close();
		connection.close();
		return executeUpdate;
	}
	public int deleteMemo(int deleteNo) throws Exception { // 매개변수에 (MemoVO vo) 선언할 수 있지만 낭비일 수 있다.
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");
		StringBuilder builder = new StringBuilder();
		builder.append(" DELETE");
		builder.append(" 	FROM MEMO");
		builder.append(" WHERE");
		builder.append("	NO = ?");
		PreparedStatement statement = connection.prepareStatement(builder.toString());
		statement.setInt(1, deleteNo);
		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		return executeUpdate;
		
	}
}
