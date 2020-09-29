package D;

import java.util.Scanner;

public class demo35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        String aa;
        for(;;){
        	System.out.println("是否继续购物y/n");
        	aa=input.next();
        	if(aa.equals("n")){
        		break;
        	}
        }
        System.out.println("程序结束");
	}

}
