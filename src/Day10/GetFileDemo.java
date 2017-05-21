package Day10;

import java.io.File;

/*
 * String getPath(): ����·�����ַ���
	String getAbsolutePath(): ���ش˳���·�����ľ���·�����ַ���
	String getName(): �����ɴ˳���·������ʾ���ļ���Ŀ¼������(·������󲿷�)
	String getParent(): ���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻� null
	File getParentFile(): ���ش˳���·������Ŀ¼�ĳ���·�����������·����û��ָ����Ŀ¼���򷵻� null
	File getAbsoluteFile(): ���ش˳���·�����ľ���·������ʽ
	long length(): �����ɴ˳���·������ʾ���ļ��ĳ���,��λ��byte,�ļ���û�г���
 */
public class GetFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("GetFileDemo.java");
		System.out.println(file);
		System.out.println(file.getPath());//����·�����ַ���
		
		//���ش˳���·�����ľ���·�����ַ���
		String absolutePath=file.getAbsolutePath();
		System.out.println(absolutePath);	
		
		//��ȡ����
		File file2=new File("GetFileDemo.java");
		String name=file2.getName();
		System.out.println(name);
		
		//��ȡ��·��
		File file3=new File("C:\\Users\\LJian\\Desktop\\used\\test.java");		
		String parent=file3.getParent();
		System.out.println(parent);
		
		//��ȡ��·��File����,�ô����Ե���file�Ĺ���
		File parentfile=file3.getParentFile();
		System.out.println(parentfile);
		
//		File file4=new File("C:\\Users\\LJian\\Desktop\\used");	//���ܻ�ȡ�ļ��д�С
		long length=file2.length();
//		long length2=file4.length();
//		System.out.println(length2);
		System.out.println(length);
		
		
		
	}

}










































