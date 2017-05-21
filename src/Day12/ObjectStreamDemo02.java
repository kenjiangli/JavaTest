package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ObjectInputStream:将文件的对象读取到程序中
 * 
 * 构造方法
 * 	ObjectInputStream(InputStream in)
 */
public class ObjectStreamDemo02 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("chan.txt"));
		
		//读取对象
		Persons obj=(Persons) ois.readObject();
		ois.close();
		System.out.println(obj);
	}

}












































