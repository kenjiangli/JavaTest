package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/*
 * 转换流:
 * 	InputStreamReader/OutputStreamWriter
 * 
 * 	InputStreamReader:是字节流通向字符流的桥梁
 * 
 *	InputStreamReader(InputStream in):使用默认码表
 *	InputStreamReader(InputStream in,String charsetName):指定码表
 *
 *	用什么编码保存就用什么编码读取
 * 
 */
public class demoInputStreamReader {


	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//readCNByDefault();
		//readCNByGBK();
		//readCNByUTF();
		//readCNUTFToGBK();
		readCNGBKToUTF();
	}

	private static void readCNGBKToUTF() throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
InputStreamReader isr=new InputStreamReader(new FileInputStream("cnGBK.txt"),"UTF-8");
		
		int ch=0;
		while((ch=isr.read())!=-1){
			System.out.print((char)ch);
		}
		
		isr.close();
	}

	// 将utf.txt中的数据,使用gbk来读取
	private static void readCNUTFToGBK() throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
	InputStreamReader isr=new InputStreamReader(new FileInputStream("cnUTF8.txt"),"GBK");
		
		int ch=0;
		while((ch=isr.read())!=-1){
			System.out.print((char)ch);
		}
		
		isr.close();
	}

	private static void readCNByUTF() throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(new FileInputStream("cnUTF8.txt"),"UTF-8");
		
		int ch=0;
		while((ch=isr.read())!=-1){
			System.out.print((char)ch);
		}
		
		isr.close();
	}

	private static void readCNByGBK() throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(new FileInputStream("cnGBK.txt"),"GBK");
		
		//读取数据
		int ch=0;
		while((ch=isr.read())!=-1){
			System.out.print((char)ch);
			
		}
		isr.close();
		
	}

	private static void readCNByDefault() throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(new FileInputStream("cn.txt")); 
		
		//读取数据
		int ch=0;
		while((ch=isr.read())!=-1){
			System.out.print((char)ch);
		}
		isr.close();
	}

}













































































