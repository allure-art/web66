package D;

import java.util.Scanner;

public class demo24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("��¼�˵�(��һ��):\n1.��¼ϵͳ\n2.�˳�");
        Scanner input=new Scanner(System.in);
        System.out.println("���������֣�");
        int num1=input.nextInt();
        switch(num1){
        case 1:
        	System.out.println("���˵�(�ڶ���):\n1.�ͻ���Ϣ����\n2.�������\n3�������\n4.ע��	");
        	System.out.println("���������֣�");
        	int num2=input.nextInt();
        	switch(num2){
        	case 1:
        		System.out.println("���˵�(�ڶ���):\n1.�ͻ���Ϣ����\n2.�������\n3.�������\n4.ע��");
        		break;
        	case 3:
        		System.out.println("���˵�(�ڶ���)\n1.�ͻ���Ϣ����\n2.�������\n3.�������\n4.ע��");
        	    break;
        	}
        case 2:
        	System.out.println("�������");
        }
	}

}
