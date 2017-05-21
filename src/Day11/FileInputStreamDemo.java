package Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * InputStream:此抽象类是表示字节输入流的所有类的超类
 * 	  |- FileInputStream: 从文件中读取字节
 * 
 * FileInputStream: 构造方法
 * 		FileInputStream(File file):实验File对象创建FileInputStream
 * 		FileInputStream(String name):使用字符串创建FileInputStream
 * 
 * InputStream方法:
 *  	abstract int read():读取一个字节
 *  	int read(byte[] b):读取一个自己接数组,返回值是读取到的内容长度
 *  	int read(byte[] b,int off,int len):读取字节数组,放到b的off开始,长度len
 *  
 *  输入流读取数据的步骤
 *  	1.创建字节输入流对象
 *  	2.调用read方法读取数据
 * 
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//创建字节输入流对象
		FileInputStream fis=new FileInputStream("qq.txt");
		
		int b=0;
		while((b=fis.read())!=-1){
			
			//读取数据,数据在b中
			System.out.print((char)b);
		}
		
		//关流
		fis.close();

	}

}








































































































