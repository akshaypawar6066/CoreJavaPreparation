package CodePractice.Strings;

import java.util.stream.Collectors;

public class FindUniqueCharacretersUsingJvaStream {
	public static void main(String[] args) {
		String s="Programming";
		s=s.toLowerCase();
		
		s.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(c->c, Collectors.counting()))
		.entrySet()
		.stream().filter(e->e.getValue()==1)
		.forEach(e->System.out.println(e.getKey()+" "));
	
	
	}

}
