package Day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 3.�Ӽ��̽��ܶ��ѧ������[0, 100],ֱ���û�����-1����,
       Ҫ��:�����еķ�������(ָ����¼��������Ⱥ�˳��,���Ƿ����ߵ�˳��)
       ��д��D:\\number.txt��(Ҫ��ʹ�û�����)
 */
public class Test03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//����¼��
		Scanner sc=new Scanner(System.in);
		
		String s="";
		
		//���ѧ������ֱ���û����뵽-1����
		while(true){
			System.out.println("������ѧ������1-100");
			int number=sc.nextInt();
			
			if(number==-1){
				break;
				
		}else if(number<=100&&number>=1){
			s+=number+" ";
			continue;
		}
		
	}
		
		//��ת
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
		String s3=sb.toString();
		
		//������
		BufferedWriter bw=new BufferedWriter(new FileWriter("number.txt"));
		bw.write(s3);
		//�ͷ�
		bw.close();
		

}
}
