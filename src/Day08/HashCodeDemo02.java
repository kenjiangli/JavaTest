package Day08;

import java.util.HashSet;

public class HashCodeDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		System.out.println("����".hashCode());
		System.out.println("����".hashCode());
		System.out.println("ͨ��".hashCode());
		System.out.println("�ص�".hashCode());
		
		hs.add("����");
		hs.add("����");
		hs.add("ͨ��");
		hs.add("�ص�");
		for (String string : hs) {
			System.out.println(string);
		}
	}

}
