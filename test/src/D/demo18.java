package D;

import java.util.Scanner;

public class demo18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("是否是会员（y/n):");
        String v=input.next();
        System.out.println("请输入购物金额：");
        int num=input.nextInt();
        double m=0.0;
        if(v.equals("y")){
        	//会员折扣情况
        	if(num>200){
        		m=num*0.75;
        	}else{
        		m=num*0.8;
        	}
        }else if(v.equals("n")){
        	//非会员折扣情况
        	if(num>100){
        		m=num*0.9;
        	}else{
        		m=num;
        	}
        }else{
        	System.out.println("输入有误");
        }
        System.out.println("实际支付："+m);
	}

}
