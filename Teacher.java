
public class Teacher {
	
	String name;
	String mnpo;
	String branch;
	
	// contsructor method
	Teacher(String name, String mnpo, String branch){
		this.name = name; // parametre olarak al�nd�
		this.mnpo = mnpo;
		this.branch = branch;
	}
	
	void print(){
		System.out.println("Ad�: " + this.name);
		System.out.println("Telefonu: " + this.mnpo);
		System.out.println("B�l�m: " + this.branch);
	}

}
