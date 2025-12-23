package JDK_1_8_Features.parallelStreams;

import java.util.ArrayList;
import java.util.List;

class Student {
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}
}

public class ParallelStreamsDemo {
	
public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Akshay",90));
		studentList.add(new Student("Amol",91));
		studentList.add(new Student("Suraj",92));
		studentList.add(new Student("Kiran",79));
		studentList.add(new Student("Tushar",85));
		studentList.add(new Student("Abhijit",72));
		studentList.add(new Student("Rohini",88));
		studentList.add(new Student("Priyanka",77));
		studentList.add(new Student("Urmila",88));
		studentList.add(new Student("Sachin",95));
		
		//Using normal Stream.

		
		studentList.stream().filter(stu->stu.score>80)
		.limit(5)
		.forEach(stu->System.out.println("Name:"+stu.getName()+"&"+"Score:"+stu.getScore()));
		
		System.out.println("-----------------------------------------");
		
		
		//Using parallel Stream
		studentList.parallelStream().filter(stu->stu.score>80).limit(5).forEach(stu->System.out.println("Name:"+stu.getName()+"&"+"Score:"+stu.getScore()));
		
		System.out.println("-----------------------------------------");

		//Convert Stream into parallel Stream
		studentList.stream().parallel().filter(stu->stu.score>80).limit(5).forEach(stu->System.out.println("Name:"+stu.getName()+"&"+"Score:"+stu.getScore()));

	}

}
