package Day06;
/*
 * 正则表达式
 * 	一个一个来匹配
 * 正则表达式								被匹配的内容
字符 
a 										"a"

[] 表示取[]里面的某一个
字符类 
[abc] a、b 或 c							"b"
[^abc] 任何字符，除了 a、b 或 c（否定） 			"d"
[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围）  "a"
[0-9]									 "8"


预定义字符类 
. 任何字符（与行结束符可能匹配也可能不匹配） 			"我"
\d 数字：[0-9] 							"9"
\D 非数字： [^0-9]							"a"
\w 单词字符：[a-zA-Z_0-9]					"_"

边界匹配器 
^ 行的开头 									"a10"
$ 行的结尾 									"a10"
\b 单词边界 : 不是单词字符就算单词边界(在matches方法中没效果) ******

Greedy 数量词 
X? X，一次或一次也没有  "a1?"					 "a" "a1"
X* X，零次或多次 ,包含1次	"a1*"				 "a" "a1" "a11"		
X+ X，一次或多次 							 "a1" "a11"
X{n} X，恰好 n 次 	"a1{4}"					 "a1111"
X{n,} X，至少 n 次    "a1{5,}"				 "a11111" "a1111111"
X{n,m} X，至少 n 次，但是不超过 m 次 	 "a1{2,4}"   "a11" "a111" "a1111"
 */
public class DemoRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\develop\\jd-gui";
		
		//匹配到的 内容
		String Phone ="a1";
		
		//匹配规则
		String Regex="a1{2,4}";
		
		//进行匹配
		boolean b=Phone.matches(Regex);
		System.out.println(b);
	}

}
