package Day07;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		
		//普通遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------");
		
		/*
		 * 高级for循环(增强for循环)
		 * 
		 * 格式:
		 * for(数据类型 变量名:数组/集合){
		 * }
		 * 
		 * 增强for特点:接拿到元素赋值给变量i,不用再去通过索引获取元素
		 * 增强for循环的缺点:遍历过程中没有索引
		 */
	
		for ( int i : arr) {//直接拿到元素赋值给变量
			System.out.println(i);
		}
	}

}
