package D;

import java.util.Scanner;

public class demo17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("请输入你的百米赛跑成绩：");
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        if(s<=10){
        	System.out.println("请输入您的性别：");
        	String sex=input.next();
        	//字符串的通过比较运算符比较的地址值   比较地址值无意义--结论
        	//不使用比较运算符比较字符串
        	//比较字符串的值是否相等需要使用    equals(String str);
        	if("男".equals(sex)){
        		System.out.println("进入男子组决赛！");
        	}else if("女".equals(sex)){
        		System.out.println("进入女子组决赛！");
        		}else{
        			System.out.println("您被淘汰了！");
        		}
        }
	}

}
