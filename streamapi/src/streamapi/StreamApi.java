package streamapi;

import java.util.ArrayList;

public class StreamApi {
	
	
	
	
	

	public static void main(String[] args) {
		

		
		ArrayList<String> a=new ArrayList<>();
		
		a.add("Deepak");
		a.add("Chandrashekhar");
		a.add("Harbhajan");
		a.add("Raju");
		a.add("Pankaj");
		a.add("ka");
		
	//creating Stream from collection
		
		a.stream().forEach(System.out::println);
	
		
	//	Filter():-selecting with a predicate
		
	//	a.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);
		
		
  //distinct():-select only unique elements
		
	//	a.stream().distinct().forEach(System.out::println);
		
	//limit():-delect first n elements
		
	//	a.stream().limit(5).forEach(System.out::println);
		
	//skip():-skip first n number
		
		//a.stream().skip(3).forEach(System.out::println);
		
	//Sorted:-Sorting order(Ascending order)
		
		//sorting the name according to their lenght
		

//a.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);
         

//collect() : Returns mutable container
		
	//	List<String> first3name=a.stream().limit(3).collect(Collectors.toList());
		
	//	System.out.println(first3name);
		
	// anyMatch() : Any one element matches
	/*	if(a.stream().anyMatch((String name) -> name.lenght() == 5))
		{
			System.out.println("Yes ..There is a name with 5 letters");
		}*/
		
	//findFirst() : Finding first element
		
	//	Optinal<String>  firstElement= Stream.of("First", "Second", "Third", "Four", "fifth").findFirst();
		
//toArray() : Stream to array
		
	//	Object[] streamArray = a.stream().limit(3).toArray();
        
	//	System.out.println(Arrays.toString(streamArray));
		
		
	/*	
		a.stream()
        .filter(name -> name.length() > 5)
        .peek(e -> System.out.println("Filtered Name :"+e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped Name :"+e))
        .toArray();
	*/
		
	//for upper case	

		 
  //   a.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
		//decending order
		
 //    a.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		
		
		
	}

}

}
