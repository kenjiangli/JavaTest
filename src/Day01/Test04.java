package Day01;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

/*
 * 4.�ڵ�ǰ��Ŀ��Ŀ¼����һ����qq.txt�ļ��������ŵ���������
 ����Ŀ��Ŀ¼,����qq�ŵĳ������Ϊ11λ��
	58833442234
	12345
	67891
	12347809933
	98765432102
	67891
	12347809933	
	a.�����ļ����������qq�Ŷ������ArrayList��
	b.��ArrayList���ظ�Ԫ��ɾ��,����ɾ���ظ�Ԫ�غ��ArrayList����
 */
public class Test04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//��������
		ArrayList<String> array=new ArrayList<String>();
		
		
		
		//�����ȡ
		BufferedReader br=new BufferedReader(new FileReader("qq.txt"));
		
		String line;
		while((line=br.readLine())!=null){
			array.add(line);
		}
		br.close();
		
		//����
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
		
		//�ٴα������ɾ�����Ԫ��
		for (int z = 0; z < array.size(); z++) {
			System.out.println(array.get(z));
	
		}
			
	
			
			
		}
		
		
	
	}


