package streamMethod2;

import java.util.Set;
import java.util.*;

//anyMatch()
//allMatch()
//noneMatch()
public class Demo2 {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("One apple");
		fruits.add("One mango");
		fruits.add("Two apples");
		fruits.add("More graped");
		fruits.add("Two guavas");
		
		//anyMatch
		boolean result = fruits.stream().anyMatch(value-> {return value.startsWith("One");});
		System.out.println(result);//true
		 
		//allMatch
		boolean result2 = fruits.stream().allMatch(value-> {return value.startsWith("One");});
		System.out.println(result2);//false
		
		//noneMatch
		boolean result3 = fruits.stream().noneMatch(value-> {return value.startsWith("One");});
		System.out.println(result3);//false 
	}

}
