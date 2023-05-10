package filterDemo;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		//We have collections and collection have some NULL values
		//After removing NULL collect them
		
		List<String> words = Arrays.asList("Cup",null,"Forest","Sky","Book",null,"Theatre");
		List<String> result = new ArrayList<>();
		System.out.println(words);
		
		//Adding collection to new Collection after filter
		//result = words.stream().filter(w->w!=null).collect(Collectors.toList());
		//System.out.println(result);
		
		//Print after filtering
		words.stream().filter(w->w!=null).forEach(System.out::println);
		
		
	}

}
