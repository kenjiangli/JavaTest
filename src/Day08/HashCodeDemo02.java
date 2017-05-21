package Day08;

import java.util.HashSet;

public class HashCodeDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		System.out.println("马云".hashCode());
		System.out.println("马化腾".hashCode());
		System.out.println("通话".hashCode());
		System.out.println("重地".hashCode());
		
		hs.add("马云");
		hs.add("马化腾");
		hs.add("通话");
		hs.add("重地");
		for (String string : hs) {
			System.out.println(string);
		}
	}

}
