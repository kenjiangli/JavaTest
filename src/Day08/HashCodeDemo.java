package Day08;
/*
 * public native int hashCode();
 * native����,���ط���,ʵ����ʹ��c/c++д�Ĵ���
 * Object��hashCode����,Ĭ�Ϸ��ض����û���ַ��ʮλ��
 */
public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o=new Object();//hashcode
		System.out.println(Integer.toHexString(o.hashCode()));//hashcode->ת��16����
		System.out.println(o);
		
		String s2=new String("abc");
		String s3=new String("abc");
		
		// String�Լ���д��hashCode����,��hashCode���ַ������������
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	
	}
	/*
	 String ��:
		 private final char value[];
		 
	     public int hashCode() {
	        int h = hash;
	        if (h == 0 && value.length > 0) {
	            char val[] = this.value; {'a', 'b', 'c'}

	            for (int i = 0; i < 3; i++) {
	            	// i = 0:	val[i] a
	            	// h = 31 * 0 + 97;		h = 97;
	            	// i = 1:   val[i] b
	            	// h = 31 * 97 + 98;	h = 3105
	            	// i = 2:   val[i] c
	            	// h = 31 * 3105 + 99;	h = 96354
	                h = 31 * h + val[i];
	            }
	            hash = h;	// 96354
	        }
	        return h;
	    }
		 */
}
