package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/*
 * ����:��copy1.txt�����ݸ��Ƶ�copy2.txt��,�ֽڷ�ʽ
 * 
 * Դ�ļ�
 *  	copy1.txt	 ��ȡ���� �ֽ�������    FileIntputStream int read();
 *  
 *   Ŀ�ĵ�:
 *   	copy2.txt   д����      �ֽ������    FileOutpurStream void write(int b);
 */
public class CopyFileDemo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//�����������������
		FileInputStream fis=new FileInputStream("copy1.txt");
		FileOutputStream fos=new FileOutputStream("copy2.txt");
		
		//һ��һ���ֽ�ѭ����д
		int b=0;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		
		//�ر���Դ
		fis.close();
		fos.close();

	}

}















































