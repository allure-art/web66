package D;

import java.util.Scanner;

public class Login {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        String name;
        String psw;
        for(int i=3;i>0;i--){
        	System.out.println("请输入用户名：");
        	name=input.next();
        	System.out.println("请输入密码：");
        	psw=input.next();
        	if(psw.equals("123456")){
        		System.out.println("欢迎登录mySshopping系统！");
        		break;
        	}else{
        		System.out.println("输入有误，您还有"+(i-1)+"次机会");
        		if(i==1){
        			System.out.println("对不起！您3次输入均错误！");
        		}
        	}
        }
	}

}
