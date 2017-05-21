package Day11;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileReader ->BufferedReader
 * FileInputStream ->BufferedInputStream
 * 
 * �ֽڻ�����
 * OutputStream
 * 	|-FilterOutputStream:�ֽ����������
 * 		���췽��:BufferedOutputStream(OutputStream out)
 * 		��ͨ����:
 * 				void write(int b)
 * 				void write(byte[] b,int off,int len)
 * 
 * InputStream
 * 	|-FilterInputStream
 * 			|-BufferedInputStream:�ֽ����뻺����
 */

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		FileOutputStream fos=new FileOutputStream("a.txt");
		
		//����BufferedOutputStream
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		//д����
		bos.write(100);
		
		byte[] b={49,48,48};
		bos.write(b,0,2);
		
		bos.close();
	}

}
