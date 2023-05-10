package streamMethod;
import java.util.*;
import java.util.stream.Collectors;

//distinct() 
//count() 
//limit()
public class Demo1 {

	public static void main(String[] args) {
		
		List<String> vehicle = Arrays.asList("Car","Bus", "Car","Bcycle","Bike","Bus");
		//distinct()
		
		//List<String> distinctVehicle = vehicle.stream().distinct().collect(Collectors.toList());
		//System.out.println(distinctVehicle);
		vehicle.stream().distinct().forEach(System.out::println);
		
		//count()
	    long count = vehicle.stream().distinct().count();
	    System.out.println(count);
	    
	    //limit()
	    vehicle.stream().limit(3).forEach(System.out::println);
	}

}
