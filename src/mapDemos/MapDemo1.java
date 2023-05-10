package mapDemos;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
public class MapDemo1 {

	public static void main(String[] args) {
		
		List <String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
		
		List <String> vehicleUpperCase = new ArrayList<>();
		
		//Streams mapping
		
		vehicleUpperCase = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehicles);
		System.out.println(vehicleUpperCase);
	}

}
