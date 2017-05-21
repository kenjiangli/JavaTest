package Day10;

import java.io.File;

/*
 * File类（String pathname）：根据字符串创建一个File实例,不会去判断文件或文件夹是否存在
 * 
 * File(String parent,String child):根据parent路径名字字符串和child路径名字符串创建一个新File实例
 * 
 * File(File paret,String,child):根据parent抽象路径名和child路径名字符创建一个新的File实例
 */
public class FileDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method01();
		//method02();
		method03();
	}
	
	//File parent,String child
		private static void method03() {
		// TODO Auto-generated method stub
		//parent是通过listFiles返回的
		File parent =new File("C:\\Users\\LJian\\Desktop\\");
		File file=new File(parent,"used\\App接口.docx");
		System.out.println(file);
	}
		//File(String parent,String child)
		private static void method02() {
		// TODO Auto-generated method stub
		
			//自由拼接父路径和子路径
			File file=new File("C:\\Users\\LJian\\Desktop\\","used\\App接口.docx");
			System.out.println(file);
	}

		//File(String pathname)
	private static void method01() {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\App接口.docx");
		System.out.println(file);
		
		File file2=new File("C:\\Users\\LJian\\Desktop\\used");
		System.out.println(file2);
	}

}
