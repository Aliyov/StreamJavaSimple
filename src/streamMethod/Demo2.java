package streamMethod;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
public class Demo2 {
	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		/*
		List<Integer> evenNumbers = numbersList.stream().filter(n->n%2==0)
											   .collect(Collectors.toList());
		long numberOfEven = evenNumbers.stream().count();
		System.out.println(numberOfEven);
		*/
		
		long numberOfEven = numbersList.stream().filter(n->n%2==0).count();
		System.out.println(numberOfEven);
		
		//min()
		
		Optional <Integer> min = numbersList.stream().min((val1,val2)->{
								 return val1.compareTo(val2);
								 });
		System.out.println(min.get());
		
		//max()
		
		Optional <Integer> max = numbersList.stream().max((val1,val2)->{
								 return val1.compareTo(val2);
								 });
		
		System.out.println(max.get());
		
		
		
		
	}

}
