package Day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 	File����(�����ļ�):�����ļ����ļ���,ɾ���ļ����ļ���,��ȡ�ļ����ļ�����Ϣ,������,�г�
 * �ļ����������
 * 
 * FileReader/FileWriter�ַ���:���ļ��ж�ȡ��д������
 * 
 * �ֽ���:
 * 		�ֽ������:OutputStream
 * 		�ֽ�������
 * 
 * OutputStream:�˳������Ǳ�ʾ����ֽ�����������ĳ���
 * 	|- FileOutputStream:������д���ļ���
 * 
 * OutputStream�ķ���
 * void write(byte[] b):���ֽ�����д���ļ���
 * void write(byte[] b,int off.,int len):���ֽ������һ����д���ļ���
 * abstract void write(int b):��һ���ֽ�д��
 * 
 * 
 * FileOutPutStream��
 * 		FileOutputStream(File file):����File����������FileOutPutStream
 * 		FileOutputSream(String name):����String����FileOutputStream
 */
public class FileOutPutStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			
		//�����ļ�,�������ļ�����,�ֽ��ļ�ɾ��,�ٴ���һ���µĿ��ļ�
		//FileOutputStream fos=new FileOutputStream("angelababy.txt");
		
		
		File file=new File("angelababy.txt");
		//FileOutputStream fos2=new FileOutputStream(file);
		FileOutputStream fos3=new FileOutputStream(new File("angelababy.txt"));
}



}

































