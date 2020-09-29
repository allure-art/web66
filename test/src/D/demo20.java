package D;

import java.util.Scanner;

public class demo20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("登录菜单(第一级)");
        System.out.println("1.登录");
        System.out.println("2.退出");
        System.out.println("请输入：");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        switch(n){
        case 1:
        	System.out.println("主菜单(第二级)");
        	System.out.println("1.客户信息管理");
        	System.out.println("2.购物结算");
        	System.out.println("3.真情回馈");
        	System.out.println("4.注销");
        	System.out.println("请输入:");
        	int m=input.nextInt();
        	switch(m){
        	case 1:
				System.out.println("主菜单(第二级)");
				System.out.println("1.客户信息管理");
				System.out.println("2.购物结算");
				System.out.println("3.真情回馈");
				System.out.println("4.注销");
				break;
			case 2:
				System.out.println("主菜单(第二级)");
				System.out.println("1.客户信息管理");
				System.out.println("2.购物结算");
				System.out.println("3.真情回馈");
				
				break;
        	}
        	break;
        case 2:System.out.println("程序结束");
        }
	}

}
	