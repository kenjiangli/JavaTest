package Day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * ��windowsϵͳ�з�Ϊ������:�ļ�,Ŀ¼,·��,File���Ǳ�ʾ��������
 * static String pathSeparartor:��ϵͳ��صĶ��·��֮��ķָ��� ��windowsʱ��";".��linux��":"
 * 
 * static String separator:��ϵͳ�йص�Ĭ�����Ʒָ���.��Windows��"\".��linuxϵͳ����"/"
 * 
 * File��:���ļ�.Ŀ¼(�ļ���),·���������ʾ��ʽ
 * 
 */
public class FileDemo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(File.pathSeparator);//�ڶ����ͬ·��֮��ʹ�õķָ���,��������path
		System.out.println(File.separator);
		
		
		
		//�ı��ļ�����->��Buffer-�ַ����鷽ʽ
		//�ַ���ֻ�ܲ����ļ�,���ܲ����ļ���
		BufferedReader br=new BufferedReader(new FileReader("test02.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("test02.txt"));
		
		//����
//		String line=null;
//		while((line=br.readLine())!=null){
//			bw.write(line);
//		}
		
		//����,��һ������,дһ������
		char[] ch=new char[1024];
		int len=0;
		
		while((len=br.read(ch))!=-1){
			bw.write(ch, 0, len);
		}
		bw.close();
		br.close();
	}

}























































































