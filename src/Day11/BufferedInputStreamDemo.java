package Day11;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*InputStream
 * 	|-FilterInputStream
 * 			|-BufferedInputStream:字节输入缓冲流
 * 
 */
public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("a.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		//读数据
		//读一个字节
//		int read=bis.read();
//		System.out.println(read);
		
		//读一个字节数组
		byte[] b=new byte[1024];
		int len=0;
		while((len=bis.read(b))!=-1){
			System.out.println(new String(b,0,len));
		}
		
		bis.close();
	}

}























































































