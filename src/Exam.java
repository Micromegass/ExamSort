
import java.util.*; 


class Student implements Comparable<Student>  {
	
	String firstName; 
	String lastName; 
	int points; 
	
	
	public Student(String firstName, String lastName, int points) {
		
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.points = points; 
				
	}


	@Override
	public int compareTo(Student s) {
	
		if (this.points == s.points) {
			return 0; 
		} else if (this.points < s.points) {
			return 1; 
		} else {
			return -1; 
		}
	}
}

public class Exam {

	List<Student> studentlist = new ArrayList<Student>();
	
	public void addStudent (Student s) {
		studentlist.add(s);
	}
	
	
	public void printStudents() {
		
		for (Student s : studentlist) {
			System.out.print(s.firstName + " ");
			System.out.print(s.lastName + " ");
			System.out.println(s.points + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Exam e = new Exam(); 
		Student a = new Student("Booby", "Bob", 70); 
		e.addStudent(a); 
		e.addStudent(new Student("Karl", "Goku", 100));		
		Collections.sort(e.studentlist);
		e.printStudents(); 
		
		

	 Collections.sort(e.studentlist, new Comparator<Student>() {
		 @Override
		 public int compare(Student s1, Student s2) {
		 return s1.lastName.compareTo(s2.lastName);
		 }
	 
	  });
			
   }
	
}



