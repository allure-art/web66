package D;

import java.util.Scanner;

public class demo36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("������ѧ��������");
        String name=input.next();
        int sc=0;
        int sum=0;
        for(int i=1;i<=5;i++){
        	System.out.println("�������"+i+"�Ź��γɼ���");
        	sc=input.nextInt();
        	if(sc<0){
        		System.out.println("�ɼ�������������������");
        		break;
        	}
        	sum+=sc;
        	if(i==5){
        		System.out.println(name+"5�ſε�ƽ���֣�"+sum/5);
        	}
        }
	}

}
