package Day07;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		
		//��ͨ����
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------");
		
		/*
		 * �߼�forѭ��(��ǿforѭ��)
		 * 
		 * ��ʽ:
		 * for(�������� ������:����/����){
		 * }
		 * 
		 * ��ǿfor�ص�:���õ�Ԫ�ظ�ֵ������i,������ȥͨ��������ȡԪ��
		 * ��ǿforѭ����ȱ��:����������û������
		 */
	
		for ( int i : arr) {//ֱ���õ�Ԫ�ظ�ֵ������
			System.out.println(i);
		}
	}

}
