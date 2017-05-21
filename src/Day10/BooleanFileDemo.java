package Day10;

import java.io.File;
import java.util.Date;

/*
 *  * File的判断功能
 * 		boolean exists(): 判断文件或目录是否存在
 * 		boolean isDirectory(): 是否是文件夹,如果文件夹不存在返回false
 * 		boolean isFile(): 是否是文件,如果文件不存在返回false
 *  	boolean isHidden():判断是否是一个隐藏文件
 *  	long lastModified():最后一次被修改的时间
 */
public class BooleanFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used");
		
		//判断文件或目录是否存在
		boolean exists=file.exists();
		System.out.println(exists);
		
		//判断是否有文件夹
		Boolean directory=file.isDirectory();
		System.out.println(directory);
		
		//判断是否是文件
		File file2=new File("C:\\Users\\LJian\\Desktop\\used\\test01.java");
		boolean isFile=file2.isFile();
		boolean isFile2=file.isFile();
		System.out.println(isFile+"--"+isFile2);
		
		//判断文件是否隐藏
		boolean hidden=file2.isHidden();
		System.out.println(hidden);
		
		
		//获取文件最后编辑的时间
		long lastModified=file2.lastModified();
		System.out.println(new Date(lastModified));
	}

}









































































