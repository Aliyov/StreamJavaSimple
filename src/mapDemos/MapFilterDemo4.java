package mapDemos;
import java.util.*;
import java.util.stream.Collectors;
class Employee{
	int empId;
	String empName;
	int salary;
	
	public Employee(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
}
public class MapFilterDemo4 {

	public static void main(String[] args) {
		/*
		List <Employee> employeesList = new ArrayList<>();
		employeesList.add(new Employee(101,"Alex",650));
		employeesList.add(new Employee(245,"John",1500));
		employeesList.add(new Employee(124,"Rauf",800));
		employeesList.add(new Employee(845,"Francesco",400));
		employeesList.add(new Employee(56,"Philip",2000));
		*/
		
		List <Employee> employeeList = Arrays.asList(
				new Employee(101,"Alex",650),
				new Employee(245,"John",1500),
				new Employee(124,"Rauf",800),
				new Employee(845,"Francesco",400),
				new Employee(56,"Philip",2000)
				);
		
		//Combination of filter and map
		List <Integer> employeeSalList = employeeList.stream()
													 .filter(e -> e.salary > 500) //filtering
													 .map(e -> e.salary)
													 .collect(Collectors.toList());
		System.out.println(employeeSalList);
					
		

	}

}
