package Day05;
/*
 * ����Զ����쳣
 * 		1.����һ����
 * 		2.�̳�Exception���Ǳ���ʱ�쳣,�̳�RuntimeException
 * 				����ʹ��Exception
 * 		
 * 		3.д���췽��,�вκ��޲�
 */
public class DIYExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//����ʱ�쳣,������ʾȥ�����쳣
			try {
				regist(17);
			} catch (U18Exception e) {
				// TODO Auto-generated catch block
				System.out.println("����δ��18");
				e.printStackTrace();
			}
	}
	//����������18,���С��18,�Լ�����һ���쳣
	private static void regist(int age) throws U18Exception {
		// TODO Auto-generated method stub
		if(age<18){
			throw new U18Exception("����δ��18");
		}
	}

}

class U18Exception extends Exception{

	public U18Exception() {
		super();
		// TODO Auto-generated constructor stub
	}

	public U18Exception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}





































