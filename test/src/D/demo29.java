package D;

import java.util.Scanner;

public class demo29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("��ӭʹ��shopping����ϵͳ");
        System.out.println("********");
        System.out.println("\t1.�ͻ���Ϣ����");
        System.out.println("\t2.�������");
        System.out.println("\t3.�������");
        System.out.println("\t4.ע��");
        System.out.println("********");
        System.out.println("��ѡ���������֣�");
        int num=input.nextInt();
        while(true){
        	if(num<=4){
        		switch(num){
        		case 1:System.out.println("ִ�пͻ���Ϣ����ģ��");
        		break;
        		case 2:System.out.println("ִ�й������");
        		break;
        		case 3:System.out.println("ִ���������");
        		break;
        		case 4:System.out.println("ִ��ע��");
        		break;
        		}
        		break;
        	}else{
        		System.out.println("���������������������");
        		num=input.nextInt();
        	}
        }
        System.out.println("�������");
	}

}
