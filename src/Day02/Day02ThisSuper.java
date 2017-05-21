package Day02;
/*
 * this.成员变量 ->访问的是本类的成员变量
 * super.成员变量 ->访问的是父类的成员变量
 * 
 * this.方法名 ()->调用的本类的方法
 * super.方法名()->调用的是父类的方法
 * 
 * 总结:this. 调用的是本类的成员
 * 		super. 调用的是父类的成员
 */

public class Day02ThisSuper {
public static void main(String[] args) {
	Chinese c=new Chinese();
	c.test();
}
}
/*
 * 一个成员变量有三种初始化
 * 默认初始化
 * 显示初始化,在定义的时候直接用=赋值
 * 构造方法初始化
 * 
 * 父类也称为超类
*/
class Person5{
	String address="地图";
	public void eat(){
		System.out.println("地球人吃饭");
	}
}

class Chinese extends Person5{
	String address="中国";//赋值初始化
	
	@Override
	public void eat(){
		System.out.println("中国人用筷子吃饭");
	}
	
	//测试test和suoer
	public void test(){
		String address="广州";
		System.out.println(address);
		System.out.println(this.address);
		System.out.println(super.address);
		
		eat();//子类的方法
		this.eat();//子类的方法
		super.eat();
	}
}












































