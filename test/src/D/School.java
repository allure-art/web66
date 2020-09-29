package D;

import java.util.Scanner;

public class School {
       //成员属性
	String name;
	int classNum;
	int labNum;
	//成员方法
	void showMe(){
		Scanner input=new Scanner(System.in);
		name=input.next();
		classNum=input.nextInt();
		labNum=input.nextInt();
		System.out.println(name+"教育中心，有"+classNum+"个教室，"+labNum+"个机房");
	}
	//主方法通常放在公共类中
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //创建对象
		//声明对象 
		School ss;
		//为赋值对象，new类名()  实例化
		ss=new School();
		//合二为一
		School ss1=new School();
		ss1.showMe();
	}

}
