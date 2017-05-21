package Day02;
/*
 * 方法重载,同一个类中,方法名一样,参数列表不一样,与返回值无关
 * 
 * 继承后方法的调用特点,子类没有,使用父类的,子类有就用父类的
 * 
 * 方法重写:子类定义一个和父类一模一样的方法
 * 
 * 重写的好处,子类决定父类的功能不够强大,子类可以扩充这个方法的功能
 * 
 * 子类比父类更强大
 */
public class Day02Override {
public static void main(String[] args) {
	SmartPhone sp=new SmartPhone();
	sp.call();
	sp.callDisplay();
}
}
class Phone{
	public void call(){
		System.out.println("打电话");
	}
}
class SmartPhone extends Phone{
	@Override
	//@Override可以帮助我们自动检测是否真的是重写方法,如果不是重写方法,会报错
	public void call(){
		System.out.println("视频通话");
	}
	public void callDisplay(){
		System.out.println("显示来电号码");
		System.out.println("显示来电大头像");
	}
}