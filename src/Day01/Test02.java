package Day01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

/*
 * javaдһ������ʵ�ִ��ļ��ж����ļ����ݣ��������ӡ����Ļ���У�����ע���к�
	��:
		1:hello
		2:world
		3:java
		4:helloworld

 */
public class Test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		
		//��������
		ArrayList<String> array=new ArrayList<String>();
		//��������
		BufferedReader br=new BufferedReader(new FileReader("Test02.txt"));
		
		//��ȡ���뼯��
		String line;
		while((line=br.readLine())!=null){
			array.add(line);
		}
		
		
		//�ͷ�
		br.close();
		
		//����
		for (int i = 0; i < array.size(); i++) {
			System.out.println((i+1)+":"+array.get(i));
			
		}
				 
	}

}
