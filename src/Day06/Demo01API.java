package Day06;
// 文档注释,在到处API中可以看到这些注释
// //*内容*/

/*
 * 单行注释
 * 多行注释
 * 文档注释:在导出APi可以看到这些注释
 * 
 * 要自己导出API文档:
 * 		1.在类中写好文档注释
 * 		2.项目右键->Export->Java->javadoc->选择要导出的类->选择路径->finish
 */

/**
 * 演示Test
 * @author LJian
 *
 */
public class Demo01API {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 存钱
	 * @param a 要存的钱
	 * @param b	余额
	 * @return
	 */
	public static int sum(int a,int b){
		return a+b;
		
	}
	
	/**
	 * 存钱2
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int sum(int a,int b,int c){
		return a+b+c;
		
	}
	
	/**
	 * 存钱方法3
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @return
	 */
	public static int sum(int a,int b,int c,int d){
		return a+b+c+d;
		
	}
}
















































