package Day01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 5.有一段文本 "  anglebaby 女 18 515151511  " 
   分别描述一个人,姓名,性别,年龄(String),QQ号码信息,完成如下需求:
   1. 创建一个Person类,包含性别,性别,年龄和QQ号码属性,使用解析出来信息创建一个Person对象,并打印这个人信息
   2. 并判断QQ号是否合法.(全部都是数字,第一位非0,长度为5到12位即为合法) 
 */
public class Test05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//创建集合
		ArrayList<String> array=new ArrayList<String>();
		
		//创建对象
		Person p=new Person();
		
		//输出缓冲流
		BufferedReader br=new BufferedReader(new FileReader("angelababy.txt"));
		
		//读取
		String line;
		while((line=br.readLine())!=null){
			String[] s=line.split(" ");
			
			p.setName(s[0]);
			p.setSex(s[1]);
			p.setAge(s[2]);
			p.setQq(s[3]);
			
			}
		
		br.close();
		
		//存入集合
		array.add(p.getName());
		array.add(p.getSex());
		array.add(p.getAge());
		array.add(p.getQq());
		
		
		//遍历
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		
		//判断qq是否合法
		if(p.getQq().startsWith("0")){
			System.out.println("该qq合法");
		}else if(p.getQq().length()>=5&&p.getQq().length()<=12){
			System.out.println("该qq合法");
		}else{
			System.out.println("该qq不合法");
		}
		
		
		}
	
	}



