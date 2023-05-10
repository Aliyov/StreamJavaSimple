package mapDemos;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
public class MapDemo3 {

	public static void main(String[] args) {
		
		List<Integer> numbersList = Arrays.asList(2,3,4,5);
		List<Integer> multipliedList = new ArrayList<>();
		multipliedList = numbersList.stream().map(n->n*3).collect(Collectors.toList()); 
		System.out.println(multipliedList);
		

	}

}
