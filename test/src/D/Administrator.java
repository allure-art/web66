package D;

import java.util.Scanner;

public class Administrator {
	String user;
	String psw;
	void show(){
		System.out.println("管理员用户名："+user+",密码："+psw);
	}
//输入用户名的密码和方法
	void login(){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名：");
		user=input.next();
		System.out.println("请输入密码：");
		psw=input.next();
	}
	//修改密码的方法
	void modifyPsw(){
		String psw1,psw2;
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.println("请输入密码：");
			psw1=input.next();
			System.out.println("请再次输入密码：");
			psw2=input.next();
			if(psw1.equals(psw2)){
				psw=psw1;
				System.out.println("修改密码成功，您的密码为："+psw);
				break;
			}else{
				System.out.println("修改密码不成功，两次密码不一致");
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

}
