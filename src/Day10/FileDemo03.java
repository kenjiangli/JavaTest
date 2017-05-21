package Day10;

import java.io.File;
import java.io.IOException;

/*
 * File功能的分类
 * 		1.创建功能
 * 		2.获取功能
 * 		3.判断功能
 * 		4.删除功能
 * 		5.list功能
 * 
 * 1.创建功能
 * 		1.创建文件:
 * 		boolean creatNewFile():创建文件 最后一个/后面的表示文件名,前面的表示文件名
 * 		true表示创建成功,false表示创建失败
 * 
 * 		创建失败的情况
 * 			1.文件已经存在
 * 			2.文件夹不存在也创建不成功
 * 			
 * 		2.创建文件夹
 * 			boolean mkdir():创建文件夹 最后/后面的是要创建的文件夹
 * 			
 * 
 * 
 */
public class FileDemo03 {

	private static boolean createNewFile;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//method01();
		//method02();
		method03();
	}
	
	//创建文件夹
	private static void method03() {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\newfolder2");
		boolean b=file.mkdirs();
		System.out.println(b);
	}

	//创建文件夹mkdir ->make directory
	private static void method02() {
		// TODO Auto-generated method stub
		//File file=new File("C:\\Users\\LJian\\Desktop\\used\\newfolder");
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\新建文件夹");
		boolean b=file.mkdirs();
		System.out.println(b);
		
		
	}

	//创建文件:createNewFile
	private static void method01() throws IOException {
		// TODO Auto-generated method stub
		
		//创建文件
		//File file=new File("C:\\Users\\LJian\\Desktop\\used\\html3.txt");
		//File file=new File("C:\\Users\\LJian\\Desktop\\used\\newfolder");
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\html.txt");
		boolean b = file.createNewFile();
		System.out.println(b);
		
	}

}







































































