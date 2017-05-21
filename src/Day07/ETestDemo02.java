package Day07;

public class ETestDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr={3,6,1,8};
		String[] arr2={"a","b","c"};
		Double[] arr3={1.1,3.1,2.1};
		print(arr);
		print(arr2);
		print(arr3);
		
	}
	
	//使用泛型方时候不能是基本数据类型
	public static <T> void print(T[] arr){
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1){
				sb.append(arr[i]).append(",");//不是最后一位
			}else{
				sb.append(arr[i]).append("]");//最后一位
			}
		}
		System.out.println(sb);
	} 

}
















































