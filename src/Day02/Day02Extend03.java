package Day02;

public class Day02Extend03 {

public static void main(String[] args) {
	Zi1 z=new Zi1();
	
	z.num1=10;//使用的是Fu的num1;
	z.num2=20;//使用的是Zi1=num2;
	z.showzi();//使用Zi1的zishow方法
	z.fushow();//使用Fu的fushow方法
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
