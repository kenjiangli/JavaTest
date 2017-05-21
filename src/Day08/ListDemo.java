package Day08;

import java.util.ArrayList;

//List接口的特点是:元素可以重复,存储有顺序,有索引

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
