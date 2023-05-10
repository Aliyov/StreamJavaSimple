package mapDemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class MapDemo2 {

	public static void main(String[] args) {
		
		List <String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
		List <Integer> vehiclesLenght = new ArrayList<>();	
		vehicles.stream().map(word->word.length()).forEach(word->System.out.println(word));;
		
	}

}
