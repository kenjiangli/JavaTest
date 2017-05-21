package Day10;

import java.io.File;

/*
 * Filed的删除功能
 * boolean delete():删除文件和文件夹,是直接删除,不会在回收站
 * 只能删除空文件夹
 */
public class FileDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method01();
		//method02();
		method03();
	}
	//删除有文件的文件夹
		private static void method03() {
			// TODO Auto-generated method stub
			File file=new File("C:\\Users\\LJian\\Desktop\\used\\newfolder2");
			boolean delete=file.delete();
			System.out.println(delete);
		}
	
	//删除文件夹
	private static void method02() {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\newfolder");
		boolean delete=file.delete();
		System.out.println(delete);
	}

	//删除文件
	private static void method01() {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\test.java");
		boolean delete=file.delete();
		System.out.println(delete);
		
	}

}
