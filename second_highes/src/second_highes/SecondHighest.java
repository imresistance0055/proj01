package second_highes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighest {

	public static void main(String[] args) {
		
		
		List<Employee> list=new ArrayList<>();
		
		
		
		list.add(new Employee(1,"Deepak",109821));
		list.add(new Employee(2,"Deepa",10921));
		list.add(new Employee(3,"Dek",10901));
		list.add(new Employee(4,"rahul",10982123));
		list.add(new Employee(5,"Degkk",10821));

		
		
	Object salary = list.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst();

	System.out.println(((Optional<Integer>) salary).get());
	
}
}