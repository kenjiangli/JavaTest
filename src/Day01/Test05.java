package Day01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 5.��һ���ı� "  anglebaby Ů 18 515151511  " 
   �ֱ�����һ����,����,�Ա�,����(String),QQ������Ϣ,�����������:
   1. ����һ��Person��,�����Ա�,�Ա�,�����QQ��������,ʹ�ý���������Ϣ����һ��Person����,����ӡ�������Ϣ
   2. ���ж�QQ���Ƿ�Ϸ�.(ȫ����������,��һλ��0,����Ϊ5��12λ��Ϊ�Ϸ�) 
 */
public class Test05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//��������
		ArrayList<String> array=new ArrayList<String>();
		
		//��������
		Person p=new Person();
		
		//���������
		BufferedReader br=new BufferedReader(new FileReader("angelababy.txt"));
		
		//��ȡ
		String line;
		while((line=br.readLine())!=null){
			String[] s=line.split(" ");
			
			p.setName(s[0]);
			p.setSex(s[1]);
			p.setAge(s[2]);
			p.setQq(s[3]);
			
			}
		
		br.close();
		
		//���뼯��
		array.add(p.getName());
		array.add(p.getSex());
		array.add(p.getAge());
		array.add(p.getQq());
		
		
		//����
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		
		//�ж�qq�Ƿ�Ϸ�
		if(p.getQq().startsWith("0")){
			System.out.println("��qq�Ϸ�");
		}else if(p.getQq().length()>=5&&p.getQq().length()<=12){
			System.out.println("��qq�Ϸ�");
		}else{
			System.out.println("��qq���Ϸ�");
		}
		
		
		}
	
	}



