package D;

import java.util.Scanner;

public class demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //完成输入功能
		//创建一个扫描器对象并实例化
		Scanner input=new Scanner(System.in);
		System.out.println("请输入基本工资：");
		int gz=input.nextInt();
		System.out.println("该员工的工资明细为：");
		double wj=gz*0.4,fz=gz*0.25;
		double total=gz+wj+fz;
		System.out.println("基本工资为："+gz);
		System.out.println("物价津贴为："+wj);
		System.out.println("房租津贴为："+fz);
		System.out.println("员工薪水是："+total);
	}

}
