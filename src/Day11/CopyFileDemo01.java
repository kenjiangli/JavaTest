package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/*
 * 需求:将copy1.txt的内容复制到copy2.txt中,字节方式
 * 
 * 源文件
 *  	copy1.txt	 读取数据 字节输入流    FileIntputStream int read();
 *  
 *   目的地:
 *   	copy2.txt   写数据      字节输出流    FileOutpurStream void write(int b);
 */
public class CopyFileDemo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//创建输入流和输出流
		FileInputStream fis=new FileInputStream("copy1.txt");
		FileOutputStream fos=new FileOutputStream("copy2.txt");
		
		//一个一个字节循环读写
		int b=0;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		
		//关闭资源
		fis.close();
		fos.close();

	}

}















































