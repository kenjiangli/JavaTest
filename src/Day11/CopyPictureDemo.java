package Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * * 需求:复制工程下的图片.JPG到工程下名为图片Copy.JP
 */
public class CopyPictureDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//创建输出流和输出流
		FileInputStream fis=new FileInputStream("copy.png");
		FileOutputStream fos=new FileOutputStream("copyDva.png");
		
		//一个一个字节读取
		int b=0;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		
		//关流
		fis.close();
		fos.close();
	}

}
