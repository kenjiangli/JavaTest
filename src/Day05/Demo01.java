package Day05;

/*
 *异性/同性
 *
 *异常:不正常的情况
 *
 *java中的异常:
 *throwable:是jaca语言中所有错误或异常的超类/父类
 *	Error:严重问题
 *	Exception:异常
 * 	RuntimeException:运行时可能会发生的异常
 * 
 * 异常有两种处理方式
 * 1.try....catch...finally
 * 2.throws
 * 
 * 
 * try..catch...finally格式
 * 		try{
 * 		//可能会出现问题的代码
 * 		} catch (异常类名 变量名) {
 * 			//处理异常的代码
 * 
 *         }finally{
 *         //一定会执行到,一般在这里释放资源
 *         
 *         }
 *  
 *  简化:
 *  try{
 * 		//可能会出现问题的代码
 * 		} catch (异常类名 变量名) {
 * 			//处理异常的代码
 * 
 *         }
 *  	       
 *  try写在方法中;
 *  try中的代码尽量的少
 *  try处理异常后,程序会接着执行
 *  try里面的代码一旦出现问题就走catch,不会再走出问题后面的代码
 *         
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		
		try{
		int re=divide(a,b);//try里面的代码一旦出现问题就走catch,不会再走出问题后面的代码
		System.out.println(re);
		}catch(ArithmeticException e){
			System.out.println("计算错误");
		}
		System.out.println("运算结束");
	}

	private static int divide(int a, int b) {
		// TODO Auto-generated method stub
		int c=a/b;
		System.out.println(c);
		return c;
	}

}















































