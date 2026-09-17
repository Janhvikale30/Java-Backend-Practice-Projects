package setOfSet_task5;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Company {

	public static void main(String[] args) {

		// IT Department
		Set<String> IT1 = new LinkedHashSet<String>();
		IT1.add("Amit");
		IT1.add("Rahul");
		IT1.add("Sneha");

		// HR Department
		Set<String> HR1 = new LinkedHashSet<String>();
		HR1.add("Priya");
		HR1.add("Neha");

		// Sales Department
		Set<String> Sales1 = new LinkedHashSet<String>();
		Sales1.add("Rohit");
		Sales1.add("Kiran");
		Sales1.add("Pooja");

		// IT
		Set<Set<String>> IT = new LinkedHashSet<Set<String>>();
		IT.add(IT1);

		// HR
		Set<Set<String>> HR = new LinkedHashSet<Set<String>>();
		HR.add(HR1);

		// Sales
		Set<Set<String>> Sales = new LinkedHashSet<Set<String>>();
		Sales.add(Sales1);

		// Company
		Set<Set<Set<String>>> Company = new LinkedHashSet<Set<Set<String>>>();

		Company.add(IT);
		Company.add(HR);
		Company.add(Sales);

		// Print all employees from the Company using Stream API.

		Company.stream().flatMap(Set::stream).flatMap(Set::stream).forEach(c -> System.out.println(c));

		// Print employees whose names start with "A"

		Company.stream().flatMap(Set::stream).flatMap(Set::stream).filter(s -> s.startsWith("A"))
				.forEach(e -> System.out.println(e));

		// Print employees whose names end with "a"

		Company.stream().flatMap(Set::stream).flatMap(Set::stream).filter(s -> s.endsWith("a"))
				.forEach(System.out::println);

		// Count the total number of employees

		Long c = Company.stream().flatMap(Set::stream).flatMap(Set::stream).count();
		System.out.println(c);

		// Print all employee names in alphabetical order

		List<String> l = Company.stream().flatMap(Set::stream).flatMap(Set::stream).sorted().toList();
		System.out.println(l);

		// Print employees whose names have exactly 5 characters

		Company.stream().flatMap(Set::stream).flatMap(Set::stream).filter(s -> s.length() == 5)
				.forEach(System.out::println);

		// Check whether "Rohit" exists

		boolean b = Company.stream().flatMap(Set::stream).flatMap(Set::stream)
				.anyMatch(s -> s.equalsIgnoreCase("Rohit"));
		System.out.println(b);

		// Count employees whose names contain the letter "i"

		long c1 = Company.stream().flatMap(Set::stream).flatMap(Set::stream).filter(s -> s.contains("i")).count();
		System.out.println(c1);
		
		//Check whether all employees have names with at least 4 characters

		boolean b1 = Company.stream().flatMap(Set::stream).flatMap(Set::stream).allMatch(a->a.length()>=4);
		System.out.println(b1);
		
		//Find the first employee whose name starts with "P"
		
		String s = Company.stream().flatMap(Set::stream).flatMap(Set::stream).filter(d->d.startsWith("P")).findFirst().orElse(null);
		
		System.out.println(s);
	}
}