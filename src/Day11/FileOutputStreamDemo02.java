package Day11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 *  * OutputStream的方法
 * void write(byte[] b):将字节数组写入文件中
 * void write(byte[] b,int off.,int len):将字节数组的一部分写入文件中
 * abstract void write(int b):将一个字节写入
 * 
 * 输出流写数据步骤
 * 		1.创建FileOutputStream对象
 * 		2.写数据
 * 		3.关闭流
 */
public class FileOutputStreamDemo02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//创建FileOutputStream对象
		FileOutputStream fos=new FileOutputStream("angelababy.txt");
		
		//写数据
		String s="黄晓明";
		
		byte[] bytes = s.getBytes();//将字符串转为字节数组
		fos.write(bytes);//写字节数组
		
		//关流
		fos.close();
		
		
	}

}






































