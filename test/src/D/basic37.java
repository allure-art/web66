package D;

import java.io.FileReader;

public class basic37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //���������쳣    ArithmeticException
		int a=5,b=0;
	    int c=a/b;
	    System.out.println(c);
	    //�����±�Խ���쳣    ArrayIndexOutOfBoundsException
	    int arr[]={5,6,7,8,9};
	    //System.out.println(arr[10]);
	    System.out.println("��  ��");
	    //�ն����쳣  NullPionterException
	    String str=null;
	    System.out.println(str.length());
	    //���ݸ�ʽ�쳣    NumberFormatException
	    String num1="�й�";
	    String num2="88";
	    //���ַ���ת��������
	    int score1=Integer.parseInt(num1);
	    int score2=Integer.parseInt(num2);
	    System.out.println("�ܷ֣�"+(score1+score2));
	    //�ļ��Ҳ����쳣   FileNotFoundException
	    //FileReader fr=new FileReader("e:\\test.txt");
	    System.out.println("hello");
	}

}
