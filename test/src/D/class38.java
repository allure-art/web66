package D;

import java.util.Scanner;

public class class38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        String num1=input.next();
        String num2=input.next();
        //���ַ���ת�����Σ��ǿ��ܳ����쳣���
        try{
        	System.out.println("���ܷ����쳣ǰ�����");
        	int score1=Integer.parseInt(num1);
        	System.out.println("���ܷ����쳣������");
        	int score2=Integer.parseInt(num2);
        	System.out.println("�ܷ֣�"+(score1/score2));
        }catch(Exception e){
        	System.out.println("������catch���ֵ����");
        	System.out.println(e.toString());
        	System.out.println(e.getLocalizedMessage());
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        	
        }finally{
        	//������û���쳣fianlly �鶼��ִ��
        	//����ʡ�ԣ�����У�ͨ�����ͷ���Դ���������finally��
        	System.out.println("��������");
        	
        }
	}

}
