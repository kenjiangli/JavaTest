package Day10;

import java.io.File;

/*
 * File�ࣨString pathname���������ַ�������һ��Fileʵ��,����ȥ�ж��ļ����ļ����Ƿ����
 * 
 * File(String parent,String child):����parent·�������ַ�����child·�����ַ�������һ����Fileʵ��
 * 
 * File(File paret,String,child):����parent����·������child·�����ַ�����һ���µ�Fileʵ��
 */
public class FileDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method01();
		//method02();
		method03();
	}
	
	//File parent,String child
		private static void method03() {
		// TODO Auto-generated method stub
		//parent��ͨ��listFiles���ص�
		File parent =new File("C:\\Users\\LJian\\Desktop\\");
		File file=new File(parent,"used\\App�ӿ�.docx");
		System.out.println(file);
	}
		//File(String parent,String child)
		private static void method02() {
		// TODO Auto-generated method stub
		
			//����ƴ�Ӹ�·������·��
			File file=new File("C:\\Users\\LJian\\Desktop\\","used\\App�ӿ�.docx");
			System.out.println(file);
	}

		//File(String pathname)
	private static void method01() {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\App�ӿ�.docx");
		System.out.println(file);
		
		File file2=new File("C:\\Users\\LJian\\Desktop\\used");
		System.out.println(file2);
	}

}
