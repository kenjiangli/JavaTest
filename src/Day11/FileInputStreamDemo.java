package Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * InputStream:�˳������Ǳ�ʾ�ֽ���������������ĳ���
 * 	  |- FileInputStream: ���ļ��ж�ȡ�ֽ�
 * 
 * FileInputStream: ���췽��
 * 		FileInputStream(File file):ʵ��File���󴴽�FileInputStream
 * 		FileInputStream(String name):ʹ���ַ�������FileInputStream
 * 
 * InputStream����:
 *  	abstract int read():��ȡһ���ֽ�
 *  	int read(byte[] b):��ȡһ���Լ�������,����ֵ�Ƕ�ȡ�������ݳ���
 *  	int read(byte[] b,int off,int len):��ȡ�ֽ�����,�ŵ�b��off��ʼ,����len
 *  
 *  ��������ȡ���ݵĲ���
 *  	1.�����ֽ�����������
 *  	2.����read������ȡ����
 * 
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//�����ֽ�����������
		FileInputStream fis=new FileInputStream("qq.txt");
		
		int b=0;
		while((b=fis.read())!=-1){
			
			//��ȡ����,������b��
			System.out.print((char)b);
		}
		
		//����
		fis.close();

	}

}








































































































