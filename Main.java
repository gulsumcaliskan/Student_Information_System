public class Main {
	public static void main(String[] args){
		
		Course tran = new Course("Transfiguration", "TRAN101", "TRAN");
		Course dada = new Course("Defence Against the Dark Arts", "DADA101", "DADA");
		Course pot = new Course("Potions", "POT101", "POT");
		
		tran.addTeacher(t1);
		dada.addTeacher(t1);
		pot.addTeacher(t1);

		Teacher t1 = new Teacher("Minerva McGonagall", "0123451", "TRAN");
		Teacher t2 = new Teacher("Remus Lupin", "0123452", "DADA");
		Teacher t3 = new Teacher("Severus Snape", "0123453", "POT");
		
//		t1.print();
//		t2.print();
//		t3.print();

		Student s1 = new Student("Harry Potter", "1234561", "4", tran, dada, pot);
		Student s2 = new Student("Hermione Granger", "1234562", "4", tran, dada, pot);
		Student s3 = new Student("Ronald Weasley", "1234563", "4", tran, dada, pot);
		
		s1.addBulkExamNote(100, 200, 50, 52, 46, 65);
//		s1.printNote();
		s1.isPass();
        
		s2.addBulkExamNote(100, 85, 90, 95, 100, 96);
		s2.isPass();
		s2.printNote();
		
		s3.addBulkExamNote(50, 30, 70, 45, 84, 65);
		s3.isPass();
		s3.printNote();
		
		/*
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
		
		*/
	}

}
