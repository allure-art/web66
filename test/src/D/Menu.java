package D;

import java.util.Scanner;

public class Menu {
        Scanner input=new Scanner(System.in);
        void show(){
        	System.out.println("��ӭ�����������ع������ϵͳ\n\t1.��¼ϵͳ\n\t2.�˳�\n******���������֣�");
        menu();
        }
        void menu(){
        	int num=input.nextInt();
        	if(num==1){
        		Manager m=new Manager();
        		String user,psw;
        		while(true){
        			System.out.println("�������û�����");
        			user=input.next();
        			System.out.println("���������룺");
        			psw=input.next();
        			if(user.equals(m.user)&&psw.equals(m.psw)){
        				System.out.println("@@��¼�ɹ�����ӭ��"+user);
        				break;
        			}else{
        				System.out.println("�û������������");
        			}
        		}
        		menu1();
        	}else if(num==2){
        		exit();
        	}
        }
        void menu1(){
        	System.out.println("******��ӭ�����������ع������ϵͳ���˵�\n\t1.�ͻ���Ϣ����\n\t2.�������\n******\n���������֣�");
        	Scanner input=new Scanner(System.in);
        	int num=input.nextInt();
        	if(num==1){
        		System.out.println("\t1.���ӿͻ���Ϣ\n\t2.�޸Ŀͻ���Ϣ\n\t3.��ʾ�ͻ���Ϣ\n\t4.ɾ���ͻ���Ϣ");
        	
        	}else if(num==2){
        		System.out.println("\t1.���˴����\n\t3.���˳齱");
        	}
        }
        void exit(){
        	System.out.println("�������");
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Menu mm=new Menu();
        mm.show();
	}

}
