public class Course {
	
	Teacher teacher; 
	String name;
	String code;
	String prefix;
	int note;
	int perfNote;
	
	Course(String name, String code, String prefix){
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
		int perfNote = 0;

	}
	
	void addTeacher(Teacher teacher){
		if (teacher.branch.equals(this.prefix)){
			this.teacher = teacher;
			//printTeacher();
			System.out.println("The process is happened with successfully.");
		}else {
			System.out.println(teacher.name + " can't give this lecture!");
		}
		this.teacher = teacher;
	}
	
	void printTeacher(){
		this.teacher.print();
		/*
		if(teacher != null){
		      System.out.println("The instructor of the "  + this.name + " is: " + teacher.name);
		}else {
		      System.out.println("It is not assigned any instructor to the lecture of " + this.name);
    		}
		*/
		
	}

}
