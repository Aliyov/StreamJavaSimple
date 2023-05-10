package filterDemo;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
public class FilterDemi2 {

	public static void main(String[] args) {
		
		//Issue names and filter them by lenght
		//*Lenght has to be larger than 6 less than 8
		
		List <String> names = Arrays.asList("Melisandra", "Ali", "Karimzade", "Aliyev",
				"Alizade","Ibrahimbeyli","Memisov","Kazimli","Davudsoy");
		List <String> longNames = new ArrayList<>();
		
		longNames = names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
		System.out.println(longNames);
		//names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
		
	}

}
