package Day11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//换行
public class FileOutputStreamDemo04 {
public static void main(String[] args) throws IOException {
	
	FileOutputStream fos=new FileOutputStream("qq.txt");
	
	//换行
	fos.write(101);
	fos.write("\r\n".getBytes());
	fos.write(102);
	fos.write("\r\n".getBytes());//windows的换行 \r\n
	fos.write(100);
	
	fos.close();
}
}
