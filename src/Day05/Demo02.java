package Day05;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method01();
		//method02();
		method03();
	}
	
	//���Դ����쳣�ĸ���,���ǲ���֪�������������
	private static void method03() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int[] arr = {1, 2, 3, 4, 5};
		
		/*
		 * try{
		 
			int re=a/b;
				System.out.println(re);
				System.out.println(arr[20]);
		    }
		    */
		
	}
	
	
	//try...catch..catch һ��try����Ŷ���쳣,catchԽ����Խ��--����
	private static void method02() {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int[] arr={1,2,3,4,5};
		try {
			int re=a/b;	// try����Ĵ���һ�������������catch,�������ߺ���Ĵ���
			System.out.println(re);
			System.out.println(arr[20]);
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("��������Խ���쳣");
		}
	}

	//try..catchһ��һ���쳣����
	private static void method01() {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try{
			int re=a/b;
			System.out.println(re);
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0");
		}
		
		int[] arr={1,2,3,4,5};
		try{
			System.out.println(arr[20]);
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("��������Խ���쳣");
		}
		System.out.println("end");
	}
}
