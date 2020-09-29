package D;

import java.util.Scanner;

public class class38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        String num1=input.next();
        String num2=input.next();
        //把字符串转成整形，是可能出现异常语句
        try{
        	System.out.println("可能发生异常前的语句");
        	int score1=Integer.parseInt(num1);
        	System.out.println("可能发生异常后的语句");
        	int score2=Integer.parseInt(num2);
        	System.out.println("总分："+(score1/score2));
        }catch(Exception e){
        	System.out.println("这里是catch部分的语句");
        	System.out.println(e.toString());
        	System.out.println(e.getLocalizedMessage());
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        	
        }finally{
        	//不管有没有异常fianlly 块都会执行
        	//可以省略，如果有，通常把释放资源的语句块放在finally中
        	System.out.println("我在这里");
        	
        }
	}

}
