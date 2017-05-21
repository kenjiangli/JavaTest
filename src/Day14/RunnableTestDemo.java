package Day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求: 使用实现Runnable接口创建线程,复制工程下的图片.JPG到工程下名为图片Copy.JPG
 * 
 * 1.定义一个实现类实现Runnable接口
 * 2.重写run方法
 * 3.创建实现类对象
 * 4.创建Thread对象.传入Runnable对象
 * 5.调用start方法
 */
public class RunnableTestDemo {
public static void main(String[] args) {
	
	//3创建实现类对象
	copyRunnable cr= new copyRunnable();
	Thread t=new Thread(cr);
	t.start();
}
}

//1.定义一个实现类实现Runnable接口
class copyRunnable implements Runnable{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println("开始拷贝文件"+name);
		
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





































































































