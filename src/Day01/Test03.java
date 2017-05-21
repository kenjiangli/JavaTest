package Day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 3.从键盘接受多个学生分数[0, 100],直到用户输入-1结束,
       要求:把所有的分数按倒(指的是录入分数的先后顺序,不是分数高低顺序)
       序写到D:\\number.txt中(要求使用缓冲流)
 */
public class Test03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//键盘录入
		Scanner sc=new Scanner(System.in);
		
		String s="";
		
		//多个学生分数直至用户输入到-1结束
		while(true){
			System.out.println("请输入学生分数1-100");
			int number=sc.nextInt();
			
			if(number==-1){
				break;
				
		}else if(number<=100&&number>=1){
			s+=number+" ";
			continue;
		}
		
	}
		
		//反转
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
		String s3=sb.toString();
		
		//输入流
		BufferedWriter bw=new BufferedWriter(new FileWriter("number.txt"));
		bw.write(s3);
		//释放
		bw.close();
		

}
}
