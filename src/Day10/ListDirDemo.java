package Day10;

import java.io.File;

/*
 *  File[] listFiles():只能列出这个文件夹里面的内容,如果子文件夹还有内容不会列出来
 *  
 *  递归遍历文件夹里面的所有内容
 *  
 *  分析:
 *  	1.写一个方法listDir(File file),列出file文件夹里面的文件和文件夹
 *  	2.遍历每个File对象
 *  		2.1.如果是文件,直接打印
 *  		2.2.如果是文件夹.listDir(File file)
 */
public class ListDirDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used");
		listDir(file);
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
