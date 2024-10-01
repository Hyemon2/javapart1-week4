package Tutorial_week14;

public class Ex_5 {
	public class StudentsTest {
	    public static void main(String[] args) {
	        StudentList c = new StudentList();

	        c.append(new Student(783, "Hank", 98));
	        c.append(new Student(234, "Kim", 30));
	        c.append(new Student(980, "Lee", 78));
	        c.append(new Student(123, "Joseph", 92));
	        c.append(new Student(456, "Joo", 96));
	        c.append(new Student(12, "Choi", 81));

	        c.print();

	        System.out.println("=======");
	        
	        c.studentAt(2).println();

	        System.out.println("=======");
	        
	        System.out.println(c.searchById(123));

	        System.out.println("=======");

	        c.sortById();
	        c.print();
	        System.out.println("=======");

	        c.reverse();
	        c.print();

	        System.out.println("=======");

	        c.sortByScore();
	        c.print();

	        System.out.println("=======");

	        c.reverse();
	        c.print();

	        System.out.println("=======");

	        System.out.println(c.average());
	    }
	}
}
