package Day10;

import java.io.File;

public class FileRenameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method01();
		method02();
	}
	
	//在不同文件夹是移动(剪切功能)
	private static void method02() {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\test01test.java");
		File dest=new File("C:\\Users\\LJian\\Desktop\\used\\newfolder2\\test01test01.java");
		boolean rename=file.renameTo(dest);
		System.out.println(rename);
	}

	//在同一个文件夹中重命名
	private static void method01() {
		// TODO Auto-generated method stub
		
		
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\test01.java");
		
		File dest=new File("C:\\Users\\LJian\\Desktop\\used\\test01test.java");
		boolean rename=file.renameTo(dest);
		System.out.println(rename);
	}

}
