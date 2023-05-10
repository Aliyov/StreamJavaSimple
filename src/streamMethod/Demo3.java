package streamMethod;

import java.util.Arrays;
import java.util.*;
//reduce
public class Demo3 {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("A","B","C","1","2","3");
		Optional <String>reduced = stringList.stream().reduce((value,combinedvalue)->{
			
							return combinedvalue+value;
							
							});
		
		System.out.println(reduced.get());
		
		

	}

}
