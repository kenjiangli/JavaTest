package Day01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

/*
 * java写一个程序，实现从文件中读出文件内容，并将其打印在屏幕当中，并标注上行号
	如:
		1:hello
		2:world
		3:java
		4:helloworld

 */
public class Test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		
		//创建集合
		ArrayList<String> array=new ArrayList<String>();
		//缓冲输入
		BufferedReader br=new BufferedReader(new FileReader("Test02.txt"));
		
		//读取存入集合
		String line;
		while((line=br.readLine())!=null){
			array.add(line);
		}
		
		
		//释放
		br.close();
		
		//遍历
		for (int i = 0; i < array.size(); i++) {
			System.out.println((i+1)+":"+array.get(i));
			
		}
				 
	}

}
