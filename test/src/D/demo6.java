package D;

import java.util.Scanner;

public class demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("******���ѵ�******");
        System.out.println("������Ʒ\t����\t����\t���");
        int tprice=245;
        int  tPrice=245;
		int sPrice=570;
		int pPrice=320;
		System.out.println("T��\t��"+tPrice+"\t2\t��"+tPrice*2);
		System.out.println("����Ь\t��"+sPrice+"\t1\t��"+sPrice*1);
		System.out.println("������\t��"+pPrice+"\t1\t��"+pPrice*1);
		System.out.println("�ۿۣ�8��");
		double total=(tPrice*2+sPrice*1+pPrice*1)*0.8;
		System.out.println("�����ܽ�"+total);
		Scanner iii=new Scanner(System.in);
		System.out.print("ʵ�ʽ��ѣ���");
		int money=iii.nextInt();
		System.out.println("��Ǯ��"+(money-total));
		//�����ǴӸ����ͱ������
		int jf=(int)(total*3/100);
		System.out.println("���ι�������õĻ����ǣ�"+jf);
	}

}
