package Day01;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

/*
 * 4.在当前项目根目录下有一个“qq.txt文件”里面存放的内容如下
 （项目根目录,假设qq号的长度最大为11位）
	58833442234
	12345
	67891
	12347809933
	98765432102
	67891
	12347809933	
	a.将该文件里面的所有qq号都存放在ArrayList中
	b.将ArrayList中重复元素删除,遍历删除重复元素后的ArrayList集合
 */
public class Test04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//创建集合
		ArrayList<String> array=new ArrayList<String>();
		
		
		
		//输出读取
		BufferedReader br=new BufferedReader(new FileReader("qq.txt"));
		
		String line;
		while((line=br.readLine())!=null){
			array.add(line);
		}
		br.close();
		
		//遍历
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (array.get(i).equals(array.get(j))) {
					array.remove(i);
					//array.remove(j);
					i--;
					j--;
				}
			
			
			}
		
			}
		
		//再次遍历获得删除后的元素
		for (int z = 0; z < array.size(); z++) {
			System.out.println(array.get(z));
	
		}
			
	
			
			
		}
		
		
	
	}


