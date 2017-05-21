package Day10;

import java.io.File;
import java.io.FileFilter;

/*
 * File���е�list()��listFiles()����,�г�����Ŀ¼�е������ļ����ļ���
 * File���к��ͷ���File[] listFiles(FileFilter filter),�����г������������ļ����ļ���
 * 
 * �г����е�java�ļ�
 * 
 *  * 
 * �ļ���������ʹ��:
 * 	1.����FileFilter��ʵ����
 * 	2.��д�ӿڵĳ��󷽷�,���������ķ���true,�����������ķ���false
 *  3.����ʵ�������
 *  4.listFiles()����ʵ���������Ϊ����
 */
public class FileFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.����File����
		File file=new File("C:\\Users\\LJian\\Desktop\\used");
		
		//2.�г��ļ�������������������
		MyJavaFileFilter filter=new MyJavaFileFilter();
		File[] listFiles=file.listFiles(filter);
		
		for (File file2 : listFiles) {
		System.out.println(file2);	
		}
	}

}

//����ʵ����
class MyJavaFileFilter implements FileFilter{

	//ʵ�ֽӿڵĳ��󷽷�
	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		
		//System.out.println(pathname);
		//�õ�pathname,��������,������������true,��������������false
		if(pathname.isFile()){
			if(pathname.getName().toLowerCase().endsWith("java")){
				return true;
				}
			}
		return false;
	}
	
}




















































































