package D;

import java.util.Scanner;

public class demo25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        String str="n";
        //ѭ�����
        while(str.equals("n")){
        	System.out.println("����ѧϰ����");
        	System.out.println("�����ϻ�ʵ��");
        	System.out.println("�Ƿ�������ѧϰ����(y/n)");
        	str=input.next();
        }
        System.out.println("�������");
	}

}
