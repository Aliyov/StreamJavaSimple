package parallelStreams;

import java.util.*;
import java.util.Arrays;

class Student{
	String name;
	int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
		
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	
	
}
public class Demo1 {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
							new Student("David", 82),
							new Student("Bob", 86),
							new Student("John", 45),
							new Student("Adam", 0),
							new Student("Victor", 100),
							new Student("Gulia", 60),
							new Student("Francesca", 72),
							new Student("Mariam", 84),
							new Student("Abdul", 95),
							new Student("Smith", 30),
							new Student("Fuad", 90),
							new Student("Moses", 84)
												);
		studentList.stream()
				   .filter(std->std.getScore()>80)
				   .sorted(Comparator.comparingInt(Student::getScore).reversed())
				   .limit(3)
				   .forEach(s->System.out.println(s.getName()+" "+s.getScore()));
		

	}

}
