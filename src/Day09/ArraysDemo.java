package Day09;

import java.util.Arrays;
import java.util.List;

/*
 * Arrays��
 * 
 * static<T> List<T> asList(T... a)����һ����ָ������֧�ֵĹ̶���С���б�
 * static int binarySearch(int[] a,int key)ʹ�ö���������������ָ�� int����,�Ի��ָ����ֵ
 * static void sort(int[] a) ��ָ���������ݵ��ַ���ʾ��ʽ
 * static String toString(int[] a)����ִ���������ݵ��ַ�����ʾ��ʽ
 * 
 */
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr={1,9,4,3,6,8,10,7};
		
		
		//����
		Arrays.sort(arr);
		//ת�ַ���
		System.out.println(Arrays.toString(arr));
		
		//���ֲ���
		int i=Arrays.binarySearch(arr, 10);
		System.out.println(i);
		
		/*
		 * static <T> List<T> asList(T... a)
		 * ����:T... a:��ʾ���Դ�����������,���ֻ����ͬһ������
		 * ����ֵ:ist<T>
		 * ����ת����,�ɱ�����ı���������
		 */
		
		
										//( T... a)							
		List<Integer> array=Arrays.asList(33,44,11,55);
		System.out.println(array.getClass());
		
	}

}














































































































































