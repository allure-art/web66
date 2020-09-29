package D;
public class basic26 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //除了String类的比较是否相等需要用equals(Object obj)方法
		//所有引用类型要比较相等都需要用equals(Object obj);
		Integer num1=new Integer(100);
		Integer num2=new Integer(100);
		System.out.println(num1==num2);
		num1=num2;
		System.out.println(num1==num2);
	}

}
