package Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * FileInputStream:
 * int read(byte[] b):��ȡһ���ֽ�����,����ֵ��ȡ�����ݳ���,-1��ʾ��ȡ����
 */
public class CopyFileDemoByChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	FileInputStream fis=new FileInputStream("a.txt");
	
	byte[] b=new byte[1024];
	
	int len=0;
	
	//ѭ����ȡ,ֱ��-1�Ͳ���ȡ��
	while((len=fis.read(b))!=-1){
		System.out.print(new String(b,0,len));
	}
	fis.close();
	}

}
