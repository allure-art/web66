package D;

import java.util.Scanner;

public class basic25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("*****�û�ע��******");
        System.out.println("�������û�����");
        String name=input.next();
        System.out.println("���������룺");
        String psw=input.next();
        //����������ĳ��������ж�
        if(psw.length()>=6){
        	System.out.println("ע��ɹ�");
        }else{
        	System.out.println("���벻��������λ");
        }
	}

}
