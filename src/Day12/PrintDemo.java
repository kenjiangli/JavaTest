package Day12;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/*
 * ��ӡ��
 * 
 * PrintStream: PrintStream Ϊ�����������˹���,��ӡ�������ݱȽϷ���
 * PringWriter:
 * PrintWriterbi PrintStream��һ�����ӷ���:PrintWriter(Writer out)
 * 
 * PringStream/PrintWriter
 * ֻ�����,û������,��ӡ�������ݱȽϷ���,д���ݵķ��������׳��쳣
 * 
 * print������Write����������
 * 	writeд�ֽڵ�����
 * 	printԭ�����
 * 
 */
public class PrintDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//method01();
		method02();
		
	}

	private static void method02() throws IOException {
		// TODO Auto-generated method stub
		
		//�����Զ�ˢ��
		
		PrintWriter pw=new PrintWriter(new FileWriter("pw.txt"),true);
		
		// print������write����������
//		pw.print(false);
//		pw.println("\r\n");
//		pw.write(100);
		
		pw.println("�й�");
		pw.println(false);
		pw.println(1.1);
		pw.println(10L);
	}

	private static void method01() throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream ps=new PrintStream("ps.txt");
		ps.println("�й�");
		ps.println(false);
		ps.println(1.1);
		ps.print(10L);
		//ps.close();
	}
	

}





























































































