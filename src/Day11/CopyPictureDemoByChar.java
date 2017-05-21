package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求:复制工程下的图片.JPG到工程下名为图片Copy-2.JPG 字节数组方式
 */
public class CopyPictureDemoByChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//创建输入流
		FileInputStream fis=new FileInputStream("copy.png");
		
		//创建输出流
		FileOutputStream fos=new  FileOutputStream("copyDva2.png");
		
		//赋值文件,读一个字节数组,写一个字节数组,循环读写
		byte[] b=new byte[1024];
		int len=0;
		while((len=fis.read(b))!=-1){
			//读到数据,写入数据
			fos.write(b, 0, len);
		}
		
		//关闭流
		fis.close();
		fos.close();
	}

}


























































