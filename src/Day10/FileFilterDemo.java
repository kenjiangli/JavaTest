package Day10;

import java.io.File;
import java.io.FileFilter;

/*
 * File类中的list()和listFiles()方法,列出的是目录中的所有文件和文件夹
 * File类中海油方法File[] listFiles(FileFilter filter),可以列出满足条件的文件和文件夹
 * 
 * 列出所有的java文件
 * 
 *  * 
 * 文件过滤器的使用:
 * 	1.定义FileFilter的实现类
 * 	2.重写接口的抽象方法,满足条件的返回true,不满足条件的返回false
 *  3.创建实现类对象
 *  4.listFiles()传入实现类对象作为参数
 */
public class FileFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.创建File对象
		File file=new File("C:\\Users\\LJian\\Desktop\\used");
		
		//2.列出文件夹中满足条件的内容
		MyJavaFileFilter filter=new MyJavaFileFilter();
		File[] listFiles=file.listFiles(filter);
		
		for (File file2 : listFiles) {
		System.out.println(file2);	
		}
	}

}

//定义实现类
class MyJavaFileFilter implements FileFilter{

	//实现接口的抽象方法
	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		
		//System.out.println(pathname);
		//拿到pathname,根据条件,满足条件返回true,不满足条件返回false
		if(pathname.isFile()){
			if(pathname.getName().toLowerCase().endsWith("java")){
				return true;
				}
			}
		return false;
	}
	
}




















































































