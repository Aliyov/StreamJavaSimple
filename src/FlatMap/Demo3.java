package FlatMap;
import java.util.*;

class Student{
	String sname;
	int sid;
	char grade;
	 
	Student(String sname,int sid, char grade){
		this.sid = sid;
		this.sname = sname;
		this.grade = grade;
	}
	public String toString() {
		return sname+ " "+sid+" "+grade;
	}
}

public class Demo3 {

	public static void main(String[] args) {
		List<Student> studentList1 = new ArrayList<>();
		studentList1.add(new Student("Smith",101,'B'));
		studentList1.add(new Student("Adam",204,'C'));
		studentList1.add(new Student("John",456,'A'));
		studentList1.add(new Student("Robert",151,'A'));
		 
		List<Student> studentList2 = new ArrayList<>();
		studentList1.add(new Student("Gulia",107,'B'));
		studentList1.add(new Student("Meryem",284,'C'));
		studentList1.add(new Student("Nastya",416,'A'));
		studentList1.add(new Student("Natalia",961,'A'));
		
		List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);
		System.out.println(studentList);
		studentList.stream()
				   .flatMap(std->std.stream())
				   .map(sd->sd.sname)
				   .forEach(System.out::println);	
	}

}
