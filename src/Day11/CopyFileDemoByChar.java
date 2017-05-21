package Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * FileInputStream:
 * int read(byte[] b):读取一个字节数组,返回值读取的数据长度,-1表示读取结束
 */
public class CopyFileDemoByChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	FileInputStream fis=new FileInputStream("a.txt");
	
	byte[] b=new byte[1024];
	
	int len=0;
	
	//循环读取,直到-1就不读取了
	while((len=fis.read(b))!=-1){
		System.out.print(new String(b,0,len));
	}
	fis.close();
	}

}
