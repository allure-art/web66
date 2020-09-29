package D;

import java.util.Scanner;

public class demo21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入是否为会员(y/n)");
        String v=input.next();
        System.out.println("请输入购物金额：");
        int m=input.nextInt();
        //折扣后金额
        double money=0;
        if(v.equals("y")){
        	if(m>=200){
        		money=m*0.75;
        	}else{
        		money=m*0.8;
        	}
        }else{
        	if(m>=100){
        		money=m*0.9;
        	}else{
        		money=m;
        	}
        }
        System.out.println("本次购物金额：	"+money+"元"	);
	}

}
