package Day10;

import java.io.File;

/*
 * File��:
 *  boolean exists(): �ж��ļ����ļ����Ƿ����
 *  		true��ʾ����,false��ʾ������
    boolean isDirectory():�ж��Ƿ����ļ���
    		���ļ���,����true
 	boolean isFile():�ж��Ƿ����ļ�
 * 
 * */
public class FileExistsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		File file=new File("C:\\Users\\LJian\\Desktop\\used");
		boolean exists=file.exists();
		System.out.println(exists);
	}

}
