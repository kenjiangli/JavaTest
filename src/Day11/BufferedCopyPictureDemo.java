package Day11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求:复制工程下的图片.JPG到工程下名为图片Copy-Buff.JPG 
 * 
 * 
 * 分析:
 * 	源文件:
 * 		图片.JPG	读
 * 
 * 	目的地:
 * 		图片Copy-Buff.JPG 写
 */
public class BufferedCopyPictureDemo {
public static void main(String[] args) throws IOException {
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream("copy.png"));
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copyDva3.png"));
	
	//复制文件
	byte[] b=new byte[1024];
	int len=0;
	while((len=bis.read(b))!=-1){
		bos.write(b, 0, len);
	}
	//关流
	bis.close();
	bos.close();
}
}
