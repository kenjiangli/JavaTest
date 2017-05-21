package Day06;
/*
 * Math提供额外的计算功能,没有构造方法,里面的犯法都是静态方法直接类名,方法名就可以
 * 调用,不需要创建对象
 */
public class DemoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		
		//abs绝对值
		System.out.println(Math.abs(5));
		System.out.println(Math.abs(-5));
		
		//ceil向上取整
		System.out.println(Math.ceil(1.01));
		System.out.println(Math.ceil(1.91));
		System.out.println(Math.ceil(-1.01));
		System.out.println(Math.ceil(-1.91));
		
		//floor向下取整
		System.out.println(Math.floor(1.01));
		System.out.println(Math.floor(1.91));
		System.out.println(Math.floor(-1.01));
		System.out.println(Math.floor(-1.91));
		
		//round四舍五入
		System.out.println(Math.round(1.499));
		System.out.println(Math.round(1.501));
		
		//取最大值
		System.out.println(Math.max(1, 2));
		System.out.println(Math.max(-1, -2));
	}

}




















