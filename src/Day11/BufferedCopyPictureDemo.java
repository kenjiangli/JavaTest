package Day11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����:���ƹ����µ�ͼƬ.JPG����������ΪͼƬCopy-Buff.JPG 
 * 
 * 
 * ����:
 * 	Դ�ļ�:
 * 		ͼƬ.JPG	��
 * 
 * 	Ŀ�ĵ�:
 * 		ͼƬCopy-Buff.JPG д
 */
public class BufferedCopyPictureDemo {
public static void main(String[] args) throws IOException {
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream("copy.png"));
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copyDva3.png"));
	
	//�����ļ�
	byte[] b=new byte[1024];
	int len=0;
	while((len=bis.read(b))!=-1){
		bos.write(b, 0, len);
	}
	//����
	bis.close();
	bos.close();
}
}
