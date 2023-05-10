package FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		
		List<String> teamA = Arrays.asList("Scoot","David","John");
		List<String> teamB = Arrays.asList("Mary","Luna","Tom");
		List<String> teamC = Arrays.asList("Ken","Jony","Kitty");
		
		List<List<String>> allTeam = new ArrayList<>();
		allTeam.add(teamA);
		allTeam.add(teamB);
		allTeam.add(teamC);
		
		List<String> names = allTeam.stream().flatMap(plist->plist.stream()).collect(Collectors.toList());
		System.out.println(names);
		
	}

}
