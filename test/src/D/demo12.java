package D;

import java.util.Scanner;

public class demo12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("������a��ֵ��");
        int a=input.nextInt();
        System.out.println("������b��ֵ��");
        int b=input.nextInt();
        if(a%b==0||a+b>1000){
        	System.out.println(a);
        }else{
        	System.out.println(b);
        }
	}

}
