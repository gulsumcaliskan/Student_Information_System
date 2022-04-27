public class Teacher {
	
	String name;
	String mnpo;
	String branch;
	
	// contsructor method
	Teacher(String name, String mnpo, String branch){
		this.name = name; 
		this.mnpo = mnpo;
		this.branch = branch;
	}
	
	void print(){
		System.out.println("Name and Surname: " + this.name);
		System.out.println("Telephone: " + this.mnpo);
		System.out.println("Branch: " + this.branch);
	}

}
