package Day02;
/*
 * ��������,ͬһ������,������һ��,�����б�һ��,�뷵��ֵ�޹�
 * 
 * �̳к󷽷��ĵ����ص�,����û��,ʹ�ø����,�����о��ø����
 * 
 * ������д:���ඨ��һ���͸���һģһ���ķ���
 * 
 * ��д�ĺô�,�����������Ĺ��ܲ���ǿ��,�������������������Ĺ���
 * 
 * ����ȸ����ǿ��
 */
public class Day02Override {
public static void main(String[] args) {
	SmartPhone sp=new SmartPhone();
	sp.call();
	sp.callDisplay();
}
}
class Phone{
	public void call(){
		System.out.println("��绰");
	}
}
class SmartPhone extends Phone{
	@Override
	//@Override���԰��������Զ�����Ƿ��������д����,���������д����,�ᱨ��
	public void call(){
		System.out.println("��Ƶͨ��");
	}
	public void callDisplay(){
		System.out.println("��ʾ�������");
		System.out.println("��ʾ�����ͷ��");
	}
}