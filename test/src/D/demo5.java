package D;

import java.util.Scanner;

public class demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //������빦��
		//����һ��ɨ��������ʵ����
		Scanner input=new Scanner(System.in);
		System.out.println("������������ʣ�");
		int gz=input.nextInt();
		System.out.println("��Ա���Ĺ�����ϸΪ��");
		double wj=gz*0.4,fz=gz*0.25;
		double total=gz+wj+fz;
		System.out.println("��������Ϊ��"+gz);
		System.out.println("��۽���Ϊ��"+wj);
		System.out.println("�������Ϊ��"+fz);
		System.out.println("Ա��нˮ�ǣ�"+total);
	}

}
