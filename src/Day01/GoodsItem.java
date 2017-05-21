package Day01;

public class GoodsItem {
	//品名
	private String name;
	//货号
	private String id;
	//售价
	private double price;
	//数量
	private int count;
	public GoodsItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsItem(String name, String id, double price2, int count) {
		super();
		this.name = name;
		this.id = id;
		this.price = price2;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
