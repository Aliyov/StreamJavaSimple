package streamMethod2;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

//sorted
public class Demo1 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);
		List<Integer> sortedlist = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist);//ascending order
		
		List<Integer> sortedlistreverse = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedlistreverse);//descending order
		
		List<String> list2 = Arrays.asList("John", "Marry","David","Bob");
		List<String> sortedlist2 = list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist2);//alphabetical sort
		
		List<String> sortedlist2reverse = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedlist2reverse);//reverse alphabetical sort
	}

}
