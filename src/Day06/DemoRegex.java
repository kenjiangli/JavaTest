package Day06;
/*
 * ������ʽ
 * 	һ��һ����ƥ��
 * ������ʽ								��ƥ�������
�ַ� 
a 										"a"

[] ��ʾȡ[]�����ĳһ��
�ַ��� 
[abc] a��b �� c							"b"
[^abc] �κ��ַ������� a��b �� c���񶨣� 			"d"
[a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ��  "a"
[0-9]									 "8"


Ԥ�����ַ��� 
. �κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩 			"��"
\d ���֣�[0-9] 							"9"
\D �����֣� [^0-9]							"a"
\w �����ַ���[a-zA-Z_0-9]					"_"

�߽�ƥ���� 
^ �еĿ�ͷ 									"a10"
$ �еĽ�β 									"a10"
\b ���ʱ߽� : ���ǵ����ַ����㵥�ʱ߽�(��matches������ûЧ��) ******

Greedy ������ 
X? X��һ�λ�һ��Ҳû��  "a1?"					 "a" "a1"
X* X����λ��� ,����1��	"a1*"				 "a" "a1" "a11"		
X+ X��һ�λ��� 							 "a1" "a11"
X{n} X��ǡ�� n �� 	"a1{4}"					 "a1111"
X{n,} X������ n ��    "a1{5,}"				 "a11111" "a1111111"
X{n,m} X������ n �Σ����ǲ����� m �� 	 "a1{2,4}"   "a11" "a111" "a1111"
 */
public class DemoRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\develop\\jd-gui";
		
		//ƥ�䵽�� ����
		String Phone ="a1";
		
		//ƥ�����
		String Regex="a1{2,4}";
		
		//����ƥ��
		boolean b=Phone.matches(Regex);
		System.out.println(b);
	}

}
