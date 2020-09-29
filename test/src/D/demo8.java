package D;

import java.util.Scanner;

public class demo8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入张三的成绩：");
        int j=input.nextInt();
        System.out.println("请输入李四的成绩：");
        int m=input.nextInt();
        //复杂条件表达式--运算符的优先级
        //运算符的优先级  先算术运算  >比较运算   >逻辑运算
        //8+7>3+4&&5+6<8+9
        if((j>=9&&m>80)||(j==100&&m>=70)){
        	System.out.println("可以得到奖励");
        }
	}

}
