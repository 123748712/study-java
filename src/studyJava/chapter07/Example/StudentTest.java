package studyJava.chapter07.Example;

public class StudentTest {
public static void main(String[] args) {
	Human human = new Human("steve", 30);
	System.out.println(human);
	
	Student student = new Student("parker", 23, "physics");
	System.out.println(student);
	
	student.setName("peter");
	student.setAge(19);
	student.setMajor("computer science");

	System.out.print("�̸� : " + student.getName() + ", ");
	System.out.print("���� : " + student.getAge() + ", ");
	System.out.print("���� : " + student.getMajor());
}
}
