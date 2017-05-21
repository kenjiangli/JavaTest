package Day10;

import java.io.File;

/*
 * String getPath(): 返回路径的字符串
	String getAbsolutePath(): 返回此抽象路径名的绝对路径名字符串
	String getName(): 返回由此抽象路径名表示的文件或目录的名称(路径的最后部分)
	String getParent(): 返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null
	File getParentFile(): 返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null
	File getAbsoluteFile(): 返回此抽象路径名的绝对路径名形式
	long length(): 返回由此抽象路径名表示的文件的长度,单位是byte,文件夹没有长度
 */
public class GetFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("GetFileDemo.java");
		System.out.println(file);
		System.out.println(file.getPath());//返回路径的字符串
		
		//返回此抽象路径名的绝对路径名字符串
		String absolutePath=file.getAbsolutePath();
		System.out.println(absolutePath);	
		
		//获取名称
		File file2=new File("GetFileDemo.java");
		String name=file2.getName();
		System.out.println(name);
		
		//获取子路径
		File file3=new File("C:\\Users\\LJian\\Desktop\\used\\test.java");		
		String parent=file3.getParent();
		System.out.println(parent);
		
		//获取父路径File对象,好处可以调用file的功能
		File parentfile=file3.getParentFile();
		System.out.println(parentfile);
		
//		File file4=new File("C:\\Users\\LJian\\Desktop\\used");	//不能获取文件夹大小
		long length=file2.length();
//		long length2=file4.length();
//		System.out.println(length2);
		System.out.println(length);
		
		
		
	}

}










































