public class Main{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setName("Kamal");
		s1.setDit("IT2233");
		s1.setAddress("Colombo");
		
		Student s2 = new Student();
		s2.setName("Nimal");
		s2.setDit("IT4455");
		s2.setAddress("Negambo");
		
		Student s3 = new Student();
		s3.setName("Sunil");
		s3.setDit("IT8899");
		s3.setAddress("Badulla");

		System.out.println("Student name :" +s1.getName() + "\nStudent No : "+s1.getDit()+"\nAddress :" + s1.getAddress()+"\n");
		System.out.println("Student name :" +s2.getName() + "\nStudent No : "+s2.getDit()+"\nAddress :" + s2.getAddress()+"\n");
		System.out.println("Student name :" +s3.getName() + "\nStudent No : "+s3.getDit()+"\nAddress :" + s3.getAddress()+"\n");
		
		
	}

}
