package Day10;

import java.io.File;

//列出所有java文件
public class GetJavaFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.创建file对象
		File file=new File("C:\\Users\\LJian\\Desktop\\used");
		
		//2.列出file里面的内容
		File[] listFiles=file.listFiles();
		
		//3.遍历获取每个File对象
		for (File file2 : listFiles) {
			if(file2.isFile()){
				// 是文件,判断以java结尾
				// HelloWorld - 副本.JaVa -> HelloWorld - 副本.java
				if(file2.getName().endsWith("java")){
					System.out.println(file2);
				}
			}
		}
	}

}


























































































