package D;

import java.util.Scanner;

public class demo20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("��¼�˵�(��һ��)");
        System.out.println("1.��¼");
        System.out.println("2.�˳�");
        System.out.println("�����룺");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        switch(n){
        case 1:
        	System.out.println("���˵�(�ڶ���)");
        	System.out.println("1.�ͻ���Ϣ����");
        	System.out.println("2.�������");
        	System.out.println("3.�������");
        	System.out.println("4.ע��");
        	System.out.println("������:");
        	int m=input.nextInt();
        	switch(m){
        	case 1:
				System.out.println("���˵�(�ڶ���)");
				System.out.println("1.�ͻ���Ϣ����");
				System.out.println("2.�������");
				System.out.println("3.�������");
				System.out.println("4.ע��");
				break;
			case 2:
				System.out.println("���˵�(�ڶ���)");
				System.out.println("1.�ͻ���Ϣ����");
				System.out.println("2.�������");
				System.out.println("3.�������");
				
				break;
        	}
        	break;
        case 2:System.out.println("�������");
        }
	}

}
	