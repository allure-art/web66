package D;

import java.util.Scanner;

public class Customer {
     int cardNum;
     int jf;
     String cardType;
     //得到顾客会员号的方法
     int getCardNum(){
    	 cardNum=(int)(Math.random()*10000);
    	 return cardNum;
     }
     void show(){
    	 System.out.println("会员号是："+this.cardNum+",会员积分："+this.jf+",会员卡类型："+this.cardType);
     }
     void methd(){
    	 Scanner input=new Scanner(System.in);
    	 System.out.println("请输入您的积分：");
    	 jf=input.nextInt();
    	 System.out.println("请输入卡类型：");
    	 cardType=input.next();
    	 if((cardType.equals("金卡")&&jf>1000)||(cardType.equals("金卡")&&jf>3000	)){
    		 jf+=500;
    	 }
    	 getCardNum();
    	 show();
     }
     int add(){
    	 return(int)(3.0+4.0);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer cc=new Customer();
        cc.methd();
        int sum=cc.add();
        System.out.println(sum);
        if(sum>6){
        	sum+=6;
        	int i=100;
        	System.out.println(i);
        }
        //变量作用范围
        //System.out.println(i);
        int num=99;
        System.out.println(num);
	}

}
