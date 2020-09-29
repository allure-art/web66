package D;

import java.util.Scanner;

public class demo32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个值：");
        int num=input.nextInt();
        System.out.println("根据这个值可以输出以下加法表：");
        //for语句里面两个分号不能缺少
        for(int i=0,j=num;i<=num;i++,j--){
        	System.out.println(i+"+"+j+"="+num);
      
        }
        int m;
        //for语句里面两个分号不能少
        for(;;){
        	System.out.println("请输入一个值：");
        	m=input.nextInt();
        	if(m==0){
        		break;
        	}
        }
	}

}
