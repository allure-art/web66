package D;
class Teacher{
	//成员属性
	String name;
	String p;
	String c;
	int age;
	void showlnfo(){
		System.out.println(name+"老师\n专业方向："+p+"\n教授课程："+c+"\n教龄："+age);
	}
	//成员方法
}
public class basic21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Teacher t1=new Teacher();
        t1.name="王";
        t1.p="计算机技术";
        t1.c="网络设计和java程序设计";
        t1.age=15;
        t1.showlnfo();
	}

}
