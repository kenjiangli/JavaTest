package Day08;

import java.util.Stack;

/*
 * ArrayList��LinkedList��ʹ�û�����ͬ,���ǵײ��ʵ�ֲ�ͬ
 * 
 * ջ:ջ���Ƚ����/����ȳ������ݽṹ
 * LIFO(last in first out);
 */
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ģ��ջ�ṹ
		Stack<Integer>  stack=new Stack<Integer>();
		
		//ѹջor��ջ
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//��ջor��ջ
		System.out.println(stack.pop());//3
		System.out.println(stack.pop());//2
		System.out.println(stack.pop());//1
	}

}
