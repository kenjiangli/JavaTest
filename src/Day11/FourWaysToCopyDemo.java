package Day11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制test.MP3
 * 
 * 使用4种方式复制
 * 1.字节流一次复制一个字节
 * 2.字节流一次复制一个字节数组
 * 3.缓冲字节流一次复制一个字节
 * 4.缓冲字节流一次复制一个字节数组
 */
public class FourWaysToCopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			long start = System.currentTimeMillis();
			
			//method01();
			//method02();
			//method03();
			method04();
			
			long end = System.currentTimeMillis();
			
			System.out.println(end-start);
	}
	
	//缓冲字节流一次复制一个字节数组
	private static void method04() throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("test.mp3"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("test4.mp3"));
		
		byte[] b=new byte[1024];
		int len=0;
		while((len=bis.read(b))!=-1){
			bos.write(b, 0, len);
		}
		
		bis.close();
		bos.close();
	}

	//缓冲字节流一次复制一个字节
	private static void method03() throws IOException {
		// TODO Auto-generated method stub
		
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("test.mp3"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("test3.mp3"));
		
		int b=0;
		while((b=bis.read())!=-1){
			bos.write(b);
		}
		
		bis.close();
		bos.close();
		
	}
	//字节流一次复制一个字节数组
	private static void method02() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("test.mp3");
		FileOutputStream fos=new FileOutputStream("test2.mp3");
		
		byte[] b=new byte[1024];
		int len=0;
		while((len=fis.read(b))!=-1){
			fos.write(b, 0, len);;
		}
		fis.close();
		fos.close();
		
		
	}
	//字节流一次复制一个字节
	private static void method01() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("test.mp3");
		FileOutputStream fos=new FileOutputStream("test1.mp3");
		
		int b=0;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		fis.close();
		fos.close();
		
		
	}

}



































































