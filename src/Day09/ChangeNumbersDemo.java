package Day09;

/*	需求定义2个int数求和
	需求定义3个int数求和
	需求定义4个int数求和
	需求定义5个int数求和
	
	可变参数
		参数的数量是可以改变的,但是类型是要一样
		
		修饰符 返回值类型 方法名(擦书类型...形参名){
		}
		
注意:
  1.一个方法不可能存在多个可变参数
  2.可变参数需要放在参数列表最后
 * 
 */
public class ChangeNumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum1=sum(1,2);
		System.out.println(sum1);
		int sum=sum(1,2,3);
		System.out.println(sum);
		int sum3=sum(1,2,3,4);
		System.out.println(sum3);
		int sum4=sum(1,2,3,4,5);
		System.out.println(sum4);
	}
	
	//可变参数
	private static int sum(int ... a) {//可变参数的本质是数组,a就是数组
		// TODO Auto-generated method stub
		int sum=0;
		
		//获取数组中的元素
		for (int i : a) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String s,int ... a) {
		
	}
//	.一个方法不可能存在多个可变参数
//	public static void main(String ... s,int ... a) {
//		
//	}
	//2.可变参数需要放在参数列表最后	
//	public static void main(int ... a,String s) {
//		
//	}
//	
	
	
	
	
	
//	public static int sum(int a, int b) {
//		return a + b;
//	}
//	
//	public static int sum(int a, int b, int c) {
//		return a + b + c;
//	}
//	
//	public static int sum(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}
//	
//	public static int sum(int a, int b, int c, int d, int e) {
//		return a + b + c + d + e;
//	}
}
