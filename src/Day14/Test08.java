package Day14;
/*8.һ����1000�ŵ�ӰƱ,����������������ȡ,Ҫ��:���ö��߳�ģ����Ʊ���̲���ӡʣ���ӰƱ������

	�������ͬʱ��Ʊ,���ö��߳�ģ��,��Ʊ���߼�ʹ��Runnable�ӿ�ʵ������ģ��
*/

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ticketSales ts=new ticketSales();
		
		Thread t1=new Thread(ts, "����1");
		Thread t2=new Thread(ts, "����2");
		t1.start();
		t2.start();
	}

}
class ticketSales implements Runnable{
	int ticketNum=1000;//����1000��Ʊ
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		
		while(true){//���ϵ���Ʊ
			if(ticketNum>0){
				
				System.out.println(name+"����һ��Ʊ,ʣ��Ʊ����"+(--ticketNum));
			}else{
				break;//��Ʊ����ʱ����ѭ��
			}
		}
	}
	
}
