package Day10;

import java.io.File;

/*
 *递归分为两种,直接和间接递归
 *直接递归:只在当前方法内调用自己的这种现象
 *间接递归,可以在A方法调用B方法,B方法调用C方法,C方法调用D方法
 *
 */
public class ListDirDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File file=new File("C:\\Users\\LJian\\Desktop\\used");
		//listDir(file);
		
		//diGui(1);
		//A();
	}
	//间接递归
	private static void A() {
		// TODO Auto-generated method stub
		System.out.println("A");
		B();
	}

	private static void B() {
		// TODO Auto-generated method stub
		System.out.println("B");
		C();
	}

	private static void C() {
		// TODO Auto-generated method stub
		System.out.println("C");
		A();
	}

	//直接递归
	private static void diGui(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
		diGui(i++);
		
	}

	private static void listDir(File file) {
		// TODO Auto-generated method stub
		//列出file文件夹里的所有文件和文件夹
		File[] listfile=file.listFiles();
	
		//遍历每个File对象
		for (File file2 : listfile) {
			if(file2.isFile()){
				System.out.println(file2);//如果是文件,直接打印
		}else{
			listDir(file2);//如果是文件夹,列出file2文件夹里的文件和文件夹
			}
		}
	}	

}
