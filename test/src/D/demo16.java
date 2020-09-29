package D;

import java.util.Scanner;

public class demo16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("请输入你的成绩：");
        Scanner input=new Scanner(System.in);
        int j=input.nextInt();
        //将一个范围连续分段
        if(j>=90){
        	System.out.println("你的成绩评定为：优秀");
        }else if(j>=80){
        	System.out.println("你的成绩评定为：良好");
        }else if(j>=70){
        	System.out.println("你的成绩评定为：中等");
        }else if(j>=60){
        	System.out.println("你的成绩评定为：及格");
        }else{
        	System.out.println("你的成绩评定为：不及格");
        }
	}

}
