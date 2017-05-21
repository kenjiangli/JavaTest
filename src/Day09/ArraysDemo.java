package Day09;

import java.util.Arrays;
import java.util.List;

/*
 * Arrays类
 * 
 * static<T> List<T> asList(T... a)返回一个受指定数组支持的固定大小的列表
 * static int binarySearch(int[] a,int key)使用二分搜索法来搜索指定 int类型,以获得指定的值
 * static void sort(int[] a) 对指定数组内容的字符表示形式
 * static String toString(int[] a)返回执行数组内容的字符串表示形式
 * 
 */
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr={1,9,4,3,6,8,10,7};
		
		
		//排序
		Arrays.sort(arr);
		//转字符串
		System.out.println(Arrays.toString(arr));
		
		//二分查找
		int i=Arrays.binarySearch(arr, 10);
		System.out.println(i);
		
		/*
		 * static <T> List<T> asList(T... a)
		 * 参数:T... a:表示可以传入任意类型,多个只能是同一个类型
		 * 返回值:ist<T>
		 * 数组转集合,可变参数的本质是数组
		 */
		
		
										//( T... a)							
		List<Integer> array=Arrays.asList(33,44,11,55);
		System.out.println(array.getClass());
		
	}

}














































































































































