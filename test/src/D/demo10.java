package D;

import java.util.Scanner;

public class demo10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你的java成绩：");
        int j=input.nextInt();
        //if-else语句 1.二选一语句 2.else语句不能独立出现
        if(j>=90){
        	System.out.println("奖励");
        }else{
        	System.out.println("罚敲100行代码");
        }
	}

}
