package Day10;
//递归求 1 - 5的和
public class ListDirDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=getSum(5);
		System.out.println(sum);
		
		method();
	}

	private static void method() {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 0; i <=5; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	//递归求和
	private static int getSum(int i) {
		// TODO Auto-generated method stub
		if(i==1){
		return 1;//出口
		}
		return i+getSum(i-1);//5+4+3+2+1
	}

}
