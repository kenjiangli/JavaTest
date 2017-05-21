package Day10;

import java.io.File;

/*
 *  File[] listFiles():ֻ���г�����ļ������������,������ļ��л������ݲ����г���
 *  
 *  �ݹ�����ļ����������������
 *  
 *  ����:
 *  	1.дһ������listDir(File file),�г�file�ļ���������ļ����ļ���
 *  	2.����ÿ��File����
 *  		2.1.������ļ�,ֱ�Ӵ�ӡ
 *  		2.2.������ļ���.listDir(File file)
 */
public class ListDirDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\LJian\\Desktop\\used");
		listDir(file);
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
