package D;

import java.util.Scanner;

public class demo17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("��������İ������ܳɼ���");
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        if(s<=10){
        	System.out.println("�����������Ա�");
        	String sex=input.next();
        	//�ַ�����ͨ���Ƚ�������Ƚϵĵ�ֵַ   �Ƚϵ�ֵַ������--����
        	//��ʹ�ñȽ�������Ƚ��ַ���
        	//�Ƚ��ַ�����ֵ�Ƿ������Ҫʹ��    equals(String str);
        	if("��".equals(sex)){
        		System.out.println("���������������");
        	}else if("Ů".equals(sex)){
        		System.out.println("����Ů���������");
        		}else{
        			System.out.println("������̭�ˣ�");
        		}
        }
	}

}
