package Day12;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ת�������ַ���������
 * 
 * 	Write:�ַ�������ĸ���
 * 		|-OutputStreamWriter:�ַ���ͨ���ֽ���������,����ָ�����
 * 			|-FileWriter:ʹ��Ĭ�����
 * 
 * Reader:�ַ��������ĸ���
 * 		|-InputStreamReader:�ֽ���ͨ���ַ���������,����ָ�����
 * 			|-FileReader:ʹ��Ĭ�����
 * 
 * �����Ҫָ�����ʹ��OutputStreamWriter/InputStreamWriter
 * �������Ҫָ�����:FileWriter/FileReader
 * 
 * �ַ���=�ֽ���+���
 */
public class StreamAndFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		OutputStreamWriter(new FileOutputStream(fileName));
		FileWriter fr = new FileWriter("abc.txt");
	}

}





































































































