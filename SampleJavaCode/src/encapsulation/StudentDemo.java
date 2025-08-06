package encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student();
		
		s.setSid(101);
		s.setSname("leelaa");
		s.setAvg(22.78f);
		
		System.out.println(s);
		
        Student s1=new Student();
		
		s1.setSid(101);
		s1.setSname("leelaa");
		s1.setAvg(22.78f);
		
		System.out.println(s1);

	}

}
