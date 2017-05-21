package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/*
 * ת����:
 * 	InputStreamReader/OutputStreamWriter
 * 
 * 	InputStreamReader:���ֽ���ͨ���ַ���������
 * 
 *	InputStreamReader(InputStream in):ʹ��Ĭ�����
 *	InputStreamReader(InputStream in,String charsetName):ָ�����
 *
 *	��ʲô���뱣�����ʲô�����ȡ
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

	// ��utf.txt�е�����,ʹ��gbk����ȡ
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
		
		//��ȡ����
		int ch=0;
		while((ch=isr.read())!=-1){
			System.out.print((char)ch);
			
		}
		isr.close();
		
	}

	private static void readCNByDefault() throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(new FileInputStream("cn.txt")); 
		
		//��ȡ����
		int ch=0;
		while((ch=isr.read())!=-1){
			System.out.print((char)ch);
		}
		isr.close();
	}

}













































































