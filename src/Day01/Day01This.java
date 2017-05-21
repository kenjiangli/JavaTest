package Day01;

public class Day01This {
public static void main(String[] args) {
	
	Student s1=new Student("lee");
	System.out.println("调用前"+s1);
	s1.say();
	
	Student s2=new Student("kenjiang");
	System.out.println("调用前s2"+s2);
	s2.say();
}

}
