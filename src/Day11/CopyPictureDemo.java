package Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * * ����:���ƹ����µ�ͼƬ.JPG����������ΪͼƬCopy.JP
 */
public class CopyPictureDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//����������������
		FileInputStream fis=new FileInputStream("copy.png");
		FileOutputStream fos=new FileOutputStream("copyDva.png");
		
		//һ��һ���ֽڶ�ȡ
		int b=0;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		
		//����
		fis.close();
		fos.close();
	}

}
