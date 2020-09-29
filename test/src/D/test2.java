package D;

import java.util.Scanner;

public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        int a[]=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
        	System.out.println("请输入学生成绩：");
        	a[i]=input.nextInt();
        	sum+=a[i];
        }
        System.out.println("学生的平均分为；"+(sum/5.0	));
        while(true){
        	System.out.println("请输入需要查询第几门课的成绩：");
        	int num=input.nextInt();
        	if(num>5){
        		break;
        	}
        	System.out.println("学生第"+num+"门课的成绩为："+a[num-1]);
        }
	}

}
