package Day02;

public class Day02Extend03 {

public static void main(String[] args) {
	Zi1 z=new Zi1();
	
	z.num1=10;//ʹ�õ���Fu��num1;
	z.num2=20;//ʹ�õ���Zi1=num2;
	z.showzi();//ʹ��Zi1��zishow����
	z.fushow();//ʹ��Fu��fushow����
}

}

class Fu{
	public int num1=1;
	
	public void fushow(){
		System.out.println("I  a m  F u");
	}
	
}

class Zi1 extends Fu{
	public int num2=1;
	
	public void showzi(){
		System.out.println("w o  s h i  z i");
	}
}
