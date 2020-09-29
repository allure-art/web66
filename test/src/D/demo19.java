package D;

import java.util.Scanner;

public class demo19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("是否是会员（y/n):");
        String v=input.next();
        if(v.equals("y")){
        	System.out.println("请输入会员积分：");
        	int num=input.nextInt();
        	//镶嵌复杂分支结构
        	if(num>=8000) System.out.println("该会员享受的折扣是6折");
        	else if(num>=4000)	System.out.println("该会员享受的折扣是7折");
        	else if(num>=2000)  System.out.println("该会员享受的折扣是8折");
        }else{
        	System.out.println("你不是会员，没有折扣");
        }
	}

}
