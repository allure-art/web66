package D;

import java.util.Scanner;

public class demo14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("�������ع������ϵͳ>���˳齱");
        System.out.println("�������Ա�ţ�");
        //(1)ͨ�������Ա
        int castNo=input.nextInt();
        //(2)ȡ����Ա�ŵ���λ
        int num=castNo/10%10;
        //(3)���������һ������
       // Math.random();   ����һ��0-1��С��
        int r=(int)(Math.random()*4);
        //(4)�жϻ�Ա�ŵ���λ��������Ƿ����
        System.out.println(r);
        if(num==r){
        	System.out.println("��ϲ�����н��ˣ�");
        }else{
        	System.out.println("лл�ݹˣ�");
        }
	}

}
