package D;

import java.io.FileInputStream;
import java.util.Scanner;

class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}
public class basic35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //运行时异常
		//System.out.println(1/0);
		int num[]={1,2,3,4,5};
		//System.out.println("num[5]");
		String ss="中共";
		//int number=Integer.parseInt(ss);
		//System.out.println(number);
		String str=null;
		System.out.println(str.length());
		Animal aa=new Dog();
		Dog dog=(Dog)aa;
		//Cat cat=(Cat)aa;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1=input.nextInt();
		//非运行时异常
		//FileInputStream fis=new FileInputStream("D://test123.text");
		System.out.println("她是个白富美");
	}
}