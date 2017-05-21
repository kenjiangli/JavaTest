package Day05;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * 异常的好处
 * 
 * 在哪些方面可以使用到异常
 * 	1.IO流
 * 	2.数据库操作
 * 	3.xml分析
 * 	4.网络
 * 	5.自己定义异常
 * 	6.银行项目...用户信息异常,转账异常,登录异常
 * 
 * 
 */
public class ExceptionBenefitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 编译时异常,在写代码的阶段就会提示我们这行可能有问题.
		// 我们就尽早的处理好了.在开发阶段就解决了
		
		try {
			FileReader fr = new FileReader("");
		} catch (FileNotFoundException e) {
			System.out.println("文件没有找到");
			// 我们可以对异常进行处理.按我们的来
			// 程序还可以继续执行.
		}
		
		// 运行时异常,即使不处理.我们也可以看到错误信息,知道什么原因.知道在哪行,修改代码
		int c = 10 / 1;
	}

}
