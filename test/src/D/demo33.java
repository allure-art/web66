package D;

import java.util.Scanner;

public class demo33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        String aa;
        //循环次数不固定
        while(true){
        	System.out.println("是否继续购物y/n");
        	aa=input.next();
        	if(aa.equals("n")){
        		break;
        	}
        }
        System.out.println("程序结束");
	}

}
