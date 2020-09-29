package D;

import java.util.Scanner;

public class basic27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("******用户登录******");
        Scanner input=new Scanner(System.in);
        System.out.println("请输入用户名");
        String name=input.next();
        System.out.println("请输入密码");
        String psw=input.next();
        //将小写字母转成大写字母--可以应用于实际不区分大小写
        name=name.toUpperCase();
        if(name.equalsIgnoreCase("TOM")&&psw.equals("123456")){
        	System.out.println("登陆成功");
        }else{
        	System.out.println("用户名或密码错误");
        }
        System.out.println(name.toLowerCase());
	}

}
