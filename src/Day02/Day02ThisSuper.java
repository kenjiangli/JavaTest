package Day02;
/*
 * this.��Ա���� ->���ʵ��Ǳ���ĳ�Ա����
 * super.��Ա���� ->���ʵ��Ǹ���ĳ�Ա����
 * 
 * this.������ ()->���õı���ķ���
 * super.������()->���õ��Ǹ���ķ���
 * 
 * �ܽ�:this. ���õ��Ǳ���ĳ�Ա
 * 		super. ���õ��Ǹ���ĳ�Ա
 */

public class Day02ThisSuper {
public static void main(String[] args) {
	Chinese c=new Chinese();
	c.test();
}
}
/*
 * һ����Ա���������ֳ�ʼ��
 * Ĭ�ϳ�ʼ��
 * ��ʾ��ʼ��,�ڶ����ʱ��ֱ����=��ֵ
 * ���췽����ʼ��
 * 
 * ����Ҳ��Ϊ����
*/
class Person5{
	String address="��ͼ";
	public void eat(){
		System.out.println("�����˳Է�");
	}
}

class Chinese extends Person5{
	String address="�й�";//��ֵ��ʼ��
	
	@Override
	public void eat(){
		System.out.println("�й����ÿ��ӳԷ�");
	}
	
	//����test��suoer
	public void test(){
		String address="����";
		System.out.println(address);
		System.out.println(this.address);
		System.out.println(super.address);
		
		eat();//����ķ���
		this.eat();//����ķ���
		super.eat();
	}
}












































