package Day05;

/*
 *����/ͬ��
 *
 *�쳣:�����������
 *
 *java�е��쳣:
 *throwable:��jaca���������д�����쳣�ĳ���/����
 *	Error:��������
 *	Exception:�쳣
 * 	RuntimeException:����ʱ���ܻᷢ�����쳣
 * 
 * �쳣�����ִ���ʽ
 * 1.try....catch...finally
 * 2.throws
 * 
 * 
 * try..catch...finally��ʽ
 * 		try{
 * 		//���ܻ��������Ĵ���
 * 		} catch (�쳣���� ������) {
 * 			//�����쳣�Ĵ���
 * 
 *         }finally{
 *         //һ����ִ�е�,һ���������ͷ���Դ
 *         
 *         }
 *  
 *  ��:
 *  try{
 * 		//���ܻ��������Ĵ���
 * 		} catch (�쳣���� ������) {
 * 			//�����쳣�Ĵ���
 * 
 *         }
 *  	       
 *  tryд�ڷ�����;
 *  try�еĴ��뾡������
 *  try�����쳣��,��������ִ��
 *  try����Ĵ���һ�������������catch,�������߳��������Ĵ���
 *         
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		
		try{
		int re=divide(a,b);//try����Ĵ���һ�������������catch,�������߳��������Ĵ���
		System.out.println(re);
		}catch(ArithmeticException e){
			System.out.println("�������");
		}
		System.out.println("�������");
	}

	private static int divide(int a, int b) {
		// TODO Auto-generated method stub
		int c=a/b;
		System.out.println(c);
		return c;
	}

}















































