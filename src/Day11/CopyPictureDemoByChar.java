package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����:���ƹ����µ�ͼƬ.JPG����������ΪͼƬCopy-2.JPG �ֽ����鷽ʽ
 */
public class CopyPictureDemoByChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//����������
		FileInputStream fis=new FileInputStream("copy.png");
		
		//���������
		FileOutputStream fos=new  FileOutputStream("copyDva2.png");
		
		//��ֵ�ļ�,��һ���ֽ�����,дһ���ֽ�����,ѭ����д
		byte[] b=new byte[1024];
		int len=0;
		while((len=fis.read(b))!=-1){
			//��������,д������
			fos.write(b, 0, len);
		}
		
		//�ر���
		fis.close();
		fos.close();
	}

}


























































