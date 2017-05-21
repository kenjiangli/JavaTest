package Day09;

import java.util.ArrayList;
import java.util.Collections;

/*
 *  static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) 
 *    ʹ�ö�������������ָ���б��Ի��ָ������
 *    
 *     static void reverse(List<?> list) ��תָ���б���Ԫ�ص�˳�� 
          
   static void shuffle(List<?> list)  ʹ��Ĭ�����Դ��ָ���б�����û��� 
   
    
   <T extends Comparable<? super T>>
   			<T extends E>
   			Comparable<? super T>
   static <T extends Comparable<? super T>> void sort(List<T> list) 
          ����Ԫ�ص���Ȼ˳�� ��ָ���б������������ 
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
		
		//list:Ҫ��ѯ�ļ���
		//keyҪ��ѯ��Ԫ��
		int index=Collections.binarySearch(array, 13);
		
		//û�е�Ԫ��:-(�����)-1
		System.out.println(index);
		
		//��ת
		Collections.reverse(array);
		System.out.println(array);
		
		//����˳��
		Collections.shuffle(array);
		System.out.println(array);
		
		//����(��������)
		Collections.sort(array);
		System.out.println(array);
		
	}

}
































































































