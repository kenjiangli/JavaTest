package Day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 	File对象(操作文件):创建文件和文件夹,删除文件和文件夹,获取文件和文件夹信息,重命名,列出
 * 文件里面的内容
 * 
 * FileReader/FileWriter字符流:向文件中读取或写入数据
 * 
 * 字节流:
 * 		字节输出流:OutputStream
 * 		字节输入流
 * 
 * OutputStream:此抽象类是表示输出字节流的所有类的超类
 * 	|- FileOutputStream:将数据写到文件中
 * 
 * OutputStream的方法
 * void write(byte[] b):将字节数组写入文件中
 * void write(byte[] b,int off.,int len):将字节数组的一部分写入文件中
 * abstract void write(int b):将一个字节写入
 * 
 * 
 * FileOutPutStream类
 * 		FileOutputStream(File file):根据File对象来创建FileOutPutStream
 * 		FileOutputSream(String name):根据String创建FileOutputStream
 */
public class FileOutPutStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			
		//创建文件,如果这个文件存在,现将文件删除,再创建一个新的空文件
		//FileOutputStream fos=new FileOutputStream("angelababy.txt");
		
		
		File file=new File("angelababy.txt");
		//FileOutputStream fos2=new FileOutputStream(file);
		FileOutputStream fos3=new FileOutputStream(new File("angelababy.txt"));
}



}

































