package Day11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 1.fos需要关闭,但是不能再try中关闭,需要去finally中关闭
 * 2.fos的作用于不够,定义在try外面
 * 3.fos.close会出现空指针异常,判断fos!=null来关闭
 * 4.fos.close会出现异常,try/catch处理
 * 5.出现异常,提示信息怎么写?
 */

public class FileOutputStreamExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FileOutputStream fos=null;
			
			try {
				//fos=new FileOutputStream("O:\\a.txt");//盘符不存在
				fos=new FileOutputStream("a.txt");
				try {
					fos.write(100);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("写入失败");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("文件名不存在");
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
