package Day12;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 转换流和字符流的区别
 * 
 * 	Write:字符输出流的父类
 * 		|-OutputStreamWriter:字符流通向字节流的桥梁,可以指定码表
 * 			|-FileWriter:使用默认码表
 * 
 * Reader:字符输入流的父类
 * 		|-InputStreamReader:字节流通向字符流的桥梁,可以指定码表
 * 			|-FileReader:使用默认码表
 * 
 * 如果需要指定码表使用OutputStreamWriter/InputStreamWriter
 * 如果不需要指定码表:FileWriter/FileReader
 * 
 * 字符流=字节流+码表
 */
public class StreamAndFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		OutputStreamWriter(new FileOutputStream(fileName));
		FileWriter fr = new FileWriter("abc.txt");
	}

}





































































































