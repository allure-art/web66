package D;

import java.util.Scanner;

public class demo28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("�������ع���ϵͳ>��Ʒ��ѯ");
        System.out.println("********");
        System.out.println("��ţ�\t1\t2\t3");
        System.out.println("��Ʒ����\tT��\t����Ь\t3������");
        System.out.println("********");
        System.out.println("������Ʒ��Ų�ѯ��Ʒ�۸�");
        //��ѭ��---ͨ��break�����Խ���
        String pid;
        String aa;
        while(true){
        	System.out.println("��������Ʒ��ţ�");
        	pid=input.next();
        	if(pid.equals("1"))System.out.println("T����\t��567Ԫ");
        	else if(pid.equals("2"))System.out.println("����Ь��\t��247Ԫ");
        	else if(pid.equals("3"))System.out.println("�����ģ�\t��345Ԫ");
        	else System.out.println("��Ʒ������");
        	System.out.println("�Ƿ������ѯ");
        	aa=input.next();
        	//ʹ��break ����˳�ѭ��
        	if(aa.equals("n")){
        		break;
        	}
        }
        System.out.println("��ѯ����");
	}

}
