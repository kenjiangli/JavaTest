package Day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����: ʹ��ʵ��Runnable�ӿڴ����߳�,���ƹ����µ�ͼƬ.JPG����������ΪͼƬCopy.JPG
 * 
 * 1.����һ��ʵ����ʵ��Runnable�ӿ�
 * 2.��дrun����
 * 3.����ʵ�������
 * 4.����Thread����.����Runnable����
 * 5.����start����
 */
public class RunnableTestDemo {
public static void main(String[] args) {
	
	//3����ʵ�������
	copyRunnable cr= new copyRunnable();
	Thread t=new Thread(cr);
	t.start();
}
}

//1.����һ��ʵ����ʵ��Runnable�ӿ�
class copyRunnable implements Runnable{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println("��ʼ�����ļ�"+name);
		
		try(
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("day14test.png"));
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("day14testcopy.png"));
			){
			byte[] b=new byte[1024];
			int len=0;
			while((len=bis.read(b))!=-1){
				bos.write(b, 0, len);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}





































































































