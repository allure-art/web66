package D;
//父类
class Person1{
	//成员属性
	private String name;
	private int age;
	//show方法是一个带参数的方法，并且参数名和类型正好跟成员属性相同，
	//在方法体中要访问成员属性一定要使用this，其他情况this可以用也可以省略
	public void show(){
		System.out.println("姓名："+this.name+"，年龄："+age);
	}
	public Person1(){
		System.out.println("你真是个大傻逼！");
	}
	public Person1(String name){
		System.out.println("带参数的构造方法");
	}
	//自动生成set和get方法
	public String setName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}
//子类
class Teacher1 extends Person1{
	public Teacher1(){
		super("张三");
		System.out.println("文明点，请不要爆粗！");
	}
	int tAge;
	//子类中定于与父类同名方法，称为方法覆盖，方法覆盖，在子类对象中访问不到父类的show方法
	public void show(){
		System.out.println("姓名："+111+"，年龄"+111+"教龄"+tAge);
	}
}
class Stu extends Person1{
	
}
//公共类
public class TestJc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         *Teacher1 t1=new Teacher1();
         *子类可以从父类继承属性和方法
         *t1.name="张三";
         *t1.age=35;
         *ti.tAge=7;
         *t1.show();
         */
		Teacher1 t1=new Teacher1();
		t1.setName("王明");
		t1.setAge(40);
		t1.tAge=12;
		t1.show();
		Person1 p=new Person1();
		//把教师类对象赋值给父类对象，这样是可以的，就相当于子类是的一父类个小范围
		//类型转换 子类型可以赋值给父类类型，父类类型要转子类需要强转
		Person1 p2=new Teacher1();
		//Teacher1 t2=new Person1();
		//父类类型要转子类类型需要强转
		Teacher1 t3=(Teacher1)p2;
		Person1 p3=new Stu();
		//类型转换异常 ClassCastException
		Teacher1 t4=(Teacher1)p3;
	}

}
