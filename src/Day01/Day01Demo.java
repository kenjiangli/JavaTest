package Day01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����СƱ����
 * ���ܷ���:
 * 	����1:��ӭ���������߼�
 * 		1.�����ʾ��Ϣ
 * 		2.����¼��
 * 		3.switchƥ��
 * 		4.ѭ��(��֪�����ٴ�while(true))
 * 
 * 	����2:�����Ʒ
 * 		1.����¼����Ʒ��Ϣ
 * 		2.ID�ظ����ж�
 * 		3.������Ʒ��Ϣ��������
 * 		4.��ӵ����
 * 
 * 	����3:�鿴��Ʒ
 * 		1.��������е���Ʒ
 * 		2.����һ������ʽ���
 *
 *  ����4:������Ʒ
 *  	1.�������
 *  	2.��ʾ�û��Ƿ���Ҫ����
 *  	3.���������Ʒ�ŵ����ﳵ��
 *  	
 *  ����5:��ӡСƱ
 *  	1.̧ͷ.ֱ�����
 *  	2.�м�,�������Ʒ.�ܼ���Ҫ�����,����ʽ���
 *  	3.Ʊ��:������Ʒ���������������������
 *  
 *  ����6:�˳�
 *  	
 *  ʹ�õ��ļ�����:
 *  	1.��� println()
 *  	2.����¼�� Scanner
 *  	3.ѭ��while/for
 *  	4.�ж�if/switch
 *  	5.IO
 *  	6.ArrayList(���)
 *  	7.��������
 *  	8.�����
 *  	9.��Ķ���
 *  	10.���巽������ɹ���
 *  
 *  ʵ�ֲ���:
 *  	1.������Ʒ��(GoodsItem)
 *  	2.�����������߼�
 *  	3.�����Ʒ
 *  	4.�鿴��Ʒ
 *  	5.������Ʒ
 *  	6.��ӡСƱ
 *  	7.�˳�
 *  
 * 
 */
public class Day01Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//����Ʒ���뼯��
		ArrayList<GoodsItem> items =new ArrayList<GoodsItem>();
		initGoods(items);
		
		
		//���ﳵ����
		ArrayList<GoodsItem> cart=null;
		
		//������ʾ��Ϣ
		Scanner sc=new Scanner(System.in);
		
		
		//�����ظ�����ϵͳ
		while(true){
		//��ӭ����
		System.out.println("��ӭʹ�ó��й���ϵͳ");
		
		System.out.println("1.�����Ʒ");
		System.out.println("2.�鿴��Ʒ");
		System.out.println("3.������Ʒ ");
		System.out.println("4.��ӡСƱ ");
		System.out.println("5.�˳�");
		
		//����¼��ѡ��1-5
		System.out.println("��������Ҫ���еĲ���:");
		int chooseNum=sc.nextInt();
		
		//ͨ������¼��,switch��ѡ��ѡ��1-5
		switch(chooseNum){
		case 1:
			//�����Ʒ����
			addGoods(items);
			break;
		case 2:
			//������Ʒ
			findGoods(items);
			break;
		case 3:
			//������Ʒ
			cart=buyGoods(items);
			break;
		case 4:
			//���ﳵ��ӡСƱ
			print(cart);
			break;
		case 5:
			//ϵͳ�˳�
			System.exit(0);
			break;
		default:
			System.out.println("�������,������ѡ��");
			break;
		}
		
		}
	}
	
	private static void print(ArrayList<GoodsItem> cart) {
		// TODO Auto-generated method stub
		
		//�жϹ��ﳵ����û����Ʒ
		if(cart==null){
			System.out.println("���ﳵû����Ʒ,��ǰ������");
			return;
		}
		
		//�����ﳵ����Ʒ,��ӡСƱ
		System.out.println("\t\t��ӭ����");
		System.out.println("Ʒ��\t\t����\t����\t����\t�ܼ�");
		
		//ÿ����Ʒ���������
		int totalConut=0;
		
		//�ܼ�
		double totalPrice=0;
		
		//������ӡ
		for (int i = 0; i < cart.size(); i++) {
			GoodsItem item=cart.get(i);
			//ÿ����Ʒ���ܼ�
			double price=item.getPrice()*item.getCount();
			//��Ʒ��������
			totalConut+=item.getCount();
			
			//�ܼ�
			totalPrice+=price;
			
			//���ÿ����Ʒ
			System.out.println(item.getName()+"\t\t"+item.getId()+"\t"+
							item.getPrice()+"\t"+item.getCount()+"\t"+price);
			
		}
		
		//�����
		System.out.println("��"+cart.size()+"����Ʒ");
		System.out.println("��"+totalConut+"����Ʒ");
		System.out.println("��"+totalPrice+"Ԫ");
	}

	//������Ʒ����
	//1.������Ʒid,�ж���Ʒ�Ƿ����
	//2.���빺������,�����Ҫ������Ʒ����
	//3.�����ظ�ʹ��,-1��ʾ����
		private static ArrayList<GoodsItem> buyGoods(ArrayList<GoodsItem> items) {
			
		// TODO Auto-generated method stub
			
		
			
			
			//�������ﳵ����
			ArrayList<GoodsItem> cart=new ArrayList<GoodsItem>();
			//����¼��
			Scanner sc=new Scanner(System.in);
			
			//�ظ�����,ʹ��whileѭ��
			while(true){
				System.out.println("�����빺����Ʒ��id(-1��ʾ����)");
				String id=sc.next();
				
				//�ж��Ƿ���id
				for (int i = 0; i < items.size(); i++) {
					GoodsItem item=items.get(i);
					if(id.equals(item.getId())){
						
						//���빺������
						System.out.println("�����빺��ĸ���,��ǰʣ��"+item.getCount()+"��");
						int count=sc.nextInt();
						
						//�ж��Ƿ���ڿ��
						if(item.getCount()-count<0){
							System.out.println("��治��,����������");
						}else{
							//�Ѽ���¼����������������
							
							GoodsItem buyItem=new GoodsItem(item.getName(),id,item.getPrice(),count);
							
							//���
							System.out.println("������"+buyItem.getName()+",������"+buyItem.getCount());
							
							//�޸�ʣ��Ŀ������
							item.setCount(item.getCount()-count);
							
							//���빺�ﳵ
							cart.add(buyItem);
							break;
							
						}
						
					}
				}
				
				//���Ϊ-1����ͣ
				if(id.equals("-1")){
					System.out.println("��������");
					break;
				}
			}
			return cart;
		
	}
	//�鿴��Ʒ����
	private static void findGoods(ArrayList<GoodsItem> items) {
		// TODO Auto-generated method stub
		//ͷ
		System.out.println("\t  ��ӭ����,������������Ʒ");
		System.out.println("Ʒ��\t\t����\t����\t���");
		
		//��
		//�õ�ÿ����Ʒ
		for (int i = 0; i <items.size(); i++) {
			GoodsItem item=items.get(i);
			
			//��ȡÿ����Ʒ��Ϣ,��һ����ʽ���
			System.out.println(item.getName()+"\t\t"+item.getId()+"\t"+item.getPrice()+"\t"+item.getCount());
		}
		
		//��
		System.out.println("==========�����ǿ����Ʒ===========");
		
		
	}

	//�����Ʒ����
	private static void addGoods(ArrayList<GoodsItem> items) {
		// TODO Auto-generated method stub
		
		//������Ʒ��id
		Scanner sc=new Scanner(System.in);
		//ʹ��whileѭ����������
		while(true){
		System.out.println("��������Ʒ��id");
		String id=sc.next();
		
		//falseΪ���ظ�
		boolean flag=false;
		//���������Ʒ
		for (int i = 0; i < items.size(); i++) {
			//���ϴ������
			GoodsItem item=items.get(i);
			
			//�ж��Ƿ��ظ�
			if(id.equals(item.getId())){
				flag=true;//�ظ�����ֹ
				break;
		}
		}
		
		//ѭ������ʱflag��true
		if(flag){
			System.out.println("id�ظ�");
		}else{
				//������Ʒ����
				System.out.println("��������Ʒ����");
				String name=sc.next();
				
				//������Ʒ�۸�
				System.out.println("��������Ʒ�۸�");
				Double price=sc.nextDouble();
				
				//������Ʒ����
				System.out.println("��������Ʒ����");
				int count=sc.nextInt();
				
				//����һ����Ʒ����
			GoodsItem item=new GoodsItem(name,id,price,count);
			
			//������뼯��
			items.add(item);
			
			break;
			}
		
			
		}
	}

	
	
	private static void initGoods(ArrayList<GoodsItem> items) throws IOException {
		// TODO Auto-generated method stub
		
		//��GoodsItem.txt�ı����뼯��
		BufferedReader br=new BufferedReader(new FileReader("GoodsItem.txt"));
		
		String line;
		while((line=br.readLine())!=null){
			
			//���ַ����и��������
			String[] split = line.split(",");
			
			//��ȡƷ��
			String name=split[0];
			
			//��ȡ����
			String id=split[1];
			
			//��ȡ�۸�
			//�ַ���תdouble
			//parseDouble������String,����ֵDouble
			double price=Double.parseDouble(split[2]);
			
			//����
			int count=Integer.parseInt(split[3]);
			
			//������Ʒ����
			GoodsItem item=new GoodsItem(name,id,price,count);
			
			//��ӵ����
			items.add(item);
		}
		
		//�ͷ�
		br.close();
	}

}
