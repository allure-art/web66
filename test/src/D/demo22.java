package D;

import java.util.Scanner;

public class demo22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入是否为会员(y/n)");
        String v=input.next();
        if(v.equals("y")){
        	System.out.println("请输入会员积分：");
        	int jf=input.nextInt();
        	if(jf>800) System.out.println("享受6折优惠");
        	else if(jf>4000) System.out.println("享受7折优惠");
        	else if(jf>2000) System.out.println("享受8折优惠");
        	else System.out.println("享受9折优惠");
        }else{
        	System.out.println("非会员，没有折扣");
        }
	}

}
