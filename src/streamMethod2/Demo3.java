package streamMethod2;
import java.util.*;

//findAny()
//findFirst()

public class Demo3 {
	
	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("one","two","three","one");
		//findAny()
		Optional<String> ele = stringList.stream().findAny();
		System.out.println(ele.get());
		
		//findFirst
		Optional<String> ele2 = stringList.stream().findFirst();
		System.out.println(ele2.get());
	}

}
