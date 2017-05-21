package Day12;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/*
 * 打印流
 * 
 * PrintStream: PrintStream 为其他输出添加了功能,打印各种数据比较方便
 * PringWriter:
 * PrintWriterbi PrintStream多一个钩子方法:PrintWriter(Writer out)
 * 
 * PringStream/PrintWriter
 * 只有输出,没有输入,打印各种数据比较方便,写数据的方法不会抛出异常
 * 
 * print方法和Write方法的区别
 * 	write写字节等内容
 * 	print原样输出
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
		
		//启动自动刷新
		
		PrintWriter pw=new PrintWriter(new FileWriter("pw.txt"),true);
		
		// print方法和write方法的区别
//		pw.print(false);
//		pw.println("\r\n");
//		pw.write(100);
		
		pw.println("中国");
		pw.println(false);
		pw.println(1.1);
		pw.println(10L);
	}

	private static void method01() throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream ps=new PrintStream("ps.txt");
		ps.println("中国");
		ps.println(false);
		ps.println(1.1);
		ps.print(10L);
		//ps.close();
	}
	

}





























































































