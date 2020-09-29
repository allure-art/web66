package D;

import java.util.Scanner;

public class demo23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //switch-case语句
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的比赛名次：");
		int mc=input.nextInt();
		switch(mc){
		case 1:
			System.out.println("参加夏令营");
			System.out.println("奖励人民币10000元");
			break;
		case 2:
			System.out.println("奖励笔记本");
			break;
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("奖励移动转盘");
			break;
			default:System.out.println("没有奖励");
		}
	}

}
