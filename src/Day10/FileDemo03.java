package Day10;

import java.io.File;
import java.io.IOException;

/*
 * File���ܵķ���
 * 		1.��������
 * 		2.��ȡ����
 * 		3.�жϹ���
 * 		4.ɾ������
 * 		5.list����
 * 
 * 1.��������
 * 		1.�����ļ�:
 * 		boolean creatNewFile():�����ļ� ���һ��/����ı�ʾ�ļ���,ǰ��ı�ʾ�ļ���
 * 		true��ʾ�����ɹ�,false��ʾ����ʧ��
 * 
 * 		����ʧ�ܵ����
 * 			1.�ļ��Ѿ�����
 * 			2.�ļ��в�����Ҳ�������ɹ�
 * 			
 * 		2.�����ļ���
 * 			boolean mkdir():�����ļ��� ���/�������Ҫ�������ļ���
 * 			
 * 
 * 
 */
public class FileDemo03 {

	private static boolean createNewFile;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//method01();
		//method02();
		method03();
	}
	
	//�����ļ���
	private static void method03() {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\newfolder2");
		boolean b=file.mkdirs();
		System.out.println(b);
	}

	//�����ļ���mkdir ->make directory
	private static void method02() {
		// TODO Auto-generated method stub
		//File file=new File("C:\\Users\\LJian\\Desktop\\used\\newfolder");
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\�½��ļ���");
		boolean b=file.mkdirs();
		System.out.println(b);
		
		
	}

	//�����ļ�:createNewFile
	private static void method01() throws IOException {
		// TODO Auto-generated method stub
		
		//�����ļ�
		//File file=new File("C:\\Users\\LJian\\Desktop\\used\\html3.txt");
		//File file=new File("C:\\Users\\LJian\\Desktop\\used\\newfolder");
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\html.txt");
		boolean b = file.createNewFile();
		System.out.println(b);
		
	}

}







































































