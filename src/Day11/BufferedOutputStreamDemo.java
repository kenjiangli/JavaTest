package Day11;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileReader ->BufferedReader
 * FileInputStream ->BufferedInputStream
 * 
 * 字节缓冲流
 * OutputStream
 * 	|-FilterOutputStream:字节输出缓冲流
 * 		构造方法:BufferedOutputStream(OutputStream out)
 * 		普通方法:
 * 				void write(int b)
 * 				void write(byte[] b,int off,int len)
 * 
 * InputStream
 * 	|-FilterInputStream
 * 			|-BufferedInputStream:字节输入缓冲流
 */

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		FileOutputStream fos=new FileOutputStream("a.txt");
		
		//创建BufferedOutputStream
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		//写数据
		bos.write(100);
		
		byte[] b={49,48,48};
		bos.write(b,0,2);
		
		bos.close();
	}

}
