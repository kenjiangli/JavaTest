package Day10;

import java.io.File;

/*
 * Filed��ɾ������
 * boolean delete():ɾ���ļ����ļ���,��ֱ��ɾ��,�����ڻ���վ
 * ֻ��ɾ�����ļ���
 */
public class FileDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method01();
		//method02();
		method03();
	}
	//ɾ�����ļ����ļ���
		private static void method03() {
			// TODO Auto-generated method stub
			File file=new File("C:\\Users\\LJian\\Desktop\\used\\newfolder2");
			boolean delete=file.delete();
			System.out.println(delete);
		}
	
	//ɾ���ļ���
	private static void method02() {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\newfolder");
		boolean delete=file.delete();
		System.out.println(delete);
	}

	//ɾ���ļ�
	private static void method01() {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used\\test.java");
		boolean delete=file.delete();
		System.out.println(delete);
		
	}

}
