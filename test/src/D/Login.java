package D;

import java.util.Scanner;

public class Login {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        String name;
        String psw;
        for(int i=3;i>0;i--){
        	System.out.println("�������û�����");
        	name=input.next();
        	System.out.println("���������룺");
        	psw=input.next();
        	if(psw.equals("123456")){
        		System.out.println("��ӭ��¼mySshoppingϵͳ��");
        		break;
        	}else{
        		System.out.println("��������������"+(i-1)+"�λ���");
        		if(i==1){
        			System.out.println("�Բ�����3�����������");
        		}
        	}
        }
	}

}
