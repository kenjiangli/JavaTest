package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * FileOutPutStream 字节输出流
 * 
 *FileInputStream 字节输入流
 *
 *无法拿到字符串
 */
public class InAndOutPutStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//writeCN();
		readCN();
	}

	private static void writeCN() throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("cn.txt");
		fos.write("中国".getBytes());
		fos.close();
		
		
	}

	private static void readCN() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("cn.txt");
		byte[] b=new byte[20];
		int len=0;
		while((len=fis.read(b))!=-1){
			System.out.println(Arrays.toString(b));
		}
		fis.close();
	}

}
