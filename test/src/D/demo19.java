package D;

import java.util.Scanner;

public class demo19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("�Ƿ��ǻ�Ա��y/n):");
        String v=input.next();
        if(v.equals("y")){
        	System.out.println("�������Ա���֣�");
        	int num=input.nextInt();
        	//��Ƕ���ӷ�֧�ṹ
        	if(num>=8000) System.out.println("�û�Ա���ܵ��ۿ���6��");
        	else if(num>=4000)	System.out.println("�û�Ա���ܵ��ۿ���7��");
        	else if(num>=2000)  System.out.println("�û�Ա���ܵ��ۿ���8��");
        }else{
        	System.out.println("�㲻�ǻ�Ա��û���ۿ�");
        }
	}

}
