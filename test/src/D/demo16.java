package D;

import java.util.Scanner;

public class demo16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("��������ĳɼ���");
        Scanner input=new Scanner(System.in);
        int j=input.nextInt();
        //��һ����Χ�����ֶ�
        if(j>=90){
        	System.out.println("��ĳɼ�����Ϊ������");
        }else if(j>=80){
        	System.out.println("��ĳɼ�����Ϊ������");
        }else if(j>=70){
        	System.out.println("��ĳɼ�����Ϊ���е�");
        }else if(j>=60){
        	System.out.println("��ĳɼ�����Ϊ������");
        }else{
        	System.out.println("��ĳɼ�����Ϊ��������");
        }
	}

}
