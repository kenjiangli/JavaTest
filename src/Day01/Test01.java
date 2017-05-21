package Day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 1.用代码实现以下需求
	(1)有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔),统计每个单词出现的次数
	(2)打印格式：
		to=3
		think=1
		you=2
		//........
	(3)按照上面的打印格式将内容写入到D:\\count.txt文件中(要求用缓冲流)
	
 */

public class Test01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//定义字符串
		String s="If you want to change your fate I think you must come to the dark horse to learn java";
		
		//定义数组
		String[] s1=s.split(" ");
		//定义集合
		ArrayList<String> array=new ArrayList<String>();
		
		//存入集合
		for (int i = 0; i < s1.length; i++) {
			array.add(s1[i]);
		}
		
		//写入方法
		write(array);
		

}

	private static void write(ArrayList<String> array) throws IOException {
		// TODO Auto-generated method stub
		
		//设置次数
		int sum=0;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		int sum5=0;
		int sum6=0;
		int sum7=0;
		int sum8=0;
		int sum9=0;
		int sum10=0;
		int sum11=0;
		int sum12=0;
		int sum13=0;
		int sum14=0;
		int sum15=0;
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).equals("If")){
				sum++;
			}else if(array.get(i).equals("you")){
				sum1++;
			}else if(array.get(i).equals("want")){
				sum2++;
			}else if(array.get(i).equals("to")){
				sum3++;
			}else if(array.get(i).equals("change")){
				sum4++;
			}else if(array.get(i).equals("your")){
				sum5++;
			}else if(array.get(i).equals("fate")){
				sum6++;
			}else if(array.get(i).equals("I")){
				sum7++;
			}else if(array.get(i).equals("think")){
				sum8++;
		}else if(array.get(i).equals("must")){
			sum9++;
		}else if(array.get(i).equals("come")){
			sum10++;
		}else if(array.get(i).equals("the")){
			sum11++;
		}else if(array.get(i).equals("dark")){
			sum12++;
		}else if(array.get(i).equals("horse")){
			sum13++;
		}else if(array.get(i).equals("learn")){
			sum14++;
		}else if(array.get(i).equals("java")){
			sum15++;
		}
		
	}
		System.out.println("If="+sum);
		System.out.println("you="+sum1);
		System.out.println("want="+sum2);
		System.out.println("to="+sum3);
		System.out.println("change="+sum4);
		System.out.println("your="+sum5);
		System.out.println("fate="+sum6);
		System.out.println("I="+sum7);
		System.out.println("think="+sum8);
		System.out.println("must="+sum9);
		System.out.println("come="+sum10);
		System.out.println("the="+sum11);
		System.out.println("dark="+sum12);
		System.out.println("horse="+sum13);
		System.out.println("learn="+sum14);
		System.out.println("java="+sum15);
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("count.txt"));
		String s1="If="+sum;
		String s2="you="+sum1;
		String s3="want="+sum2;
		String s4="to="+sum3;
		String s5="change="+sum4;
		String s6="your="+sum5;
		String s7="fate="+sum6;
		String s8="I="+sum7;
		String s9="think="+sum8;
		String s10="must="+sum9;
		String s11="come="+sum10;
		String s12="the="+sum11;
		String s13="dark="+sum12;
		String s14="horse="+sum13;
		String s15="learn="+sum14;
		String s16="java="+sum15;
		
		//写入
		bw.write(s1);
		bw.newLine();
		bw.flush();
		bw.write(s2);
		bw.newLine();
		bw.flush();
		bw.write(s3);
		bw.newLine();
		bw.flush();
		bw.write(s4);
		bw.newLine();
		bw.flush();
		bw.write(s5);
		bw.newLine();
		bw.flush();
		bw.write(s6);
		bw.newLine();
		bw.flush();
		bw.write(s7);
		bw.newLine();
		bw.flush();
		bw.write(s8);
		bw.newLine();
		bw.flush();
		bw.write(s9);
		bw.newLine();
		bw.flush();
		bw.write(s10);
		bw.newLine();
		bw.flush();
		bw.write(s11);
		bw.newLine();
		bw.flush();
		bw.write(s12);
		bw.newLine();
		bw.flush();
		bw.write(s13);
		bw.newLine();
		bw.flush();
		bw.write(s14);
		bw.newLine();
		bw.flush();
		bw.write(s15);
		bw.newLine();
		bw.flush();
		bw.write(s16);
		bw.newLine();
		bw.flush();
		
		
		//释放
		bw.close();
		
	}
}