package Day11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 *  * OutputStream�ķ���
 * void write(byte[] b):���ֽ�����д���ļ���
 * void write(byte[] b,int off.,int len):���ֽ������һ����д���ļ���
 * abstract void write(int b):��һ���ֽ�д��
 * 
 * �����д���ݲ���
 * 		1.����FileOutputStream����
 * 		2.д����
 * 		3.�ر���
 */
public class FileOutputStreamDemo02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//����FileOutputStream����
		FileOutputStream fos=new FileOutputStream("angelababy.txt");
		
		//д����
		String s="������";
		
		byte[] bytes = s.getBytes();//���ַ���תΪ�ֽ�����
		fos.write(bytes);//д�ֽ�����
		
		//����
		fos.close();
		
		
	}

}






































