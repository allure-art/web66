package D;

import java.util.Scanner;

public class demo23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //switch-case���
		Scanner input=new Scanner(System.in);
		System.out.println("��������ı������Σ�");
		int mc=input.nextInt();
		switch(mc){
		case 1:
			System.out.println("�μ�����Ӫ");
			System.out.println("���������10000Ԫ");
			break;
		case 2:
			System.out.println("�����ʼǱ�");
			break;
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("�����ƶ�ת��");
			break;
			default:System.out.println("û�н���");
		}
	}

}
