package D;

import java.util.Scanner;

public class Administrator {
	String user;
	String psw;
	void show(){
		System.out.println("����Ա�û�����"+user+",���룺"+psw);
	}
//�����û���������ͷ���
	void login(){
		Scanner input=new Scanner(System.in);
		System.out.println("�������û�����");
		user=input.next();
		System.out.println("���������룺");
		psw=input.next();
	}
	//�޸�����ķ���
	void modifyPsw(){
		String psw1,psw2;
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.println("���������룺");
			psw1=input.next();
			System.out.println("���ٴ��������룺");
			psw2=input.next();
			if(psw1.equals(psw2)){
				psw=psw1;
				System.out.println("�޸�����ɹ�����������Ϊ��"+psw);
				break;
			}else{
				System.out.println("�޸����벻�ɹ����������벻һ��");
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

}
