package D;

import java.util.Scanner;

public class basic36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
        //�ѿ��ܳ��ֵ��쳣��������try��
			Scanner input=new Scanner(System.in);
			System.out.println("�������һ������");
			int num1=input.nextInt();
			System.out.println("������ڶ�������");
			int num2=input.nextInt();
			System.out.println("����ǰ��");
			System.out.println(num1/num2);
			System.out.println("�����");
		}
	catch(Exception e){
		//���tr�������������쳣���������쳣����catch���񣬸�ֵ��e
		System.out.println(e.toString());
	}finally{
		//�ͷ���Դ
		System.out.println("�����Ƿ����쳣��fianlly�е���䶼��ִ��");
	}
}
}