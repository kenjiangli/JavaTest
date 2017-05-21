package Day11;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*InputStream
 * 	|-FilterInputStream
 * 			|-BufferedInputStream:�ֽ����뻺����
 * 
 */
public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("a.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		//������
		//��һ���ֽ�
//		int read=bis.read();
//		System.out.println(read);
		
		//��һ���ֽ�����
		byte[] b=new byte[1024];
		int len=0;
		while((len=bis.read(b))!=-1){
			System.out.println(new String(b,0,len));
		}
		
		bis.close();
	}

}























































































