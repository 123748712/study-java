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
			System.out.println("1. 메모목록조회 | 2. 메모등록 | 3. 프로그램 종료");
			System.out.println("--------------------------------------");
			System.out.print("메뉴 > ");
			int menu = Integer.parseInt(scanner.nextLine()); // 동일한 scanner 로 입력받는것이 가장 좋다.
			switch (menu) {
			case 1:
				List<MemoVO> list = dao.selectAll();
				for (MemoVO vo : list) {
					System.out.printf("%d \t %s \t %s \t %s \t %s\n", vo.getNo(), vo.getWriter(), vo.getContents(), vo.getRegisterDate(), vo.getModifyDate());
				}
				System.out.println("----------------");
				System.out.println("1. 수정 | 2. 삭제");
				System.out.println("----------------");
				System.out.print("선택 > ");
				int m = Integer.parseInt(scanner.nextLine());
				switch (m) {
				case 1:
					System.out.println("수정할 번호를 입력하세요 : ");
					int updateNo = Integer.parseInt(scanner.nextLine());
					System.out.println("수정할 내용을 입력하세요 : ");
					String contents = scanner.nextLine();
					MemoVO vo = new MemoVO();
					vo.setNo(updateNo);
					vo.setContents(contents);
					dao.upDateMemo(vo);
					break;
				case 2:
					System.out.print("삭제할 번호를 입력하세요 : ");
					
					int deleteNo = Integer.parseInt(scanner.nextLine());
					dao.deleteMemo(deleteNo);
					break;
				default:
					break;
				}
				break;
			case 2:
				System.out.print("메모를 입력해주세요 : ");
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