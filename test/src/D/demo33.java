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
        //ѭ���������̶�
        while(true){
        	System.out.println("�Ƿ��������y/n");
        	aa=input.next();
        	if(aa.equals("n")){
        		break;
        	}
        }
        System.out.println("�������");
	}

}
