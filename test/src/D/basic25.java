package D;

import java.util.Scanner;

public class basic25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("*****用户注册******");
        System.out.println("请输入用户名：");
        String name=input.next();
        System.out.println("请输入密码：");
        String psw=input.next();
        //对输入密码的长度做出判断
        if(psw.length()>=6){
        	System.out.println("注册成功");
        }else{
        	System.out.println("密码不能少于六位");
        }
	}

}
