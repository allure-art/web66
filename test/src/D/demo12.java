package D;

import java.util.Scanner;

public class demo12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入a的值：");
        int a=input.nextInt();
        System.out.println("请输入b的值：");
        int b=input.nextInt();
        if(a%b==0||a+b>1000){
        	System.out.println(a);
        }else{
        	System.out.println(b);
        }
	}

}
