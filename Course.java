
public class Course {
	
	Teacher teacher; //ref �retildi.
	String name;
	String code;
	String prefix;
	int note;
	int sozluNote;
	
	Course(String name, String code, String prefix){
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
		int sozluNote = 0;

	}
	
	void addTeacher(Teacher teacher){
		if (teacher.branch.equals(this.prefix)){
			this.teacher = teacher;
			//printTeacher();
		}else {
			System.out.println("��retmen ve ders b�l�mleri uyu�muyor.");
		}
		this.teacher = teacher;
	}
	
	void printTeacher(){
		this.teacher.print();
	}

}
