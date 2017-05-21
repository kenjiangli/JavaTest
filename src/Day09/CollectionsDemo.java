package Day09;

import java.util.ArrayList;
import java.util.Collections;

/*
 *  static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) 
 *    使用二分搜索法搜索指定列表，以获得指定对象
 *    
 *     static void reverse(List<?> list) 反转指定列表中元素的顺序。 
          
   static void shuffle(List<?> list)  使用默认随机源对指定列表进行置换。 
   
    
   <T extends Comparable<? super T>>
   			<T extends E>
   			Comparable<? super T>
   static <T extends Comparable<? super T>> void sort(List<T> list) 
          根据元素的自然顺序 对指定列表按升序进行排序。 
 */
public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(11);
		array.add(21);
		array.add(12);
		array.add(14);
		array.add(15);
		
		//list:要查询的集合
		//key要查询的元素
		int index=Collections.binarySearch(array, 13);
		
		//没有的元素:-(插入点)-1
		System.out.println(index);
		
		//反转
		Collections.reverse(array);
		System.out.println(array);
		
		//打乱顺序
		Collections.shuffle(array);
		System.out.println(array);
		
		//排序(升序排序)
		Collections.sort(array);
		System.out.println(array);
		
	}

}
































































































