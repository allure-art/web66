package D;

import java.util.Scanner;

public class demo29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("欢迎使用shopping管理系统");
        System.out.println("********");
        System.out.println("\t1.客户信息管理");
        System.out.println("\t2.购物结算");
        System.out.println("\t3.真情回馈");
        System.out.println("\t4.注销");
        System.out.println("********");
        System.out.println("请选择，输入数字：");
        int num=input.nextInt();
        while(true){
        	if(num<=4){
        		switch(num){
        		case 1:System.out.println("执行客户信息管理模块");
        		break;
        		case 2:System.out.println("执行购物结算");
        		break;
        		case 3:System.out.println("执行真情回馈");
        		break;
        		case 4:System.out.println("执行注销");
        		break;
        		}
        		break;
        	}else{
        		System.out.println("输入错误，请重新输入数字");
        		num=input.nextInt();
        	}
        }
        System.out.println("程序结束");
	}

}
