package D;

import java.util.Scanner;

public class demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //true   false
		System.out.println("请输入张三的成绩：");
		Scanner input=new Scanner(System.in);
		int zScore=input.nextInt();
		boolean isBig=80>zScore;
		System.out.println("李四的成绩比张三高："+isBig);
		
	}

}
