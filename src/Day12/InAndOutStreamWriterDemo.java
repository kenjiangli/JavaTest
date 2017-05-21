package Day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * OutputStreamWriter:是字符流通向字节流的桥梁
 * 
 * 构造方法:
 * 		OutputStreamWriter(OutputStream out):创建使用默认字符编码的OutputStreamWriter.
 * 		中文的windows操作系统默认的是GBK
 * 
 * 		OutputStreamWriter(OutputStream out,String charsetName):创建使用指定字符集的OutputStreamWriter
 * 		charsetName:GBK/gbk UTF-8/utf-8
 * 
 * 		OutputStreamWriter写数据的方法和FileWriter一样是字节流,都是继承自Write
 */
public class InAndOutStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		writeCNByDefault();
		writeCNByGBK();
		writeCNBYUTF8();
	}

	//UTF-8
	private static void writeCNBYUTF8() throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
	OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("cnUTF8.txt"),"UTF-8");
	osw.write("中国");	// 11100100 10111101 10100000 11100101 10100101 10111101
	osw.close();
	
	}

	//GBK
	private static void writeCNByGBK() throws IOException {
		// TODO Auto-generated method stub
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("cnGBK.txt"),"GBK");
		osw.write("中国");// 11000100 11100011 10111010 11000011
		osw.close();
	}

	//使用默认编码写中文
	private static void writeCNByDefault() throws IOException {
		// TODO Auto-generated method stub
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("cn.txt"));
		
		osw.write("中国");// 11000100 11100011 10111010 11000011
		osw.close();
		
	}

}



























































