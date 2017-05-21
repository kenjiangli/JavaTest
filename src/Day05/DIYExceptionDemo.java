package Day05;
/*
 * 如何自定义异常
 * 		1.定义一个类
 * 		2.继承Exception就是编译时异常,继承RuntimeException
 * 				建议使用Exception
 * 		
 * 		3.写构造方法,有参和无参
 */
public class DIYExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//编译时异常,代码提示去处理异常
			try {
				regist(17);
			} catch (U18Exception e) {
				// TODO Auto-generated catch block
				System.out.println("年龄未满18");
				e.printStackTrace();
			}
	}
	//年龄必须大于18,如果小于18,自己定义一个异常
	private static void regist(int age) throws U18Exception {
		// TODO Auto-generated method stub
		if(age<18){
			throw new U18Exception("年龄未满18");
		}
	}

}

class U18Exception extends Exception{

	public U18Exception() {
		super();
		// TODO Auto-generated constructor stub
	}

	public U18Exception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}





































