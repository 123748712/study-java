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

// DAO : Data Access Object, �����ͺ��̽��� �����
public class MemoDAO {

	// Art + Shift + M ���� �޼ҵ� ����
	public List<MemoVO> selectAll() throws Exception {
		List<MemoVO> list = new ArrayList<MemoVO>();
		// CRUD : Create(insert), Read(select), Update, Delete
		// selectOne, selectAll
		// insert, update, delete
		// �޸� ������ ��ȸ
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");
		Statement statement = connection.createStatement();
		// select -> executeQuery()
		ResultSet resultSet = statement
				.executeQuery("SELECT NO, WRITER, CONTENTS, REGISTER_DATE, MODIFY_DATE FROM MEMO");
		while (resultSet.next()) {
			// �����͸� �޾Ƽ� �����ֱ⸸ �ϸ� �ȴ�. ��±��� ������� �ʵ��� �ؾ��Ѵ�.
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
		// ���� ������ Update�� �־� ������ ���� ������ش�.
		statement.close();
		connection.close();
		return executeUpdate;
	}
	public int upDateMemo(MemoVO vo) throws Exception {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");

		// ������ �Լ� �� ���
		StringBuilder builder = new StringBuilder(); // StringBuffer();
		builder.append(" UPDATE MEMO");
		builder.append("     SET");
		builder.append("         CONTENTS = ?,");
		builder.append("         MODIFY_DATE = SYSDATE");
		builder.append(" WHERE");
		builder.append("     NO = ?");
		// ? �� �س��� �� ���߿� ���� �ִ´�.
		PreparedStatement statement = connection.prepareStatement(builder.toString());
		// �̸� ������ �غ��� �� ��ȣ �ȿ� ������ �־��� �� �����Ѵ�. createStatement ��� ��� !
		statement.setString(1, vo.getContents()); // ù��° ����ǥ�� contents �� �ִ´�.
		statement.setInt(2, vo.getNo()); 	  // �ι�° ����ǥ�� no �� �ִ´�.

		int executeUpdate = statement.executeUpdate(); // �̹� ������ ����� ���ұ� ������ ��ȣ �ȿ� ���� ���� �ʾƵ� �ȴ�.
		statement.close();
		connection.close();
		return executeUpdate;
	}
	public int deleteMemo(int deleteNo) throws Exception { // �Ű������� (MemoVO vo) ������ �� ������ ������ �� �ִ�.
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
