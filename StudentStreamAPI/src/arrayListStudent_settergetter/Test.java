package arrayListStudent_settergetter;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(191);
		s1.setName("Yashi");
		s1.setGender("Female");

		Student s2 = new Student();
		s2.setId(192);
		s2.setName("Latika");
		s2.setGender("Female");

		Student s3 = new Student();
		s3.setId(193);
		s3.setName("Rishabh");
		s3.setGender("Male");

		Student s4 = new Student();
		s4.setId(194);
		s4.setName("Subham");
		s4.setGender("Male");

		Student s5 = new Student();
		s5.setId(195);
		s5.setName("Sakshi");
		s5.setGender("Female");

		Student s6 = new Student();
		s6.setId(196);
		s6.setName("Dhiraj");
		s6.setGender("Male");

		List<Student> l = List.of(s1, s2, s3, s4, s5, s6);

		// Display All Student Name

		l.stream().forEach(s -> System.out.println(s.getName()));

		// Display only Female Students

		l.stream().filter(s -> s.getGender().equals("Female")).forEach(st -> System.out.println(st.getName()));

		// Display only Male Student

		l.stream().filter(s -> s.getGender().equals("Male")).forEach(st -> System.out.println(st.getName()));

		// Find the student whose ID is greater than 193

		l.stream().filter(s -> s.getId() > 193).forEach(st -> System.out.println(st.getName()));

		// Count the number of Female students

		long c = l.stream().filter(s -> s.getGender().equals("Female")).count();
		System.out.println(c);

		// Create a list containing only student names

		List<String> st = l.stream().map(Student::getName).collect(Collectors.toList());
		System.out.println(st);

		// Sort students by their name and display their names

		List<String> s = l.stream().map(Student::getName).sorted().collect(Collectors.toList());
		System.out.println(s);
		
		//Find students whose name starts with S
		
		l.stream().filter(stu->stu.getName().startsWith("S")).forEach(st1->System.out.println(st1.getName()));
	}

}
