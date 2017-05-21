package Day05;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method01();
		//method02();
		method03();
	}
	
	//可以处理异常的父类,但是不会知道哪里出了问题
	private static void method03() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int[] arr = {1, 2, 3, 4, 5};
		
		/*
		 * try{
		 
			int re=a/b;
				System.out.println(re);
				System.out.println(arr[20]);
		    }
		    */
		
	}
	
	
	//try...catch..catch 一个try里面放多个异常,catch越具体越好--常用
	private static void method02() {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int[] arr={1,2,3,4,5};
		try {
			int re=a/b;	// try里面的代码一旦出现问题就走catch,不会再走后面的代码
			System.out.println(re);
			System.out.println(arr[20]);
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组索引越界异常");
		}
	}

	//try..catch一个一个异常处理
	private static void method01() {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try{
			int re=a/b;
			System.out.println(re);
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}
		
		int[] arr={1,2,3,4,5};
		try{
			System.out.println(arr[20]);
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("数组索引越界异常");
		}
		System.out.println("end");
	}
}
