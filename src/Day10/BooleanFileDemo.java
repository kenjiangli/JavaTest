package Day10;

import java.io.File;
import java.util.Date;

/*
 *  * File���жϹ���
 * 		boolean exists(): �ж��ļ���Ŀ¼�Ƿ����
 * 		boolean isDirectory(): �Ƿ����ļ���,����ļ��в����ڷ���false
 * 		boolean isFile(): �Ƿ����ļ�,����ļ������ڷ���false
 *  	boolean isHidden():�ж��Ƿ���һ�������ļ�
 *  	long lastModified():���һ�α��޸ĵ�ʱ��
 */
public class BooleanFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used");
		
		//�ж��ļ���Ŀ¼�Ƿ����
		boolean exists=file.exists();
		System.out.println(exists);
		
		//�ж��Ƿ����ļ���
		Boolean directory=file.isDirectory();
		System.out.println(directory);
		
		//�ж��Ƿ����ļ�
		File file2=new File("C:\\Users\\LJian\\Desktop\\used\\test01.java");
		boolean isFile=file2.isFile();
		boolean isFile2=file.isFile();
		System.out.println(isFile+"--"+isFile2);
		
		//�ж��ļ��Ƿ�����
		boolean hidden=file2.isHidden();
		System.out.println(hidden);
		
		
		//��ȡ�ļ����༭��ʱ��
		long lastModified=file2.lastModified();
		System.out.println(new Date(lastModified));
	}

}









































































