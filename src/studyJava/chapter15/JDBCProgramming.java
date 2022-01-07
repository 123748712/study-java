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
		// JDBC : �ڹٿ� �����ͺ��̽����� ����
		// java database connection

		// 0. JDBC driver �ʿ�
		// ����̹� ���
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 1. ���� (���� ���� : ������ DB, ���̵�, ��й�ȣ)
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ddit", "java");
		// 2. ������ �ۼ��� ��ũ��Ʈ ����
		Statement statement = connection.createStatement();
		// 3. ������ �ۼ��ϰ� ����
		ResultSet resultSet = statement.executeQuery("SELECT MEM_ID, MEM_NAME, MEM_HP, MEM_MAIL, MEM_BIR FROM MEMBER");
		// resultSet �� ��ũ��Ʈ�� ������ ����� ���Ѵ�.
		// 4. ��� ȭ�鿡 ǥ��
		while (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			Date memBir = resultSet.getDate("mem_bir");
			System.out.printf("%s \t %s \t %s \t %s \t %s\n", memId, memName, memHp, memMail, memBir);
		}
		// 5. ���� 
		resultSet.close();
		statement.close();
		connection.close();
		// �޸𸮿� ���̱� ������ close ������Ѵ�.
	}
}