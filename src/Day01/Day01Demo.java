package Day01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 超市小票案例
 * 功能分析:
 * 	功能1:欢迎界面主干逻辑
 * 		1.输出提示信息
 * 		2.键盘录入
 * 		3.switch匹配
 * 		4.循环(不知道多少次while(true))
 * 
 * 	功能2:添加商品
 * 		1.键盘录入商品信息
 * 		2.ID重复的判断
 * 		3.根据商品信息创建对象
 * 		4.添加到库存
 * 
 * 	功能3:查看商品
 * 		1.遍历库存中的商品
 * 		2.按照一定个格式输出
 *
 *  功能4:购买商品
 *  	1.遍历库存
 *  	2.提示用户是否需要购买
 *  	3.将购买的商品放到购物车中
 *  	
 *  功能5:打印小票
 *  	1.抬头.直接输出
 *  	2.中间,购买的商品.总价需要算出来,按格式输出
 *  	3.票脚:根据商品的数量和总来计算出来的
 *  
 *  功能6:退出
 *  	
 *  使用到的技术点:
 *  	1.输出 println()
 *  	2.键盘录入 Scanner
 *  	3.循环while/for
 *  	4.判断if/switch
 *  	5.IO
 *  	6.ArrayList(库存)
 *  	7.变量定义
 *  	8.运算符
 *  	9.类的定义
 *  	10.定义方法来完成功能
 *  
 *  实现步骤:
 *  	1.定义商品类(GoodsItem)
 *  	2.主界面主干逻辑
 *  	3.添加商品
 *  	4.查看商品
 *  	5.购买商品
 *  	6.打印小票
 *  	7.退出
 *  
 * 
 */
public class Day01Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//把商品存入集合
		ArrayList<GoodsItem> items =new ArrayList<GoodsItem>();
		initGoods(items);
		
		
		//购物车集合
		ArrayList<GoodsItem> cart=null;
		
		//输入提示信息
		Scanner sc=new Scanner(System.in);
		
		
		//可以重复进入系统
		while(true){
		//欢迎界面
		System.out.println("欢迎使用超市管理系统");
		
		System.out.println("1.添加商品");
		System.out.println("2.查看商品");
		System.out.println("3.购买商品 ");
		System.out.println("4.打印小票 ");
		System.out.println("5.退出");
		
		//键盘录入选项1-5
		System.out.println("请输入你要进行的操作:");
		int chooseNum=sc.nextInt();
		
		//通过键盘录入,switch来选择选项1-5
		switch(chooseNum){
		case 1:
			//添加商品方法
			addGoods(items);
			break;
		case 2:
			//查找商品
			findGoods(items);
			break;
		case 3:
			//购买商品
			cart=buyGoods(items);
			break;
		case 4:
			//购物车打印小票
			print(cart);
			break;
		case 5:
			//系统退出
			System.exit(0);
			break;
		default:
			System.out.println("输入错误,请重新选择");
			break;
		}
		
		}
	}
	
	private static void print(ArrayList<GoodsItem> cart) {
		// TODO Auto-generated method stub
		
		//判断购物车是有没有商品
		if(cart==null){
			System.out.println("购物车没有商品,请前往购物");
			return;
		}
		
		//当购物车有商品,打印小票
		System.out.println("\t\t欢迎光临");
		System.out.println("品名\t\t货号\t单价\t数量\t总价");
		
		//每个商品的数量相加
		int totalConut=0;
		
		//总价
		double totalPrice=0;
		
		//遍历打印
		for (int i = 0; i < cart.size(); i++) {
			GoodsItem item=cart.get(i);
			//每个商品的总价
			double price=item.getPrice()*item.getCount();
			//商品的总数量
			totalConut+=item.getCount();
			
			//总价
			totalPrice+=price;
			
			//输出每行商品
			System.out.println(item.getName()+"\t\t"+item.getId()+"\t"+
							item.getPrice()+"\t"+item.getCount()+"\t"+price);
			
		}
		
		//输出总
		System.out.println("共"+cart.size()+"种商品");
		System.out.println("共"+totalConut+"件商品");
		System.out.println("共"+totalPrice+"元");
	}

	//购买商品方法
	//1.输入商品id,判断商品是否存在
	//2.输入购买数量,库存需要减少商品数量
	//3.可以重复使用,-1表示结束
		private static ArrayList<GoodsItem> buyGoods(ArrayList<GoodsItem> items) {
			
		// TODO Auto-generated method stub
			
		
			
			
			//创建购物车集合
			ArrayList<GoodsItem> cart=new ArrayList<GoodsItem>();
			//键盘录入
			Scanner sc=new Scanner(System.in);
			
			//重复购买,使用while循环
			while(true){
				System.out.println("请输入购买商品的id(-1表示结束)");
				String id=sc.next();
				
				//判断是否有id
				for (int i = 0; i < items.size(); i++) {
					GoodsItem item=items.get(i);
					if(id.equals(item.getId())){
						
						//输入购买数量
						System.out.println("请输入购买的个数,当前剩余"+item.getCount()+"个");
						int count=sc.nextInt();
						
						//判断是否多于库存
						if(item.getCount()-count<0){
							System.out.println("库存不足,请重新输入");
						}else{
							//把键盘录入的数量存入对象中
							
							GoodsItem buyItem=new GoodsItem(item.getName(),id,item.getPrice(),count);
							
							//输出
							System.out.println("购买了"+buyItem.getName()+",数量是"+buyItem.getCount());
							
							//修改剩余的库存数量
							item.setCount(item.getCount()-count);
							
							//存入购物车
							cart.add(buyItem);
							break;
							
						}
						
					}
				}
				
				//如果为-1就暂停
				if(id.equals("-1")){
					System.out.println("结束购物");
					break;
				}
			}
			return cart;
		
	}
	//查看商品方法
	private static void findGoods(ArrayList<GoodsItem> items) {
		// TODO Auto-generated method stub
		//头
		System.out.println("\t  欢迎光临,超市有以下商品");
		System.out.println("品名\t\t货号\t单价\t库存");
		
		//体
		//拿到每个商品
		for (int i = 0; i <items.size(); i++) {
			GoodsItem item=items.get(i);
			
			//获取每个商品信息,按一定格式输出
			System.out.println(item.getName()+"\t\t"+item.getId()+"\t"+item.getPrice()+"\t"+item.getCount());
		}
		
		//脚
		System.out.println("==========以上是库存商品===========");
		
		
	}

	//添加商品方法
	private static void addGoods(ArrayList<GoodsItem> items) {
		// TODO Auto-generated method stub
		
		//输入商品的id
		Scanner sc=new Scanner(System.in);
		//使用while循环不断输入
		while(true){
		System.out.println("请输入商品的id");
		String id=sc.next();
		
		//false为不重复
		boolean flag=false;
		//遍历获得商品
		for (int i = 0; i < items.size(); i++) {
			//集合存入对象
			GoodsItem item=items.get(i);
			
			//判断是否重复
			if(id.equals(item.getId())){
				flag=true;//重复就终止
				break;
		}
		}
		
		//循环结束时flag是true
		if(flag){
			System.out.println("id重复");
		}else{
				//输入商品名称
				System.out.println("请输入商品名称");
				String name=sc.next();
				
				//输入商品价格
				System.out.println("请输入商品价格");
				Double price=sc.nextDouble();
				
				//输入商品数量
				System.out.println("请输入商品数量");
				int count=sc.nextInt();
				
				//创建一个商品对象
			GoodsItem item=new GoodsItem(name,id,price,count);
			
			//对象存入集合
			items.add(item);
			
			break;
			}
		
			
		}
	}

	
	
	private static void initGoods(ArrayList<GoodsItem> items) throws IOException {
		// TODO Auto-generated method stub
		
		//把GoodsItem.txt文本存入集合
		BufferedReader br=new BufferedReader(new FileReader("GoodsItem.txt"));
		
		String line;
		while((line=br.readLine())!=null){
			
			//把字符串切割存入数组
			String[] split = line.split(",");
			
			//获取品名
			String name=split[0];
			
			//获取货号
			String id=split[1];
			
			//获取价格
			//字符串转double
			//parseDouble参数是String,返回值Double
			double price=Double.parseDouble(split[2]);
			
			//数量
			int count=Integer.parseInt(split[3]);
			
			//创建商品对象
			GoodsItem item=new GoodsItem(name,id,price,count);
			
			//添加到库存
			items.add(item);
		}
		
		//释放
		br.close();
	}

}
