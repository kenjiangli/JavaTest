package Day11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=new FileOutputStream("qq.txt");
		
		//fos.write(100);//write(100) -> 0110 0100 -> ��ѯ��� -> Ϊd
		//byte[] b={97,98,99,100};//txt����abcd
		
		//��һ���ֽ�д��:void write(int b)
		//���±��ı����߻��ѯ���
		//byte[] b={49,48,48};//100
		
		String s="100";
		fos.write(s.getBytes());
		
		fos.close();
		
	}

}
