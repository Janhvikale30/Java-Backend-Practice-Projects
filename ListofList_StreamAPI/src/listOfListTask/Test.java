package listOfListTask;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		
		List<String> Maharashtra = new ArrayList<String>();
		Maharashtra.add("Pune");
		Maharashtra.add("Mumbai");
		
		List<String> MadhyaPradesh = new ArrayList<String>();
		MadhyaPradesh.add("Bhopal");
		MadhyaPradesh.add("Indore");
		
		List<String> State1 = new ArrayList<String>();
		State1.add("City1");
		State1.add("City2");
		
		List<String> State2 = new ArrayList<String>();
		State2.add("City3");
		State2.add("City4");
		
		List<List<String>> India = new ArrayList <List<String>>();
		India.add(Maharashtra);
		India.add(MadhyaPradesh);
		
		List<List<String>> Japan = new ArrayList<List<String>>();
		Japan.add(State1);
		Japan.add(State2);
		
		List<List<List<String>>> World = new ArrayList<List<List<String>>>();
		World.add(India);
		World.add(Japan);
		
		//Print all cities using Stream API
		
		World.stream().flatMap(List::stream).flatMap(List::stream).forEach(System.out::println);
		
		//Create one List<String> containing all cities
		
		List<String> l = World.stream().flatMap(List::stream).flatMap(List::stream).toList();
		System.out.println(l);
		
		//Find cities starting with "P"
		
		List<String> li = World.stream().flatMap(List::stream).flatMap(List::stream).filter(s->s.startsWith("P")).toList();
		System.out.println(li);
		
		//Find cities whose name length is greater than 5
		
		List<String> lis = World.stream().flatMap(List::stream).flatMap(List::stream).filter(s->s.length()>5).toList();
		System.out.println(lis);
		
		//Count total number of cities
		
		Long c = World.stream().flatMap(List::stream).flatMap(List::stream).count();
		System.out.println(c);
		
		//Find cities starting with "C"
		
		List<String> list = World.stream().flatMap(List::stream).flatMap(List::stream).filter(s->s.startsWith("C")).toList();
		System.out.println(list);
		
		//Sort all cities alphabetically
		
		List<String> list1 = World.stream().flatMap(List::stream).flatMap(List::stream).sorted().toList();
		System.out.println(list1);
		
		//Convert all city names to uppercase
		
		List<String> list2 = World.stream().flatMap(List::stream).flatMap(List::stream).map(String::toUpperCase).toList();
		System.out.println(list2);
		
		//Check whether "Pune" exists
		
		boolean list3 = World.stream().flatMap(List::stream).flatMap(List::stream).anyMatch(c1->c1.equals("Pune"));
		System.out.println(list3);
		
		//Find the longest city name
		
		Optional<String> op = World.stream().flatMap(List::stream).flatMap(List::stream).max((a,b)->Integer.compare(a.length(), b.length()));
		System.out.println(op.orElse(null));
	}

}
