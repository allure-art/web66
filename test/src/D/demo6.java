package D;

import java.util.Scanner;

public class demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("******消费单******");
        System.out.println("购买物品\t单价\t个数\t金额");
        int tprice=245;
        int  tPrice=245;
		int sPrice=570;
		int pPrice=320;
		System.out.println("T恤\t￥"+tPrice+"\t2\t￥"+tPrice*2);
		System.out.println("网球鞋\t￥"+sPrice+"\t1\t￥"+sPrice*1);
		System.out.println("网球拍\t￥"+pPrice+"\t1\t￥"+pPrice*1);
		System.out.println("折扣：8折");
		double total=(tPrice*2+sPrice*1+pPrice*1)*0.8;
		System.out.println("消费总金额："+total);
		Scanner iii=new Scanner(System.in);
		System.out.print("实际交费：￥");
		int money=iii.nextInt();
		System.out.println("找钱："+(money-total));
		//积分是从浮点型变成整型
		int jf=(int)(total*3/100);
		System.out.println("本次购物所获得的积分是："+jf);
	}

}
