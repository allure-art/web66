package D;

import java.util.Scanner;

public class demo8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("�����������ĳɼ���");
        int j=input.nextInt();
        System.out.println("���������ĵĳɼ���");
        int m=input.nextInt();
        //�����������ʽ--����������ȼ�
        //����������ȼ�  ����������  >�Ƚ�����   >�߼�����
        //8+7>3+4&&5+6<8+9
        if((j>=9&&m>80)||(j==100&&m>=70)){
        	System.out.println("���Եõ�����");
        }
	}

}
