package Day14;

/*
 * ����ָ�������еĳ¹�,ȷ�е���˵,��һ����������ڴ�����,�����һ��
 * ����,�����Ǵ������й����еĳ���,���Ҿ���һ����������
 * 
 * �������еĳ�����ܳ�Ϊ����
 * 
 * �߳��ǽ��̵�һ��ִ�е�Ԫ,�����еĴ��붼���ɶ��߳���ִ�е�
 * 
 * һ������������һ���߳�,һ���������ж���߳�,�������Ҳ���Գ�Ϊ���̳߳���
 * 
 *	һ����������һ�����߳�
 *
 * һ���߳�������Ļ�,ֻ��һ��һ��������,һ������û������Ͳ�������һ������
 *
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		sellBaoZi();
		sellShaoBing();
		sellYouTiao();
	}
	
	public static void sellYouTiao() {
		String s = "";
		for (int i = 0; i < 20000; i++) {
			s += i;
		}
		System.out.println("����һ������");
	}
	
	public static void sellShaoBing() {
		String s = "";
		for (int i = 0; i < 20000; i++) {
			s += i;
		}
		System.out.println("����һ���ձ�");
	}
	
	public static void sellBaoZi() {
		String s = "";
		for (int i = 0; i < 20000; i++) {
			s += i;
		}
		System.out.println("����һ������");
	}

}




















































































