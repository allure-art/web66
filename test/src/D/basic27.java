package D;

import java.util.Scanner;

public class basic27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("******�û���¼******");
        Scanner input=new Scanner(System.in);
        System.out.println("�������û���");
        String name=input.next();
        System.out.println("����������");
        String psw=input.next();
        //��Сд��ĸת�ɴ�д��ĸ--����Ӧ����ʵ�ʲ����ִ�Сд
        name=name.toUpperCase();
        if(name.equalsIgnoreCase("TOM")&&psw.equals("123456")){
        	System.out.println("��½�ɹ�");
        }else{
        	System.out.println("�û������������");
        }
        System.out.println(name.toLowerCase());
	}

}
