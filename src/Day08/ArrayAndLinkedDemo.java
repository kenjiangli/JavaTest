package Day08;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method01();
		method02();
	}
	
	/*
	 * 使用的是链表结构.Node<E>类作为链表的节点
	 * LinkedList特点:查询慢,增删快
	 * 
	 */
private static void method02() {
		// TODO Auto-generated method stub
		LinkedList<Integer> arr=new LinkedList<Integer>();
		arr.add(11);
		arr.add(22);
		arr.add(33);
		arr.add(44);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		
		arr.remove(1);
	for (Integer integer : arr) {
		System.out.println(integer+" ");
	}
}
	/*
 * ArrayList底层使用的是数组结构
 * 元素是存储在Object[] elementData;
 * 这个数组的长度是10个
 * 当元素不够,会将数组扩容,容量是原来的1.5倍
 * 扩容使用的是拷贝数组
 *   ArrayList的特点:查询快,增删慢.
 * 参考示例图
 */
	private static void method01() {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(11);
		arr.add(22);
		arr.add(33);
		arr.add(44);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		
		arr.remove(2);
		
		for (Integer integer : arr) {
			System.out.print(integer+" ");
		}
	}

}














































