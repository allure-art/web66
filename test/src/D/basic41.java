package D;

import java.util.Scanner;

public class basic41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("******�ļ��ύϵͳ******");
        Scanner input=new Scanner(System.in);
        System.out.println("�������ļ�����");
        String fn=input.next();
        System.out.println("��������������");
        String email=input.next();
        //�ļ�����ȡ
        String str=fn.substring(fn.indexOf('.')+1);
        int num1=fn.indexOf('.');
        int num2=email.indexOf('.');
        int num3=email.indexOf('@');
        if(num1!=-1&&num2!=-1&&num3!=-1&&str.equals("java")&&num2>num3){
        	System.out.println("�ļ���ȡ�ɹ���");
        }else{
        	System.out.println("�ļ���ȡʧ�ܣ�");
        }
	}

}
