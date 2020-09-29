package D;
//抽象类
abstract class Shape1{
	//成员变量
	String tt;
	//成员方法
	public void method(){
		System.out.println("抽象类可以定义普通成员方法");
	}
	//抽象方法由abstract修饰，只有方法名，没有方法体
	public abstract void show();
}
class AAA{
	
}
class Circle extends Shape1{
	public void show(){
		System.out.println("我是一个圆形");
	}
}
class Square extends Shape1{
	public void show(){
		System.out.println("我是一个方形");
	}
}
public class basic32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shape1 ss=new Circle();
        Shape1 dd=new Square();
       // Shape1 rr=new Shape1();
        ss.show();
        ss.method();
	}

}
