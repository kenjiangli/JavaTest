package Day05;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * �쳣�ĺô�
 * 
 * ����Щ�������ʹ�õ��쳣
 * 	1.IO��
 * 	2.���ݿ����
 * 	3.xml����
 * 	4.����
 * 	5.�Լ������쳣
 * 	6.������Ŀ...�û���Ϣ�쳣,ת���쳣,��¼�쳣
 * 
 * 
 */
public class ExceptionBenefitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����ʱ�쳣,��д����Ľ׶ξͻ���ʾ�������п���������.
		// ���Ǿ;���Ĵ������.�ڿ����׶ξͽ����
		
		try {
			FileReader fr = new FileReader("");
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�û���ҵ�");
			// ���ǿ��Զ��쳣���д���.�����ǵ���
			// ���򻹿��Լ���ִ��.
		}
		
		// ����ʱ�쳣,��ʹ������.����Ҳ���Կ���������Ϣ,֪��ʲôԭ��.֪��������,�޸Ĵ���
		int c = 10 / 1;
	}

}
