package studyJava.chapter15.memo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class MemoMain {
public static void main(String[] args) throws Exception{
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		MemoDAO dao = new MemoDAO();
		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1. �޸�����ȸ | 2. �޸��� | 3. ���α׷� ����");
			System.out.println("--------------------------------------");
			System.out.print("�޴� > ");
			int menu = Integer.parseInt(scanner.nextLine()); // ������ scanner �� �Է¹޴°��� ���� ����.
			switch (menu) {
			case 1:
				List<MemoVO> list = dao.selectAll();
				for (MemoVO vo : list) {
					System.out.printf("%d \t %s \t %s \t %s \t %s\n", vo.getNo(), vo.getWriter(), vo.getContents(), vo.getRegisterDate(), vo.getModifyDate());
				}
				System.out.println("----------------");
				System.out.println("1. ���� | 2. ����");
				System.out.println("----------------");
				System.out.print("���� > ");
				int m = Integer.parseInt(scanner.nextLine());
				switch (m) {
				case 1:
					System.out.println("������ ��ȣ�� �Է��ϼ��� : ");
					int updateNo = Integer.parseInt(scanner.nextLine());
					System.out.println("������ ������ �Է��ϼ��� : ");
					String contents = scanner.nextLine();
					MemoVO vo = new MemoVO();
					vo.setNo(updateNo);
					vo.setContents(contents);
					dao.upDateMemo(vo);
					break;
				case 2:
					System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
					
					int deleteNo = Integer.parseInt(scanner.nextLine());
					dao.deleteMemo(deleteNo);
					break;
				default:
					break;
				}
				break;
			case 2:
				System.out.print("�޸� �Է����ּ��� : ");
				String contents = scanner.nextLine();
				dao.insertMemo(new MemoVO("a001", contents));
				break;
			default:
				// System.exit(0);
				break;
			}
		}
		scanner.close();
	}
}