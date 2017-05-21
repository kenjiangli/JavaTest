package Day14;

/*
 * 进程指正在运行的陈谷,确切的来说,当一个程序进行内存运行,即变成一个
 * 进程,进程是处于运行过程中的程序,并且具有一定独立功能
 * 
 * 正在运行的程序才能成为进程
 * 
 * 线程是进程的一个执行单元,程序中的代码都是由多线程来执行的
 * 
 * 一个进程至少有一个线程,一个进程中有多个线程,这个程序也可以称为多线程程序
 * 
 *	一个进程中有一个主线程
 *
 * 一个线程做事情的话,只能一件一件事情做,一件事情没有做完就不能做下一件事情
 *
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		sellBaoZi();
		sellShaoBing();
		sellYouTiao();
	}
	
	public static void sellYouTiao() {
		String s = "";
		for (int i = 0; i < 20000; i++) {
			s += i;
		}
		System.out.println("卖了一个油条");
	}
	
	public static void sellShaoBing() {
		String s = "";
		for (int i = 0; i < 20000; i++) {
			s += i;
		}
		System.out.println("卖了一个烧饼");
	}
	
	public static void sellBaoZi() {
		String s = "";
		for (int i = 0; i < 20000; i++) {
			s += i;
		}
		System.out.println("卖了一个包子");
	}

}




















































































