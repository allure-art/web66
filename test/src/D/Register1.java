package D;

import java.util.Scanner;

public class Register1 {
     static void verify(){
    	 System.out.println("******欢迎进入注册系统******");
    	 Scanner input=new Scanner(System.in);
    	 while(true){
    		 System.out.println("请输入用户名：");
    		 String name=input.next();
    		 System.out.println("请输入密码：");
    		 String psw=input.next();
    		 System.out.println("请再次输入密码：");
    		 String psw1=input.next();
    		 //想办法验证用户名和密码,然后退出循环
    		 if(name.length()>=3&&psw.length()>=6){
    			 if(psw.equals(psw1)){
    			 System.out.println("注册成功");
    			 break;
    		 }else{
    			 System.out.println("两个密码不一样");
    		 }
    	 }else{
    		 System.out.println("用户名的长度不能小于3，密码的长度不能小于6");
    	 }
	}

}
     public static void main(String[] args) {
 		// TODO Auto-generated method stub
 		verify();
 	}

 }
  
