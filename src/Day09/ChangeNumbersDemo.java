package Day09;

/*	������2��int�����
	������3��int�����
	������4��int�����
	������5��int�����
	
	�ɱ����
		�����������ǿ��Ըı��,����������Ҫһ��
		
		���η� ����ֵ���� ������(��������...�β���){
		}
		
ע��:
  1.һ�����������ܴ��ڶ���ɱ����
  2.�ɱ������Ҫ���ڲ����б����
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
	
	//�ɱ����
	private static int sum(int ... a) {//�ɱ�����ı���������,a��������
		// TODO Auto-generated method stub
		int sum=0;
		
		//��ȡ�����е�Ԫ��
		for (int i : a) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String s,int ... a) {
		
	}
//	.һ�����������ܴ��ڶ���ɱ����
//	public static void main(String ... s,int ... a) {
//		
//	}
	//2.�ɱ������Ҫ���ڲ����б����	
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
