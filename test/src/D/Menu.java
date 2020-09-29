package D;

import java.util.Scanner;

public class Menu {
        Scanner input=new Scanner(System.in);
        void show(){
        	System.out.println("欢迎进入我行我素购物管理系统\n\t1.登录系统\n\t2.退出\n******请输入数字：");
        menu();
        }
        void menu(){
        	int num=input.nextInt();
        	if(num==1){
        		Manager m=new Manager();
        		String user,psw;
        		while(true){
        			System.out.println("请输入用户名：");
        			user=input.next();
        			System.out.println("请输入密码：");
        			psw=input.next();
        			if(user.equals(m.user)&&psw.equals(m.psw)){
        				System.out.println("@@登录成功，欢迎："+user);
        				break;
        			}else{
        				System.out.println("用户名或密码错误");
        			}
        		}
        		menu1();
        	}else if(num==2){
        		exit();
        	}
        }
        void menu1(){
        	System.out.println("******欢迎进入我行我素购物管理系统主菜单\n\t1.客户信息管理\n\t2.真情回馈\n******\n请输入数字：");
        	Scanner input=new Scanner(System.in);
        	int num=input.nextInt();
        	if(num==1){
        		System.out.println("\t1.增加客户信息\n\t2.修改客户信息\n\t3.显示客户信息\n\t4.删除客户信息");
        	
        	}else if(num==2){
        		System.out.println("\t1.幸运大放送\n\t3.幸运抽奖");
        	}
        }
        void exit(){
        	System.out.println("程序结束");
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Menu mm=new Menu();
        mm.show();
	}

}
