package D;

import java.util.Scanner;

public class demo14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("我行我素购物管理系统>幸运抽奖");
        System.out.println("请输入会员号：");
        //(1)通过输入会员
        int castNo=input.nextInt();
        //(2)取出会员号第三位
        int num=castNo/10%10;
        //(3)生成随机数一个整数
       // Math.random();   生成一个0-1的小数
        int r=(int)(Math.random()*4);
        //(4)判断会员号第三位与随机数是否相等
        System.out.println(r);
        if(num==r){
        	System.out.println("恭喜您！中奖了！");
        }else{
        	System.out.println("谢谢惠顾！");
        }
	}

}
