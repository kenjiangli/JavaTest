package Day10;

import java.io.File;

/*
 * File类:
 *  boolean exists(): 判断文件或文件夹是否存在
 *  		true表示存在,false表示不存在
    boolean isDirectory():判断是否是文件夹
    		是文件夹,返回true
 	boolean isFile():判断是否是文件
 * 
 * */
public class FileExistsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		File file=new File("C:\\Users\\LJian\\Desktop\\used");
		boolean exists=file.exists();
		System.out.println(exists);
	}

}
