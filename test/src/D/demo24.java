package D;

import java.util.Scanner;

public class demo24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("登录菜单(第一级):\n1.登录系统\n2.退出");
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数字：");
        int num1=input.nextInt();
        switch(num1){
        case 1:
        	System.out.println("主菜单(第二级):\n1.客户信息管理\n2.购物结算\n3真情回馈\n4.注销	");
        	System.out.println("请输入数字：");
        	int num2=input.nextInt();
        	switch(num2){
        	case 1:
        		System.out.println("主菜单(第二级):\n1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销");
        		break;
        	case 3:
        		System.out.println("主菜单(第二级)\n1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销");
        	    break;
        	}
        case 2:
        	System.out.println("程序结束");
        }
	}

}
