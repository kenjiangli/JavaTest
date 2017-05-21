package Day08;

import java.util.Stack;

/*
 * ArrayList和LinkedList的使用基本相同,但是底层的实现不同
 * 
 * 栈:栈是先进后厨/后进先出的数据结构
 * LIFO(last in first out);
 */
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//模拟栈结构
		Stack<Integer>  stack=new Stack<Integer>();
		
		//压栈or进栈
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//弹栈or出栈
		System.out.println(stack.pop());//3
		System.out.println(stack.pop());//2
		System.out.println(stack.pop());//1
	}

}
