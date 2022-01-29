
public class Student {
	
	Course c1;
	Course c2;
	Course c3;
	String name;
	String stuNo;
	String classes;
	double avarage;
	boolean isPass;
	
	Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.avarage = 0.0;
		this.isPass = false;
	}
	
	void  addBulkExamNote (int note1, int note2, int note3, int sozluNote1, int sozluNote2, int sozluNote3){
		if (note1 >= 0 && note1 <= 100 && sozluNote1 >= 0 && sozluNote1 <= 100){
			this.c1.note = note1; //dýþardan alýnan nota eþit.
			this.c1.sozluNote = sozluNote1;
		} // varsayýlan deðer 0 olarak zaten verildi.
		if (note2 >= 0 && note2 <= 100 && sozluNote2 >= 0 && sozluNote2 <= 100){
			this.c2.note = note2;
			this.c2.sozluNote = sozluNote2;
		}
		if (note3 >= 0 && note3 <= 100 && sozluNote3 >= 0 && sozluNote3 <= 100){
			this.c3.note = note3;
			this.c3.sozluNote = sozluNote3;
		}
	}// note deðerlerine girdi saðlanýyor. 
	
	void isPass(){
		System.out.println("*****************");
		this.avarage = ((this.c1.note + this.c2.note + this.c3.note) * 0.8 + (this.c1.sozluNote + this.c2.sozluNote + this.c3.sozluNote * 0.2) / 3.0);
		if (this.avarage > 55){
			System.out.println("Geçtiniz!!!");
			this.isPass = true;
		} else {
			System.out.println("Sýnýfta Kaldýnýz!!!!!!!!");
			this.isPass = false;
		}
		printNote();
	}
	
	void printNote(){
		System.out.println(this.c1.name + " Note\t:" + this.c1.note + "\t" + this.c1.name + "Sözlü Notu\t:" + this.c1.sozluNote);
		System.out.println(this.c2.name + " Note\t:" + this.c2.note + "\t" + this.c2.name + "Sözlü Notu\t:" + this.c2.sozluNote);
		System.out.println(this.c3.name + " Note\t:" + this.c3.note + "\t" + this.c3.name + "Sözlü Notu\t:" + this.c3.sozluNote);
		System.out.println("Genel Ortalamanýz: " + this.avarage + "\t" + "Sözlü Ortalamanýz: " + ((this.c1.sozluNote + this.c2.sozluNote + this.c3.sozluNote) / 3.0) + "\t" + "Not Ortalamanýz: " + (this.c1.note + this.c2.note + this.c3.note) / 3.0);
	}
	

}
