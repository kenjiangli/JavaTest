package Day10;

import java.io.File;

//�г�����java�ļ�
public class GetJavaFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.����file����
		File file=new File("C:\\Users\\LJian\\Desktop\\used");
		
		//2.�г�file���������
		File[] listFiles=file.listFiles();
		
		//3.������ȡÿ��File����
		for (File file2 : listFiles) {
			if(file2.isFile()){
				// ���ļ�,�ж���java��β
				// HelloWorld - ����.JaVa -> HelloWorld - ����.java
				if(file2.getName().endsWith("java")){
					System.out.println(file2);
				}
			}
		}
	}

}


























































































