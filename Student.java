public class Student {
	
	Course tran;
	Course dada;
	Course pot;
	String name;
	String stuNo;
	String classes;
	double average;
	boolean isPass;
	
	Student(String name, String stuNo, String classes, Course tran, Course dada, Course pot){
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.tran = tran;
		this.dada = dada;
		this.pot = pot;
		this.average = 0.0;
		this.isPass = false;
	}
	
	void  addBulkExamNote (int note1, int note2, int note3, int perfNote1, int perfNote2, int perfNote3){
		if (note1 >= 0 && note1 <= 100 && perfNote1 >= 0 && perfNote1 <= 100){
			this.tran.note = note1; 
			this.tran.perfNote = perfNote1;
		} 
		if (note2 >= 0 && note2 <= 100 && perfNote2 >= 0 && perfNote2 <= 100){
			this.dada.note = note2;
			this.dada.perfNote = perfNote2;
		}
		if (note3 >= 0 && note3 <= 100 && perfNote3 >= 0 && perfNote3 <= 100){
			this.pot.note = note3;
			this.pot.perfNote = perfNote3;
		}
	} 
	
	void isPass(){
		System.out.println("*****************");
		this.average = ((this.tran.note + this.dada.note + this.pot.note) * 0.8 + (this.tran.perfNote + this.dada.perfNote + this.pot.perfNote * 0.2) / 3.0);
		if (this.average > 55){
			System.out.println("You passed!!!");
			this.isPass = true;
		} else {
			System.out.println("You failed!!!!!!!!");
			this.isPass = false;
		}
		printNote();
	}
	
	void printNote(){
		System.out.println(this.tran.name + " Note\t:" + this.tran.note + "\t" + this.tran.name + "Performance Note\t:" + this.tran.perfNote);
		System.out.println(this.dada.name + " Note\t:" + this.dada.note + "\t" + this.dada.name + "Performance Note\t:" + this.dada.perfNote);
		System.out.println(this.pot.name + " Note\t:" + this.pot.note + "\t" + this.pot.name + "Performance Note\t:" + this.pot.perfNote);
		System.out.println("General Average: " + this.average + "\t" + "General Average of Performance Note: " + ((this.tran.perfNote + this.dada.perfNote + this.pot.perfNote) / 3.0) + "\t" + "Note Average: " + (this.tran.note + this.dada.note + this.pot.note) / 3.0);
	}
	

}
