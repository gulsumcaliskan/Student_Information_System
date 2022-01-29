
public class Main {
	public static void main(String[] args){
		Teacher t1 = new Teacher("Mahmut Hoca", "+90530", "TRH");
//		t1.print();
		Teacher t2 = new Teacher("Graham Hoca", "+90531", "FZK");
		Teacher t3 = new Teacher("Külyutmaz", "+90533", "BIYO");
		
		Course tarih = new Course("Tarih", "101", "TRH");
		tarih.addTeacher(t1);
		
		Course fizik = new Course("Fizik", "102", "FZK");
		fizik.addTeacher(t2);
		
		Course biyo = new Course("Biyoloji", "101", "BIYO");
		biyo.addTeacher(t3);
		
		Student s1 = new Student("Þaban", "123", "4", tarih, fizik, biyo);
		s1.addBulkExamNote(100, 200, 50, 52, 46, 65);
//		s1.printNote();
		s1.isPass();
		
		Student s2 = new Student ("Necmi", "124", "4", tarih, fizik, biyo);
		s2.addBulkExamNote(50, 30, 70, 45, 84, 65);
		s2.isPass();
		s2.printNote();
	}

}
