package Day08;

import java.util.ArrayList;

//List�ӿڵ��ص���:Ԫ�ؿ����ظ�,�洢��˳��,������

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("iron");
		arr.add("metal");
		arr.add("gun");
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
