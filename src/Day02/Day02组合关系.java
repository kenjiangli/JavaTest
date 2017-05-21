package Day02;

public class Day02组合关系 {
public static void main(String[] args) {
	Pet pet=new Pet("二哈",20,10);
	Person person=new Person("kk",20,pet);
	person.show();
}
}
