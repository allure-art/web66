package D;

import java.util.Scanner;

public class demo {

	public demo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("������һ����λ��");
        int num=input.nextInt();
        //���num�İ�λ��ʮλ�͸�λ  ����/  ����%
        int bw,sw,gw;
        bw=num/100;
        sw=num/10%10;
        gw=num%10;
        System.out.println(num+"�İ�λ"+bw);
        System.out.println(num+"��ʮλ"+sw);
        System.out.println(num+"�ĸ�λ"+gw);
	}

}
