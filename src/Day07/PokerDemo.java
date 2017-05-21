package Day07;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主发牌
	按照斗地主的规则，完成洗牌发牌的动作。
	一副牌有如下内容:
	有四种花色:♣♦♠♥
	每种花色的牌 2 3 4 5 6 7 8 9 10 J Q K A
	大☺小☺
	具体规则：
		使用54张牌打乱顺序
		三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。

	♣2

	分析:
		1.准备一副牌
		2.洗牌
		3.发牌
		*/
public class PokerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//一副完整的牌
		ArrayList<String> pokers=new ArrayList<String>();
		
		//添加牌
		addPokers(pokers);
		
		//洗牌
		washPokers(pokers);
		
		//发牌
		dealPokers(pokers);

		
	}
	private static void dealPokers(ArrayList<String> pokers) {
		// TODO Auto-generated method stub
		
		//玩家1
		ArrayList<String> player01=new ArrayList<String>();
		
		//玩家2
		ArrayList<String> player02=new ArrayList<String>();
		
		//玩家3
		ArrayList<String> player03=new ArrayList<String>();
			
		//底牌
		ArrayList<String> diPai=new ArrayList<String>();
		

		// 0  1  2   3  4  5  6  7  8  9
		// ♣5 ♣Q ♣2 ♠6 ♠K ♦Q ♥K ♠7 ♥3 ♥6 ♣8 ♣3 ♠Q ♦3 ♠J ♣10 ♥2 ♣J ♦4 大王 ♦10 ♦A 
		// 玩家1: 0 3 6
		// 玩家2: 1 4 7
		// 玩家3: 2 5 8
		// 根据索引来发牌,索引 % 3 == 0发给玩家1, 索引 % 3 == 1发给玩家2, 索引 % 3 == 2发给玩家3
		// 最后3张牌的索引: 51, 52, 53
		
		for (int i = 0; i < pokers.size(); i++) {
			String poker=pokers.get(i);
			
			if(i>=51){
				diPai.add(poker);
			}
			else if(i%3==0){
				player01.add(poker);
			}else if(i%3==1){
				player02.add(poker);
			}else if(i%3==2){
				player03.add(poker);
			}
			
			
		}
		//将每个玩家的牌都打印出来
		System.out.println("玩家1的牌");
		for (String string : player01) {
			System.out.print(string+" ");
		}
		System.out.println();
		System.out.println("玩家2的牌");
		for (String string : player02) {
			System.out.print(string+" ");
		}
		System.out.println();
		System.out.println("玩家3的牌");
		for (String string : player03) {
			System.out.print(string+" ");
		}
		System.out.println();
		System.out.println("底牌");
		for (String string : diPai) {
			System.out.print(string+" ");
		}
		
	}
	/*
	 * Collections是collection集合的工具类,里面提供一些方法可以将集合中的数据进行操作
	 * static void shuffle(List<?> list)
	 */
	private static void washPokers(ArrayList<String> pokers) {
		// TODO Auto-generated method stub
		Collections.shuffle(pokers);
	}

	private static void addPokers(ArrayList<String> pokers) {
		// TODO Auto-generated method stub
		String[] colors={"♣", "♦", "♠", "♥"};
		String[] numbers={"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for (int i = 0; i < colors.length; i++) {
			//获取花色
			String color=colors[i];
			for (int j = 0; j < numbers.length; j++) {
				//获取数字
				String number=numbers[j];
				//拼接成一张牌
				String poker=color+number;
				
				//添加到一副牌中
				pokers.add(poker);
			}
		}
		
		//添加大小王
		pokers.add("大王");
		pokers.add("小王");
		
	}

}











































































