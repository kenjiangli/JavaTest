package Day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 对称加密,用什么加密,就用什么解密
 * 
 * 非对称加密:用什么加密,用另外的内容去解密(公钥,私钥)
 */
public class PWDFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//method01("copy.png","copyPWD.png");
		method01("copyPWD.png","copyout.png");
	}

	private static void method01(String source,String target) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream(source);
		FileOutputStream fos =new FileOutputStream(target);
		
		byte[] b=new byte[1024];
		int len=0;
		
		while((len=fis.read(b))!=-1){
			//加密和解密
			
			for (int i = 0; i < b.length; i++) {
				byte bb=b[i];
				
				b[i]=(byte) (bb^5);
			}
			
			fos.write(b, 0, len);
		}
		
		fis.close();
		fos.close();
		
		
	}

}












































































