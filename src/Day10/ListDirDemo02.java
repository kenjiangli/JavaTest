package Day10;

import java.io.File;

/*
 *�ݹ��Ϊ����,ֱ�Ӻͼ�ӵݹ�
 *ֱ�ӵݹ�:ֻ�ڵ�ǰ�����ڵ����Լ�����������
 *��ӵݹ�,������A��������B����,B��������C����,C��������D����
 *
 */
public class ListDirDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File file=new File("C:\\Users\\LJian\\Desktop\\used");
		//listDir(file);
		
		//diGui(1);
		//A();
	}
	//��ӵݹ�
	private static void A() {
		// TODO Auto-generated method stub
		System.out.println("A");
		B();
	}

	private static void B() {
		// TODO Auto-generated method stub
		System.out.println("B");
		C();
	}

	private static void C() {
		// TODO Auto-generated method stub
		System.out.println("C");
		A();
	}

	//ֱ�ӵݹ�
	private static void diGui(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
		diGui(i++);
		
	}

	private static void listDir(File file) {
		// TODO Auto-generated method stub
		//�г�file�ļ�����������ļ����ļ���
		File[] listfile=file.listFiles();
	
		//����ÿ��File����
		for (File file2 : listfile) {
			if(file2.isFile()){
				System.out.println(file2);//������ļ�,ֱ�Ӵ�ӡ
		}else{
			listDir(file2);//������ļ���,�г�file2�ļ�������ļ����ļ���
			}
		}
	}	

}
