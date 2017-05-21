package Day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 在windows系统中分为三部分:文件,目录,路径,File就是表示这三部分
 * static String pathSeparartor:与系统相关的多个路径之间的分隔符 在windows时候";".在linux是":"
 * 
 * static String separator:与系统有关的默认名称分隔符.在Windows是"\".在linux系统中是"/"
 * 
 * File类:是文件.目录(文件夹),路径名抽象表示形式
 * 
 */
public class FileDemo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(File.pathSeparator);//在多个不同路径之间使用的分隔符,环境变量path
		System.out.println(File.separator);
		
		
		
		//文本文件拷贝->带Buffer-字符数组方式
		//字符流只能操作文件,不能操作文件夹
		BufferedReader br=new BufferedReader(new FileReader("test02.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("test02.txt"));
		
		//复制
//		String line=null;
//		while((line=br.readLine())!=null){
//			bw.write(line);
//		}
		
		//复制,读一个数组,写一个数组
		char[] ch=new char[1024];
		int len=0;
		
		while((len=br.read(ch))!=-1){
			bw.write(ch, 0, len);
		}
		bw.close();
		br.close();
	}

}























































































