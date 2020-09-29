package D;

import java.util.Scanner;

public class demo36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name=input.next();
        int sc=0;
        int sum=0;
        for(int i=1;i<=5;i++){
        	System.out.println("请输入第"+i+"门功课成绩：");
        	sc=input.nextInt();
        	if(sc<0){
        		System.out.println("成绩输入有误！请重新输入");
        		break;
        	}
        	sum+=sc;
        	if(i==5){
        		System.out.println(name+"5门课的平均分："+sum/5);
        	}
        }
	}

}
