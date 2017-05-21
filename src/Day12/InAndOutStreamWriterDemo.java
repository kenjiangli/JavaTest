package Day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * OutputStreamWriter:���ַ���ͨ���ֽ���������
 * 
 * ���췽��:
 * 		OutputStreamWriter(OutputStream out):����ʹ��Ĭ���ַ������OutputStreamWriter.
 * 		���ĵ�windows����ϵͳĬ�ϵ���GBK
 * 
 * 		OutputStreamWriter(OutputStream out,String charsetName):����ʹ��ָ���ַ�����OutputStreamWriter
 * 		charsetName:GBK/gbk UTF-8/utf-8
 * 
 * 		OutputStreamWriterд���ݵķ�����FileWriterһ�����ֽ���,���Ǽ̳���Write
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
	osw.write("�й�");	// 11100100 10111101 10100000 11100101 10100101 10111101
	osw.close();
	
	}

	//GBK
	private static void writeCNByGBK() throws IOException {
		// TODO Auto-generated method stub
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("cnGBK.txt"),"GBK");
		osw.write("�й�");// 11000100 11100011 10111010 11000011
		osw.close();
	}

	//ʹ��Ĭ�ϱ���д����
	private static void writeCNByDefault() throws IOException {
		// TODO Auto-generated method stub
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("cn.txt"));
		
		osw.write("�й�");// 11000100 11100011 10111010 11000011
		osw.close();
		
	}

}



























































