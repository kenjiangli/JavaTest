package Day11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 1.fos��Ҫ�ر�,���ǲ�����try�йر�,��Ҫȥfinally�йر�
 * 2.fos�������ڲ���,������try����
 * 3.fos.close����ֿ�ָ���쳣,�ж�fos!=null���ر�
 * 4.fos.close������쳣,try/catch����
 * 5.�����쳣,��ʾ��Ϣ��ôд?
 */

public class FileOutputStreamExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FileOutputStream fos=null;
			
			try {
				//fos=new FileOutputStream("O:\\a.txt");//�̷�������
				fos=new FileOutputStream("a.txt");
				try {
					fos.write(100);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("д��ʧ��");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("�ļ���������");
			}finally{
				if(fos!=null){
					try {
						fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	}

}
